package zw.co.arfel.clothing.repository;

import org.springframework.data.repository.CrudRepository;
import zw.co.arfel.clothing.model.Orders;

/**
 * Created by tafadzwa on 7/14/17.
 */
public interface OrdersRepository extends CrudRepository<Orders, Long> {
}
