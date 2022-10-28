package hibernate.demo;

import java.util.Date;
import java.util.List;

import hibernate.demo.dao.CustomerDAO;
import hibernate.demo.dao.OrderDAO;
import hibernate.demo.entity.Customer;
import hibernate.demo.entity.Order;

public class HibernateDemoMain {

	public static void main(String[] args) {
		// this represents my business logic
		OrderDAO orderDao = new OrderDAO();
		
		System.out.println("------------------ single row -------------------------");
		
		Order x = orderDao.findByOrderNumber(10100);
		
		System.out.println("------------------ update row -------------------------");
			
		System.out.println(x.toString());
		
		x.setStatus("PENDING");
		x.setShippedDate(new Date());
		
		orderDao.update(x);
		
		System.out.println("------------------ query multiple rows -------------------------");
		
		List<Order> orders = orderDao.findByStatus("Cancelled");
		for ( Order order : orders ) {
			System.out.println(order);
		}
		
		System.out.println("------------------ insert -------------------------");
		
		Order newOrder = new Order();
		
		newOrder.setOrderNumber(1010000);
		newOrder.setOrderDate(new Date());
		newOrder.setRequiredDate(new Date());
		//newOrder.setShippedDate(new Date());
		newOrder.setStatus("WHATEVER");
		newOrder.setComments("Some comments about the order");
		newOrder.setCustomerNumber(103);
		
		//orderDao.insert(newOrder);
		
		System.out.println("------------------ customer query with employee object returned -------------------------");
		
		CustomerDAO customerDao = new CustomerDAO();
		
		Customer customer = customerDao.findByCustomerId(114);
		
	}
}
