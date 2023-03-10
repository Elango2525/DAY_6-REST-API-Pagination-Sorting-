package com.example.StudentModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sortingtable")
public class StudentDetails {
	@Id
	private int id;
	private String name;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public StudentDetails(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public StudentDetails() {
		
	}
	public String toString() {
		return "id = " + id + " name = " + name + "price = " + price;
	}
}
