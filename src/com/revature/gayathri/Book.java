package com.revature.gayathri;

import java.time.LocalDate;

public class Book {

	
	private Integer id;
	 private String name;
	 private float price;
	 @Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", authour_id=" + authour_id
				+ ", published_date=" + published_date + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getAuthour_id() {
		return authour_id;
	}
	public void setAuthour_id(int authour_id) {
		this.authour_id = authour_id;
	}
	public LocalDate getPublished_date() {
		return published_date;
	}
	public void setPublished_date(LocalDate published_date) {
		this.published_date = published_date;
	}
	private int authour_id;
	 private LocalDate published_date;
}
