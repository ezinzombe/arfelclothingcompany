package zw.co.arfel.clothing.serviceImpl;


import org.springframework.stereotype.Service;
import zw.co.arfel.clothing.model.Orders;
import zw.co.arfel.clothing.repository.OrdersRepository;
import zw.co.arfel.clothing.service.OrdersService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * Created by tafadzwa on 7/14/17.
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Resource
    private OrdersRepository orderRepository;
    @Override
    public Orders save(Orders order) {
        return orderRepository.save(order);
    }

    @Override
    public Optional<Orders> findOne(Long id) {
        return null;
    }

    @Override
    public Optional<List<Orders>> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Boolean checkDuplicate(Orders order) {
        return null;
    }
}
