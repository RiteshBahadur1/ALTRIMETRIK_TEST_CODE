package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="STOCKS")
public class Stocks {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;
	@Column(name="stockQuote")
	private String stockQuote;
	@Column(name="companyName")
	private String companyName;
	@Column(name="date")
	private Date date;
	@Column(name="price")
	private String price;
	@Column(name="currency")
	private String currency;
	public Stocks() {}
	
	public Stocks(String stockQuote, String companyName, Date date, String price, String currency) {
		this.stockQuote = stockQuote;
		this.companyName = companyName;
		this.date = date;
		this.price = price;
		this.currency = currency;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStockQuote() {
		return stockQuote;
	}
	public void setStockQuote(String stockQuote) {
		this.stockQuote = stockQuote;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "Stocks [id=" + id + ", stockQuote=" + stockQuote + ", companyName=" + companyName + ", date=" + date
				+ ", price=" + price + ", currency=" + currency + "]";
	}
	
}
