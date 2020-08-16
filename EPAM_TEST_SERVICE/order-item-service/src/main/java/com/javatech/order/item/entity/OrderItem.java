package com.javatech.order.item.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class OrderItem {
	//mark id as primary key
		@Id
		//defining id as column name
		@GeneratedValue
		@Column
		private int id;
		//defining name as column name
		@Column
		@NotEmpty(message = "Please provide a Product Code")
		private String productCode;
		//defining age as column name
		@Column
		@NotEmpty(message = "Please provide a Product Name")
		private String productName;
		//defining email as column name
		@Column
		@NotEmpty(message = "Please provide a Product Quantity")
		private String quantity;
		public int getId() 
		{
		return id;
		}
		public void setId(int id) 
		{
		this.id = id;
		}
		public String getProductCode() {
			return productCode;
		}
		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}
		
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		
	}


