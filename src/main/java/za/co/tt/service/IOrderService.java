package za.co.tt.service;

import za.co.tt.domain.Order;
import java.util.List;
import java.util.Optional;

public interface IOrderService extends IService<Order, Long> {
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    Order createOrder(za.co.tt.domain.OrderDto orderDto);
    Order updateOrder(Long id, Order order);
    void deleteOrder(Long id);
    List<Order> getOrdersByUserId(Long userId);
    List<Order> getOrdersByStatus(String status);
    List<Order> getAllOrdersBasic(); // Debug method
}