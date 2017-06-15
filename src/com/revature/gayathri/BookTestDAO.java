package com.revature.gayathri;

import java.time.LocalDate;

public class BookTestDAO {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setName("Gayathri");
		book.setPrice(250);
		book.setAuthour_id(5);
		book.setPublished_date(LocalDate.now());
		System.out.println(book);
}
}
