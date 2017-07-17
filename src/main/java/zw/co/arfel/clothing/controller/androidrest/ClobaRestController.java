package zw.co.arfel.clothing.controller.androidrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zw.co.arfel.clothing.model.Customer;
import zw.co.arfel.clothing.model.ServerResponse;
import zw.co.arfel.clothing.service.CustomerService;

/**
 * Created by dilonne on 7/12/17.
 */
@RestController
@RequestMapping(value="/cloba")
public class ClobaRestController {
    @Autowired
    CustomerService customerService;

    /*----------------------- handles login requests-------------------------*/

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ServerResponse getCustomer(@RequestParam(value = "accountNumber") String accountNumber, @RequestParam("password") String password) {

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"+ accountNumber);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+password);
        ServerResponse serverResponse = new ServerResponse();

        Boolean hasValidCredentials = customerService.hasValidCredentials(accountNumber, password);

        if(hasValidCredentials){
            serverResponse.setSuccess(1);
            serverResponse.setMessage("Customer Successfully logged");
        }else{
            serverResponse.setSuccess(0);
            serverResponse.setMessage("Wrong username or password");
        }
       return serverResponse;
    }


    /*----------------------- handles registration requests-------------------------*/
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String createCustomer(@RequestBody Customer customer) {

        System.out.println("++++++++++++++++++++++++++++++++++++++" + customer);
        customerService.save(customer);
        return "";

    }

}
