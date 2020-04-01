CREATE TABLE CUSTOMER (
	CUSTOMER_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	NAME VARCHAR(100) NOT NULL,
	SURNAME VARCHAR(100) NOT NULL,
	EMAIL VARCHAR(100) NOT NULL,	
	BIRTHDATE VARCHAR(100) NOT NULL
);

CREATE TABLE CUSTOMERORDER(
	ORDER_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
	ORDERNAME VARCHAR(100) NOT NULL,
	COST INT(100) NOT NULL,
	CLIENT_ID BIGINT NOT NULL
);

ALTER TABLE CUSTOMERORDER ADD FOREIGN KEY (CLIENT_ID) REFERENCES CUSTOMER(CUSTOMER_ID);

CREATE SEQUENCE CUSTOMER_SEQUENCE_ID START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE ORDER_SEQUENCE_ID START WITH 1 INCREMENT BY 1;
