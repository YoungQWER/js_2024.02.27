package com.product.dto;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE product (
    product_Key INT PRIMARY KEY,
    productcategory VARCHAR(50) NOT NULL,
    productName VARCHAR(50) NOT NULL,
    productPrice INT NOT NULL,
    productStock INT NOT NULL,
    productDescription VARCHAR(300) NOT NULL,
    productdate DATE DEFAULT SYSDATE
);
*/
@Setter
@Getter
@ToString
public class ShoppingVO {
	private int product_Key;
	private String productCategory;
	private String productName;
	private int productPrice;
	private int productStock;
	private String productDescription;
	private java.sql.Timestamp productdate;

}
	
	
	
	


