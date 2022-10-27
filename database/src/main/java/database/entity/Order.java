package database.entity;

import java.util.List;

public class Order {
	
	// the list of products associted with this order - based on join of orderNumber column
	private List<OrderDetail> orderDetails;
}
