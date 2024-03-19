package com.user.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE users(
	id VARCHAR(20),
    pwd	VARCHAR(40),
    username VARCHAR(20),
	email VARCHAR(40),
	phone INT,
	jumin INT,
	nickname VARCHAR(20),
    admincheck VARCHAR(1)
);
*/
@Setter
@Getter
@ToString
public class UserVO {

	private String id;
	private String pwd;
	private String username;
	private String email;
	private int phone;
	private int jumin;
	private String nickname;
	private String admincheck;
}
