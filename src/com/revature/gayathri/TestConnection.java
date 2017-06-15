package com.revature.gayathri;

import java.sql.Connection;


public class TestConnection {

	 public static void main(String[] args) throws Exception{
	 
		 Connection con = ConnectionUtil.getConnection();
	        System.out.println("Connection:" + con);
	 
	 }
}
