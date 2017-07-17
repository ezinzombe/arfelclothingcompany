package zw.co.arfel.clothing.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.arfel.clothing.model.Customer;
import zw.co.arfel.clothing.repository.CustomerRepository;
import zw.co.arfel.clothing.service.CustomerService;

import java.util.List;
import java.util.Optional;

/**
 * Created by dilonne on 7/12/17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List <Customer> getAll() {
        return (List<Customer>)customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findOne(Long id) {
        return null;
    }

    @Override
    public Optional<List<Customer>> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Boolean checkDuplicate(Customer customer) {
        return null;
    }


    @Override
    public Boolean hasValidCredentials(String accountNumber, String password) {

        boolean result = false;
        List<Customer> customers = getAll();

        for (Customer customer : customers) {

            String password1=customer.getPassword();
            String accountNumber1=customer.getAccountNumber();

            if((password.equals(password1)) && (accountNumber.equals(accountNumber1))){
                result = true;
                break;
            }else {result = false;}
        }
        return result;
    }
}
