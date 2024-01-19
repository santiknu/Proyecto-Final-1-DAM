CREATE DATABASE  IF NOT EXISTS `basedatosproyecto` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `basedatosproyecto`;
-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: basedatosproyecto
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `accesorios`
--

DROP TABLE IF EXISTS `accesorios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accesorios` (
  `nombre` varchar(30) NOT NULL,
  `acople` varchar(30) NOT NULL,
  `precio` int NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accesorios`
--

LOCK TABLES `accesorios` WRITE;
/*!40000 ALTER TABLE `accesorios` DISABLE KEYS */;
INSERT INTO `accesorios` VALUES ('ACOG','Mira',15),('Cargadores ampliados','Otros',20),('Cargadores dobles','Otros',25),('Empuñadura','Otros',20),('Fuego rapido','Cañon',10),('Hibrida','Mira',20),('Holografica','Mira',25),('Lanzagranadas','Cañon',15),('Punto Rojo','Mira',10),('Sensor cardiaco','Otros',30),('Silenciador','Cañon',20),('Termica','Mira',20),('Variable','Mira',30);
/*!40000 ALTER TABLE `accesorios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `armamento`
--

DROP TABLE IF EXISTS `armamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `armamento` (
  `nombre` varchar(15) NOT NULL,
  `municion` int NOT NULL,
  `principal` varchar(30) NOT NULL,
  `secundaria` varchar(30) NOT NULL,
  PRIMARY KEY (`nombre`),
  KEY `fk_armamento_principal_idx` (`principal`),
  KEY `fk_armamento_secundaria1_idx` (`secundaria`),
  CONSTRAINT `fk_armamento_principal` FOREIGN KEY (`principal`) REFERENCES `principal` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_armamento_secundaria1` FOREIGN KEY (`secundaria`) REFERENCES `secundaria` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `armamento`
--

LOCK TABLES `armamento` WRITE;
/*!40000 ALTER TABLE `armamento` DISABLE KEYS */;
INSERT INTO `armamento` VALUES ('aaaaa123',200,'M4A1','FMG9'),('aaaaa1234',200,'M4A1','FMG9'),('Armamento1',200,'ACR 6.8','Desert Eagle'),('Armamento2',400,'Barrett .50CAL','Javelin'),('Armamento3',300,'Escudo Antidisturbios','Skorpion'),('ee1234',200,'M4A1','FMG9'),('ruu34',200,'M4A1','FMG9'),('UUUU123',200,'M4A1','FMG9'),('UUUUUUU',200,'M4A1','FMG9'),('UUUUUUU2',200,'M4A1','FMG9'),('vnw',200,'M4A1','FMG9'),('vyyyyyy',200,'M4A1','FMG9'),('ww1234',200,'M4A1','FMG9');
/*!40000 ALTER TABLE `armamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personaje`
--

DROP TABLE IF EXISTS `personaje`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personaje` (
  `nombre` varchar(20) NOT NULL,
  `fondos` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personaje`
--

LOCK TABLES `personaje` WRITE;
/*!40000 ALTER TABLE `personaje` DISABLE KEYS */;
/*!40000 ALTER TABLE `personaje` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `principal`
--

DROP TABLE IF EXISTS `principal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `principal` (
  `nombre` varchar(30) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `precio` int NOT NULL,
  `camuflaje` varchar(20) DEFAULT NULL,
  `cadencia` tinyint NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `principal`
--

LOCK TABLES `principal` WRITE;
/*!40000 ALTER TABLE `principal` DISABLE KEYS */;
INSERT INTO `principal` VALUES ('AA-12','Escopeta',250,'Nieve',1),('ACR 6.8','Fusil de asalto',490,'Oro',1),('AK-47','Fusil de asalto',380,'Oro',1),('Barrett .50CAL','Francotirador',550,'Digital urbano',0),('CM901','Fusil de asalto',210,'Azul',1),('Dragunov','Francotirador',450,'Serpiente',0),('Escudo antidisturbios','Cuerpo a cuerpo',50,'Rojo',0),('FAD','Fusil de asalto',210,'Otoño',1),('G36C','Fusil de asalto',260,'Nieve',1),('L118A','Francotirador',570,'Rojo',0),('L86 LSW','Ametralladora ligera',200,'Azul',1),('M16A4','Fusil de asalto',190,'Hexagonal',0),('M4A1','Fusil de asalto',240,'Azul',1),('M60E4','Ametralladora ligera',200,'Digital urbano',1),('MG36','Ametralladora ligera',200,'Rojo',1),('MK-14','Fusil de asalto',130,'Clasico',0),('MK46','Ametralladora ligera',200,'Clasico',1),('Model 1887','Escopeta',170,'Otoño',0),('MP5','Subfusil',130,'Azul',1),('MP7','Subfusil',380,'Oro',1),('MSR','Francotirador',600,'Oro',0),('P90','Subfusil',230,'Otoño',1),('PKP Pecheneg','Ametralladora ligera',200,'Oro',1),('PM-9','Subfusil',120,'Nieve',1),('PP90M1','Subfusil',350,'Rojo',1),('Scar-L','Fusil de asalto',370,'Oro',1),('SPAS 12','Escopeta',340,'Rojo',0),('Striker','Escopeta',230,'Serpiente',0),('Type 95','Fusil de asalto',150,'Serpiente',0),('UMP45','Subfusil',240,'Oro',1);
/*!40000 ALTER TABLE `principal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `secundaria`
--

DROP TABLE IF EXISTS `secundaria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `secundaria` (
  `nombre` varchar(30) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `precio` int NOT NULL,
  `alcance` varchar(30) NOT NULL,
  PRIMARY KEY (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `secundaria`
--

LOCK TABLES `secundaria` WRITE;
/*!40000 ALTER TABLE `secundaria` DISABLE KEYS */;
INSERT INTO `secundaria` VALUES ('Desert Eagle','Pistola',170,'Largo-Medio'),('FMG9','Pistola Ametralladora',150,'Corto'),('G18','Pistola Ametralladora',160,'Corto'),('Javelin','Lanza cohetes',80,'Larga'),('Magnum .44','Pistola',150,'Medio'),('MP9','Pistola Ametralladora',140,'Corto'),('P99','Pistola',100,'Medio-Corto'),('RPG-7','Lanza cohetes',90,'Larga'),('Skorpion','Pistola Ametralladora',150,'Corto'),('Stinger','Lanza cohetes',80,'Larga'),('USP .45','Pistola',120,'Medio-Corto');
/*!40000 ALTER TABLE `secundaria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tiene`
--

DROP TABLE IF EXISTS `tiene`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tiene` (
  `armamento` varchar(15) NOT NULL,
  `accesorios` varchar(30) NOT NULL,
  PRIMARY KEY (`armamento`,`accesorios`),
  KEY `fk_armamento_has_accesorios_accesorios1_idx` (`accesorios`),
  KEY `fk_armamento_has_accesorios_armamento1_idx` (`armamento`),
  CONSTRAINT `fk_armamento_has_accesorios_accesorios1` FOREIGN KEY (`accesorios`) REFERENCES `accesorios` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_armamento_has_accesorios_armamento1` FOREIGN KEY (`armamento`) REFERENCES `armamento` (`nombre`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tiene`
--

LOCK TABLES `tiene` WRITE;
/*!40000 ALTER TABLE `tiene` DISABLE KEYS */;
INSERT INTO `tiene` VALUES ('aaaaa123','Sensor cardiaco'),('aaaaa1234','Sensor cardiaco'),('Armamento1','ACOG'),('Armamento1','Cargadores Dobles'),('Armamento1','Empuñadura'),('Armamento2','Punto Rojo'),('Armamento2','Silenciador'),('Armamento3','Lanzagranadas'),('Armamento3','Variable'),('ee1234','Sensor cardiaco'),('ruu34','Sensor cardiaco'),('UUUU123','Sensor cardiaco'),('vnw','Sensor cardiaco'),('vyyyyyy','Sensor cardiaco'),('ww1234','Punto rojo'),('ww1234','Sensor cardiaco');
/*!40000 ALTER TABLE `tiene` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usa`
--

DROP TABLE IF EXISTS `usa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usa` (
  `armamento` varchar(20) NOT NULL,
  `nombre` varchar(15) NOT NULL,
  PRIMARY KEY (`nombre`,`armamento`),
  KEY `fk_armamento_has_personaje_personaje1_idx` (`armamento`),
  KEY `fk_armamento_has_personaje_armamento1_idx` (`nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usa`
--

LOCK TABLES `usa` WRITE;
/*!40000 ALTER TABLE `usa` DISABLE KEYS */;
INSERT INTO `usa` VALUES ('Armamento1','Santi'),('Armamento3','Santi');
/*!40000 ALTER TABLE `usa` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-29 23:36:05
