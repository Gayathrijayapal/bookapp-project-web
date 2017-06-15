package com.revature.gayathri;

public class OrderLoginTest {

	
		public static void main(String[] args) throws Exception {
			UserDAO userDAO = new UserDAO();
			String email = "paulamerlin1977022@gmail.com";
			String password = "merlin97";
			User user = userDAO.login(email, password);
			System.out.println(user);
		}
}