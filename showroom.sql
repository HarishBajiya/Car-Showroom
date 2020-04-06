-- MySQL dump 10.11
--
-- Host: localhost    Database: carshowroom
-- ------------------------------------------------------
-- Server version	5.0.67-community-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `car_info`
--

DROP TABLE IF EXISTS `car_info`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `car_info` (
  `Car_ID` varchar(10) default NULL,
  `Car_Name` varchar(30) default NULL,
  `Manufacturer` varchar(10) default NULL,
  `Price` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `car_info`
--

LOCK TABLES `car_info` WRITE;
/*!40000 ALTER TABLE `car_info` DISABLE KEYS */;
INSERT INTO `car_info` VALUES ('11A','Verna','Hyundai','Rs 11,50,000'),('12B','i20','Hyundai','RS 5,37,000'),('13A','Elantra','Hyundai','10,00,000');
/*!40000 ALTER TABLE `car_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carlist`
--

DROP TABLE IF EXISTS `carlist`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `carlist` (
  `Car_Name` varchar(20) default NULL,
  `Variant` varchar(30) default NULL,
  `Price` varchar(15) default NULL,
  `Engine` varchar(20) default NULL,
  `Mileage` varchar(20) default NULL,
  `Max_Torque` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `carlist`
--

LOCK TABLES `carlist` WRITE;
/*!40000 ALTER TABLE `carlist` DISABLE KEYS */;
INSERT INTO `carlist` VALUES ('Grand i10','1.2 CRDi ERA(Diesel)','5.64 lakhs','1186','24.0 kmpl','190Nm'),('Grand i10','1.2 CRDi Sportz(Diesel)','6.55 lakhs','1186','24.0 kmpl','190Nm'),('Grand i10','1.2 CRDi ERA(Petrol)','4.56 lakhs','1186','24.0 kmpl','190Nm'),('Grand i10','1.2 CRDi Kappa(Petrol)','4.56 lakhs','1186','24.0 kmpl','190Nm'),('Grand i10','1.2 Kappa ERA(Petrol)','4.56 lakhs','1186','24.0 kmpl','190Nm'),('Grand i10','1.2 Kappa Sportz(Petrol)','5.92 lakhs','1186','24.0 kmpl','190Nm'),('Elantra','1.6 S(Diesel)','14.9 lakhs','1582','22.5 kmpl','259.88Nm'),('Elantra','1.6 SS(Diesel)','16.5 lakhs','1582','22.5 kmpl','259.88Nm'),('Elantra','1.6 SX(Diesel)','16.5 lakhs','1582','22.5 kmpl','259.88Nm'),('Elantra','2.0 S(Petrol)','12.99 lakhs','1999','14.6 kmpl','259.88Nm'),('Elantra','2.0 SX(Petrol)','16.59 lakhs','1999','14.6 kmpl','259.88Nm'),('Verna','1.6 S(Diesel)','9.2 lakhs','1582','24.8 kmpl','260Nm'),('Verna','1.6 SX(Diesel)','11.12 lakhs','1582','24.8 kmpl','260Nm'),('Elantra','2.0 S(Petrol)','8.0 lakhs','1591','17.6 kmpl','259.88Nm'),('Verna','2.0 S(Petrol)','8.0 lakhs','1591','17.6 kmpl','259.88Nm'),('Verna','2.0 SX(Petrol)','12.24 lakhs','1591','15.9 kmpl','259.88Nm'),('Creta','1.6 SX(Diesel)','11.97 lakhs','1591','21.4 kmpl','259.88Nm'),('Creta','1.6 SX(Petrol)','11.87 lakhs','1591','15.4 kmpl','259.88Nm'),('Tucson','2WD GL(Diesel)','22.47 lakhs','1995','16.4 kmpl','400Nm'),('Tucson','2WD GL(Petrol)','20.9 lakhs','1995','12.9 kmpl','400Nm');
/*!40000 ALTER TABLE `carlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `customer` (
  `Customer_ID` varchar(10) default NULL,
  `Name` varchar(30) default NULL,
  `Address` varchar(100) default NULL,
  `Phone_NO` varchar(60) default NULL,
  `Email_ID` varchar(30) default NULL,
  `Date` varchar(12) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('100A','Harish Bajiya','P300/23,\nOld Gothic Lines,\nArmy Cantt, JAIPUR','7976751521','bajiyaharish20@gamil.com','2017-07-07'),('100B','Manoj Bajiya','D-54,Kailash Nagar,Jhotwada, Jaipur','8107391945','manojkb089@gmail.com','2017-07-07'),('100C','Anuj Kumar','P45,Kailash Nagar, Jhotwada, Jaipur','7976815320','an083339@gmail.com','2017-07-15');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `customers` (
  `Customer_ID` varchar(10) default NULL,
  `Name` varchar(30) default NULL,
  `Address` varchar(100) default NULL,
  `Phone_NO` int(11) default NULL,
  `Email_ID` varchar(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `login` (
  `name` varchar(25) default NULL,
  `Username` varchar(30) default NULL,
  `Password` varchar(15) default NULL,
  `Contact_NO` varchar(14) default NULL,
  `Date_Of_Birth` varchar(16) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderlist`
--

DROP TABLE IF EXISTS `orderlist`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `orderlist` (
  `Order_NO` int(7) default NULL,
  `Customer_Name` varchar(20) default NULL,
  `Car_Name` varchar(20) default NULL,
  `Car_Price` varchar(15) default NULL,
  `Bill` varchar(15) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `orderlist`
--

LOCK TABLES `orderlist` WRITE;
/*!40000 ALTER TABLE `orderlist` DISABLE KEYS */;
INSERT INTO `orderlist` VALUES (1,'Harish Bajiya','Verna','1150000','1075250.0');
/*!40000 ALTER TABLE `orderlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `service` (
  `Name` char(20) default NULL,
  `Email_ID` varchar(30) default NULL,
  `Contact_NO` varchar(11) default NULL,
  `Registration_NO` varchar(15) default NULL,
  `Model` char(10) default NULL,
  `Mileage` varchar(10) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `service`
--

LOCK TABLES `service` WRITE;
/*!40000 ALTER TABLE `service` DISABLE KEYS */;
/*!40000 ALTER TABLE `service` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sign_up`
--

DROP TABLE IF EXISTS `sign_up`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `sign_up` (
  `First_Name` varchar(30) default NULL,
  `Last_Name` varchar(30) default NULL,
  `Email` varchar(30) default NULL,
  `Password` varchar(30) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
SET character_set_client = @saved_cs_client;

--
-- Dumping data for table `sign_up`
--

LOCK TABLES `sign_up` WRITE;
/*!40000 ALTER TABLE `sign_up` DISABLE KEYS */;
INSERT INTO `sign_up` VALUES ('Harish','Bajiya','harrybajiya2012','harrybazz'),('Manisha','Singh','manishasingh','maniya'),('manisha','singh','manisingh','2345');
/*!40000 ALTER TABLE `sign_up` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-18 20:16:16
