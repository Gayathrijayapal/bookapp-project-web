package com.revature.gayathri;

import java.time.LocalDate;

public class BookListTest {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setName("Gayathri");
		book.setPrice(250);
		book.setAuthour_id(5);
		book.setPublished_date(LocalDate.now());
		BookDAO bookDAO = new BookDAO();
		bookDAO.listbook(book);

	}
}
