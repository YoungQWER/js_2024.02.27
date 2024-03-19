package com.user.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE address (
		addressKey INT,
		userKey INT,
		nonUserKey INT,
		userCheck VARCHAR(1),
		name VARCHAR(20),
		address VARCHAR(100),
		addressDetail VARCHAR(50),
		request VARCHAR(200),
		defaultKey VARCHAR(1)
	);
*/
@Setter
@Getter
@ToString
public class AddressVO {
		
	private int addressKey;
	private int userKey;
	private int nonUserKey;
	private String userCheck;
	private String name;
	private String address;
	private String addressDetail;
	private String request;
	private String defaultKey;

}
