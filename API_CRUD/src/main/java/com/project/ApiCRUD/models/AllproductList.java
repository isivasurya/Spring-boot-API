package com.project.ApiCRUD.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AllproductList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescn() {
		return descn;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getNoofrvw() {
		return noofrvw;
	}

	public void setNoofrvw(int noofrvw) {
		this.noofrvw = noofrvw;
	}

	private String name;
	
	private double price;
	
	private String descn;
	
	private double rating;
	
	private String category;
	
	private String seller;
	
	private int stock;
	
	private int noofrvw;
	
	
	public AllproductList( String name, double price, String descn, double rating, String category,
			String seller, int stock, int noofrvw) {
		super();
		
		this.name = name;
		this.price = price;
		this.descn = descn;
		this.rating = rating;
		this.category = category;
		this.seller = seller;
		this.stock = stock;
		this.noofrvw = noofrvw;
	}

	public AllproductList() {
		super();
	}

	
	
}
