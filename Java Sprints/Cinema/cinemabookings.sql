CREATE DATABASE  IF NOT EXISTS `cinemabookings` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cinemabookings`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: cinemabookings
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bookings`
--

DROP TABLE IF EXISTS `bookings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bookings` (
  `bookingID` int NOT NULL AUTO_INCREMENT,
  `customer` int NOT NULL,
  `movie` int NOT NULL,
  `cinema` int NOT NULL,
  `time` varchar(45) NOT NULL,
  `seat` varchar(45) NOT NULL,
  PRIMARY KEY (`bookingID`),
  UNIQUE KEY `index5` (`movie`,`cinema`,`time`,`seat`),
  KEY `cinema_idx` (`cinema`),
  KEY `Movie_idx` (`movie`),
  KEY `Customer_idx` (`customer`) /*!80000 INVISIBLE */,
  CONSTRAINT `Cinema` FOREIGN KEY (`cinema`) REFERENCES `cinema` (`cinemaID`),
  CONSTRAINT `Customer` FOREIGN KEY (`customer`) REFERENCES `customers` (`customerID`) ON DELETE CASCADE,
  CONSTRAINT `Movie` FOREIGN KEY (`movie`) REFERENCES `movies` (`movieID`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookings`
--

LOCK TABLES `bookings` WRITE;
/*!40000 ALTER TABLE `bookings` DISABLE KEYS */;
INSERT INTO `bookings` VALUES (3,3,2,1,'11:30','E4'),(17,14,2,2,'09:00','A7'),(18,14,2,2,'14:00','A7'),(19,14,5,1,'09:00','F4'),(20,14,1,2,'16:30','F4'),(24,14,1,2,'16:30','F5'),(25,14,1,2,'16:30','F6'),(28,14,1,1,'09:00','D7'),(29,14,1,1,'09:00','D8'),(30,13,1,1,'09:00','A1'),(31,13,1,1,'09:00','E4'),(36,14,2,2,'09:00','A6'),(37,13,4,2,'16:30','D5'),(38,13,2,2,'09:00','E7'),(39,13,3,2,'09:00','A8'),(40,8,1,1,'09:00','E5'),(41,8,27,4,'19:00','A4'),(42,8,2,5,'11:30','F6'),(43,8,1,1,'11:30','A1'),(44,8,1,1,'09:00','B1'),(45,8,6,4,'14:00','A1'),(46,8,12,7,'19:00','E4'),(50,3,1,1,'09:00','E2'),(51,3,8,1,'09:00','A1'),(52,3,2,1,'14:00','E5'),(53,3,1,1,'09:00','A4'),(54,9,6,3,'11:30','F2'),(56,9,6,1,'11:30','F2'),(57,5,19,3,'14:00','E2'),(58,5,19,3,'14:00','E1'),(59,3,1,1,'09:00','A5'),(61,3,1,1,'09:00','A3'),(62,8,1,3,'11:30','C3');
/*!40000 ALTER TABLE `bookings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cinema`
--

DROP TABLE IF EXISTS `cinema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cinema` (
  `cinemaID` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `province` int NOT NULL,
  `location` varchar(45) NOT NULL,
  PRIMARY KEY (`cinemaID`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cinema`
--

LOCK TABLES `cinema` WRITE;
/*!40000 ALTER TABLE `cinema` DISABLE KEYS */;
INSERT INTO `cinema` VALUES (1,'c1',1,'Bellville'),(2,'c2',2,'Natashafontein'),(3,'c3',3,'Nicolatown'),(4,'c4',4,'Nkululekobury'),(5,'c5',5,'Natashafontein'),(6,'c6',6,'Thembi'),(7,'c7',7,'Francis'),(8,'c8',1,'Lindashire'),(9,'c9',2,'Bothmaburgh'),(10,'c10',3,'Scottchester'),(11,'c11',4,'Abrahamton'),(12,'c12',5,'Lubbeside'),(13,'c13',6,'Nieuwoudtton'),(14,'c14',7,'Takalanihaven'),(15,'c15',1,'Thembifontein'),(16,'c16',2,'Unathiland'),(17,'c17',3,'Tarynbury'),(18,'c18',4,'Thembaside'),(19,'c19',5,'Pierrestad'),(20,'c20',6,'Siphiweville'),(21,'c21',7,'Yolandi'),(22,'c22',1,'Jacobsview'),(23,'c23',2,'Charles'),(24,'c24',3,'Barendton'),(25,'c25',4,'Carmenview'),(26,'c26',5,'Liezelbury'),(27,'c27',6,'Parkerport'),(28,'c28',7,'Victorhaven'),(29,'c29',1,'Maakeborough'),(30,'c30',2,'Lizelle'),(31,'c31',3,'Louisport'),(32,'c32',4,'Isaacstad');
/*!40000 ALTER TABLE `cinema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customers` (
  `customerID` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  PRIMARY KEY (`customerID`),
  UNIQUE KEY `username_UNIQUE` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
INSERT INTO `customers` VALUES (2,'Kelebogile Mhlongo','km','km'),(3,'NAME','PssWord','UserName'),(4,'Asanda Nieuwoudt','an','an'),(5,'Takalani Erasmus','te','te'),(6,'Gugu Turner','gt','gt'),(7,'Teboho Ncube','tn','tn'),(8,'Jabulani Sibiya','js','js'),(9,'Yolandi van der Westhuizen','yw','yw'),(10,'Kelebogile Nair','kn','kn'),(11,'Nosipho Stevens','ns','ns'),(12,'Michael van Deventer','md','md'),(13,'Victoria Msomi','vm','vm'),(14,'Sizwe Rikhotso','sr','sr'),(15,'Phindile Robinson','pr','pr');
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `managers`
--

DROP TABLE IF EXISTS `managers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `managers` (
  `managerID` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `cinema` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`managerID`),
  UNIQUE KEY `cinema_UNIQUE` (`cinema`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  CONSTRAINT `cinemaID` FOREIGN KEY (`cinema`) REFERENCES `cinema` (`cinemaID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `managers`
--

LOCK TABLES `managers` WRITE;
/*!40000 ALTER TABLE `managers` DISABLE KEYS */;
INSERT INTO `managers` VALUES (1,'Clint Collins',1,'1','1'),(2,'Belinda Harmse',2,'2','2'),(3,'Greg Mashego',3,'3','3'),(4,'Jacobus Thomas',4,'4','4'),(5,'Leigh Dreyer',5,'5','5'),(6,'Shawn Nhlapo',6,'6','6'),(7,'Jabulani Joseph',7,'7','7'),(8,'Vanessa Scott',8,'8','8'),(9,'Palesa Mabunda',9,'9','9'),(10,'Takalani Fourie',10,'10','10'),(11,'Ronel Human',11,'11','11'),(12,'Zandile May',12,'12','12'),(13,'Nosipho Wright',13,'13','13'),(14,'Etienne Jackson',14,'14','14'),(15,'Unathi Moonsamy',15,'15','15'),(16,'Mandy Kunene',16,'16','16'),(17,'Alfred van Tonder',17,'17','17'),(18,'Alison Campbell',18,'18','18'),(19,'Victoria Le Roux',19,'19','19'),(20,'Matthew Lubbe',20,'20','20'),(21,'Wesley van der Walt',21,'21','21'),(22,'Sello De Wet',22,'22','22'),(23,'Wayne Du Preez',23,'23','23'),(24,'Timothy Brink',24,'24','24'),(25,'Richard Claassen',25,'25','25'),(26,'Elaine Wright',26,'26','26'),(27,'Neville Maharaj',27,'27','27'),(28,'Michelle Hughes',28,'28','28'),(29,'Palesa De Lange',29,'29','29'),(30,'Refiloe Hugo',30,'30','30'),(31,'Barry Pather',31,'31','31'),(32,'Moses Venter',32,'32','32');
/*!40000 ALTER TABLE `managers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movies`
--

DROP TABLE IF EXISTS `movies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movies` (
  `movieID` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `genre` varchar(45) NOT NULL,
  PRIMARY KEY (`movieID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies`
--

LOCK TABLES `movies` WRITE;
/*!40000 ALTER TABLE `movies` DISABLE KEYS */;
INSERT INTO `movies` VALUES (1,'Aquaman','Action'),(2,'The Simpsons','Comedy'),(3,'Jumanji','Adventure'),(4,'Sherlock Holmes','Mystery'),(5,'Avengers: Infinity War','Action'),(6,'Black Panther','Action'),(7,'Deadpool 2','Comedy'),(8,'Jurassic World: Fallen Kingdom','Sci-Fi'),(9,'The Meg','Horror'),(10,'Venom','Action'),(11,'Mission: Impossible - Fallout','Thriller'),(12,'Ready Player One','Adventure'),(13,'The Incredibles 2','Animation'),(14,'Bohemian Rhapsody','Biography'),(15,'Ant-Man and the Wasp','Action'),(16,'Solo: A Star Wars Story','Sci-Fi'),(17,'A Quiet Place','Horror'),(18,'The Predator','Adventure'),(19,'Fantastic Beasts: The Crimes of Grindelwald','Fantasy'),(20,'A Star Is Born','Music'),(21,'The Nun','Horror'),(22,'Halloween','Horror'),(23,'Ocean\'s Eight','Comedy'),(24,'Tomb Raider','Fantasy'),(25,'Red Sparrow','Thriller'),(26,'A Simple Favour','Comedy'),(27,'Rampage','Adventure'),(28,'Pacific Rim: Uprising','Sci-Fi'),(29,'The Equalizer 2','Crime'),(30,'Sicario 2: Soldado','Action'),(31,'Game Night','Comedy'),(32,'The Cloverfield Paradox','Horror'),(33,'First Man','Biography'),(34,'Skyscraper','Thriller'),(35,'Tag','Comedy'),(36,'The Ballad of Buster Scruggs','Music'),(37,'Outlaw King','Biography'),(38,'A Wrinkle in Time','Family'),(39,'Christopher Robin','Family'),(40,'Hotel Transylvania 3','Animation');
/*!40000 ALTER TABLE `movies` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-13 19:45:06
