package com.user.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE nonUser(
		nonUserKey INT,
		email VARCHAR(40),
		username VARCHAR(20),
		pwd VARCHAR(40),
		phone INT
	);
*/
@Setter
@Getter
@ToString
public class NonUserVO {

	private int nonUserKey;
	private String email;
	private String username;
	private String pwd;
	private int phone;
}
