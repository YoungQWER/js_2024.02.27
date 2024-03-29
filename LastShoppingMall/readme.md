select * from users;
select * from address;
select * from nonuser;
select * from product;
select * from account;

drop table cart;
drop table users;
drop table nonuser;
drop table product;
drop table address;
drop table account;

CREATE TABLE address (
    address_no INT PRIMARY KEY,
    userid VARCHAR(20),
    addressid VARCHAR(20),
    username VARCHAR(20),
    adminCheck VARCHAR(1),
    nickname VARCHAR(20),
    address VARCHAR(100),
    addressDetail VARCHAR(50),
    deliveryRequest VARCHAR(200)
);

CREATE TABLE users(
    user_no INT PRIMARY KEY,
    userid VARCHAR(40),
    pwd VARCHAR(40),
    username VARCHAR(20),
    email VARCHAR(40),
    phone INT,
    jumin INT,
    nickname VARCHAR(20),
    admincheck VARCHAR(1)
);
 
CREATE TABLE nonUser(
    nonuser_no INT PRIMARY KEY,
    phone VARCHAR(30),
    email VARCHAR(20)
);

CREATE TABLE product (
    productKey INT PRIMARY KEY,
    productcategory VARCHAR(50) NOT NULL,
    productName VARCHAR(50) NOT NULL,
    productPrice INT NOT NULL,
    productStock INT NOT NULL,
    productDescription VARCHAR(300) NOT NULL,
    productdate DATE DEFAULT SYSDATE
);

create SEQUENCE user_no
    increment by 1
    start with 1;
    
CREATE SEQUENCE product_seq
    START WITH 1
    INCREMENT BY 1;

CREATE TRIGGER product_trigger
BEFORE INSERT ON product
FOR EACH ROW
BEGIN
    :NEW.productkey := product_seq.NEXTVAL;
END;
/

CREATE TABLE Cart (
    Cart_No INT PRIMARY KEY,
    Product_No INT,
    Product_Name VARCHAR2(50),
    Cart_Qty INT,   
    User_No INT,
    NonUser_No INT,
    FOREIGN KEY (Product_No) REFERENCES product(productKey),
    FOREIGN KEY (User_No) REFERENCES users(user_no),
    FOREIGN KEY (NonUser_No) REFERENCES nonUser(nonuser_no)
);

insert into product(productcategory, productName, productPrice, productStock, productDescription) values ('남자바지', '청바지', 20000, 200, '깔끔합니다');
insert into product(productcategory, productName, productPrice, productStock, productDescription) values ('여성바지', '반바지', 10000, 300, '깔끔합니다');

create table account(
bankName  VARCHAR2(10),
accountnum VARCHAR2(15)
 );

insert into account values(
'국민','1234-567-1234'
);
insert into account values(
'하나','7444-1144-5678'
);
insert into account values(
'신한','9458-4864-3924'
);
insert into account values(
'기업','3333-1111-2222'
);
insert into account values(
'농협','3333-1121-1585'
);
insert into account values(
'대구','1111-1111-3451'
);

commit;