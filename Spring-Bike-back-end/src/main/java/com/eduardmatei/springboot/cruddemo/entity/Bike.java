package com.eduardmatei.springboot.cruddemo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="bike")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Bike {

	// define fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;


	private String name;
	private String email;
	private String phone;
	private String model;
	private String serialNumber;
	private BigDecimal purchasePrice;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	private Date purchaseDate;
	private boolean contact;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public boolean isContact() {
		return contact;
	}

	public void setContact(boolean contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Bike{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", model='" + model + '\'' +
				", serialNumber='" + serialNumber + '\'' +
				", purchasePrice=" + purchasePrice +
				", purchaseDate=" + purchaseDate +
				", contact=" + contact +
				'}';
	}
}











