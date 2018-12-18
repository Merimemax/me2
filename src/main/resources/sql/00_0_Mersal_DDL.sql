CREATE DATABASE  IF NOT EXISTS rainbow;
USE rainbow;

-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: rainbow
-- ------------------------------------------------------
-- Server version	5.7.21-log

--
-- Table structure for table authority
--

-- DROP TABLE IF EXISTS authority;

CREATE TABLE authority (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  authority varchar(255) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Table structure for table call_details
--

-- DROP TABLE IF EXISTS call_details;

CREATE TABLE call_details (
  call_id bigint(20) NOT NULL AUTO_INCREMENT,
  callDatetime datetime DEFAULT NULL,
  duration int(11) DEFAULT NULL,
  fromNumber varchar(255) DEFAULT NULL,
  toNumber varchar(255) DEFAULT NULL,
  PRIMARY KEY (call_id)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Table structure for table credentials
--

-- DROP TABLE IF EXISTS credentials;

CREATE TABLE credentials (
  username varchar(255) NOT NULL,
  enabled bit(1) DEFAULT NULL,
  password varchar(255) NOT NULL,
  PRIMARY KEY (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table client
--

-- DROP TABLE IF EXISTS client;

CREATE TABLE client (
  client_id bigint(20) NOT NULL AUTO_INCREMENT,
  creditCard varchar(255) DEFAULT NULL,
  email varchar(255) DEFAULT NULL,
  firstName varchar(255) DEFAULT NULL,
  lastName varchar(255) DEFAULT NULL,
  mobileNumber varchar(255) DEFAULT NULL,
  credentialId varchar(255) DEFAULT NULL,
  PRIMARY KEY (client_id),
  KEY FK_client_credential (credentialId),
  CONSTRAINT FK_client_credential FOREIGN KEY (credentialId) REFERENCES credentials (username)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Table structure for table groups
--

-- DROP TABLE IF EXISTS groups;

CREATE TABLE groups (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  group_name varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Table structure for table groups_authority
--

-- DROP TABLE IF EXISTS groups_authority;

CREATE TABLE groups_authority (
  Groups_id bigint(20) NOT NULL,
  authority_id bigint(20) NOT NULL,
  KEY FK_ga_authority (authority_id),
  KEY FK_ga_group (Groups_id),
  CONSTRAINT FK_ga_group FOREIGN KEY (Groups_id) REFERENCES groups (id),
  CONSTRAINT FK_ga_authority FOREIGN KEY (authority_id) REFERENCES authority (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table groups_credentials
--

-- DROP TABLE IF EXISTS groups_credentials;

CREATE TABLE groups_credentials (
  Groups_id bigint(20) NOT NULL,
  userCredentials_username varchar(255) NOT NULL,
  KEY FK_gc_credential (userCredentials_username),
  KEY FK_gc_group (Groups_id),
  CONSTRAINT FK_gc_credential FOREIGN KEY (userCredentials_username) REFERENCES credentials (username),
  CONSTRAINT FK_gc_group FOREIGN KEY (Groups_id) REFERENCES groups (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Table structure for table `user`
--

-- DROP TABLE IF EXISTS user;
CREATE TABLE user (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  firstName varchar(255) DEFAULT NULL,
  lastName varchar(255) DEFAULT NULL,
  credentialId varchar(255) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FK_user_credential (credentialId),
  CONSTRAINT FK_user_credential FOREIGN KEY (credentialId) REFERENCES credentials (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- DROP TABLE IF EXISTS monthly_call_cost;

CREATE TABLE monthly_call_cost (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  cost double DEFAULT NULL,
  datetime datetime DEFAULT NULL,
  duration int(11) DEFAULT NULL,
  mobileNumber varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- DROP TABLE IF EXISTS `daily_call_summary`;

CREATE TABLE daily_call_summary (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  datetime datetime DEFAULT NULL,
  duration int(11) DEFAULT NULL,
  mobileNumber varchar(255) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


