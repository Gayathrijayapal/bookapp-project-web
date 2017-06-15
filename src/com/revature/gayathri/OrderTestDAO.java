package com.revature.gayathri;

import java.time.LocalDate;

public class OrderTestDAO {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Order order = new Order();
		order.setUserId(3);
		order.setBookId(3);
		order.setQuantity(2);
		order.setStatus("Cancelled");
		order.setOrderDate(LocalDate.now());
		System.out.println(order);

		
		OrderDAO orderDAO = new OrderDAO();
		orderDAO.bookOrder(order);

}
}