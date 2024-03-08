package com.magic.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
	create table employees(
	    id varchar2(10) not null,
	    pass varchar2(10) not null,
	    name varchar2(24),
	    lev char(1) default 'A',        -- A : 운영자, B : 일반회원
	    enter date default sysdate,     -- 등록일
	    gender char(1) default '1',     -- 1 : 남자, 2 : 여자
	    phone varchar2(30),
	    primary key(id)
	);
*/

@Setter
@Getter
@ToString

public class EmployeesVO {
	
	String id;
	String pass;
	String name;
	String lev;
	String enter;
	String gender;
	String phone;
	
}
