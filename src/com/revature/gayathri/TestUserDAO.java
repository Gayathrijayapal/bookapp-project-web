package com.revature.gayathri;

public class TestUserDAO {

	
	 public static void main(String[] args) throws Exception {
		 
	        User user = new User();
	        user.setName("Gayathri");
	        user.setEmail("gayu18897@gmail.com");
	        user.setPassword("gayu123");
	 
	        UserDAO userDAO = new UserDAO();
	        userDAO.register(user);
	 }
	 
}
