drop table if exists CONTACT;
drop table if exists C_PHONE;
drop table if exists C_EMAIL;
drop table if exists C_ADDRESS;
drop table if exists USER;
drop table if exists C_DATE;
drop table if exists C_INSTANT_MESSAGING;
drop table if exists C_URL;
drop table if exists C_SOCIAL_NETWORK;

CREATE TABLE CONTACT (
  ID_contact bigint auto_increment,
  FK_ID_user bigint,
  name varchar(50),
  surname varchar(50),
  company varchar(30),
  birthday date,
  relationship varchar(100),
  note varchar(2000),
  register_date datetime,	
  last_modification datetime,
  PRIMARY KEY (ID_contact),
  KEY FK (FK_ID_user)
);

CREATE TABLE C_PHONE (
  ID_phone bigint auto_increment,
  FK_ID_contact bigint,
  number int,
  description varchar(20),
  PRIMARY KEY (ID_phone),
  KEY FK (FK_ID_contact)
);

CREATE TABLE C_EMAIL (
  ID_email bigint auto_increment,
  FK_ID_contact bigint,
  email varchar(40),
  description varchar(20),
  PRIMARY KEY (ID_email),
  KEY FK (FK_ID_contact)
);

CREATE TABLE C_ADDRESS (
  ID_address bigint auto_increment,
  FK_ID_contact bigint,
  address varchar(50),
  description varchar(20),
  PRIMARY KEY (ID_address),
  KEY FK (FK_ID_contact)
);

CREATE TABLE USER (
  ID_user bigint auto_increment,
  username varchar(30),
  password varchar(64),
  email varchar(60),
  name varchar(30),
  surname varchar(30),
  register_date datetime,
  last_modification datetime,
  PRIMARY KEY (ID_user)
);

CREATE TABLE C_DATE (
  ID_date bigint auto_increment,
  FK_ID_contact bigint,
  date Date,
  description varchar(20),
  PRIMARY KEY (ID_date),
  KEY FK (FK_ID_contact)
);

CREATE TABLE C_INSTANT_MESSAGING (
  ID_messaging bigint auto_increment,
  FK_ID_contact bigint,
  instant_messaging varchar(50),
  description varchar(20),
  PRIMARY KEY (ID_messaging),
  KEY FK (FK_ID_contact)
);

CREATE TABLE C_URL (
  ID_url bigint auto_increment,
  FK_ID_contact bigint,
  url varchar(40),
  description varchar(20),
  PRIMARY KEY (ID_url),
  KEY FK (FK_ID_contact)
);

CREATE TABLE C_SOCIAL_NETWORK (
  ID_social_network bigint auto_increment,
  FK_ID_contact bigint,
  profile varchar(50),
  description varchar(20),
  PRIMARY KEY (ID_social_network),
  KEY FK (FK_ID_contact)
);