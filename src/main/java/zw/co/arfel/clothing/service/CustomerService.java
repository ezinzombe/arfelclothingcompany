package zw.co.arfel.clothing.service;


import zw.co.arfel.clothing.model.Customer;

import java.util.List;

/**
 * Created by dilonne on 7/12/17.
 */
public interface CustomerService  extends IService<Customer> {

    public Boolean hasValidCredentials(String username, String password);

    public List<Customer> getAll();
}
