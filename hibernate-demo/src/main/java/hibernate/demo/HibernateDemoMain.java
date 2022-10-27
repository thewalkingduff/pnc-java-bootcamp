package hibernate.demo;

import java.util.Date;
import java.util.List;

import hibernate.demo.dao.OrderDAO;
import hibernate.demo.entity.Order;

public class HibernateDemoMain {

	public static void main(String[] args) {
		// this represents my business logic
		OrderDAO orderDao = new OrderDAO();
		
		Order x = orderDao.findByOrderNumber(10100);
		
		System.out.println(x.toString());
		
		x.setStatus("PENDING");
		x.setShippedDate(new Date());
		
		orderDao.save(x);
		
		System.out.println("-------------------------------------------");
		
		List<Order> orders = orderDao.findByStatus("Cancelled");
		for ( Order order : orders ) {
			System.out.println(order);
		}
	}
}
