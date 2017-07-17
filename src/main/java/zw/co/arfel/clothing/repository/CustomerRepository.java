package zw.co.arfel.clothing.repository;

import org.springframework.data.repository.CrudRepository;
import zw.co.arfel.clothing.model.Customer;

/**
 * Created by dilonne on 7/12/17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
