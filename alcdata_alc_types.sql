-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: alcdata
-- ------------------------------------------------------
-- Server version	5.7.9-log

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
-- Table structure for table `alc_types`
--

DROP TABLE IF EXISTS `alc_types`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `alc_types` (
  `alc_types_id` int(11) NOT NULL AUTO_INCREMENT,
  `alc_types_name` varchar(45) DEFAULT NULL,
  `alc_types_fk` int(11) NOT NULL,
  `alc_types_percent` double DEFAULT NULL,
  PRIMARY KEY (`alc_types_id`),
  UNIQUE KEY `alc_types_fk_UNIQUE` (`alc_types_fk`),
  UNIQUE KEY `alc_types_id_UNIQUE` (`alc_types_id`),
  UNIQUE KEY `alc_types_name_UNIQUE` (`alc_types_name`)
) ENGINE=InnoDB AUTO_INCREMENT=184 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alc_types`
--

LOCK TABLES `alc_types` WRITE;
/*!40000 ALTER TABLE `alc_types` DISABLE KEYS */;
INSERT INTO `alc_types` VALUES (1,'Bud Light',1,0.042),(2,'Coors Light',2,0.042),(3,'Budweiser',3,0.05),(4,'Miller Lite',4,0.0417),(5,'Corona Extra',5,0.046),(6,'Natural Light',6,0.042),(7,'Busch Light',7,0.041),(8,'Michelob Ultra Light',8,0.042),(9,'Busch',9,0.043),(10,'Heineken',10,0.05),(11,'Modelo Especial',11,0.044),(12,'Keystone Light',12,0.042),(13,'Miller High Life',13,0.046),(14,'Natural Ice',14,0.059),(15,'Bud Light Platinum',15,0.06),(16,'Pabst Blue Ribbon',16,0.0474),(17,'Bud Light Lime',17,0.042),(18,'Bud Ice',18,0.055),(19,'Yuengling Lager',19,0.044),(20,'Bud Light Lime Straw Ber Rita',20,0.08),(21,'Stella',21,0.048),(22,'Smirnoff',22,0.35),(23,'Absolut',23,0.4),(24,'Grey Goose',24,0.4),(25,'Ciroc',25,0.4),(26,'SKYY',26,0.4),(27,'Pinnacle',27,0.37),(28,'Svedka',28,0.375),(29,'Stolichnaya',29,0.4),(30,'Russian Standard',30,0.4),(31,'Ketel One',31,0.4),(32,'P.I.N.K',32,0.4),(33,'Clique',33,0.4),(34,'Artic',34,0.4),(35,'New AmsterDam',35,0.4),(36,'Eristoff',36,0.4),(37,'Kors',37,0.4),(38,'Polar Ice',38,0.4),(39,'Crystal head',39,0.4),(40,'FireBall',40,0.33),(41,'Jack Daniel\'s',41,0.41),(42,'Crown Royal',42,0.4),(43,'Jim Bean',43,0.42),(44,'Seagram\'s 7 Crown',44,0.4),(45,'Jameson',45,0.4),(46,'Black Velvet',46,0.4),(47,'Johnnie Walker',47,0.4),(48,'Marker\'s',48,0.41),(49,'Southern Comfort Whiskey',49,0.4),(50,'Evan Williams',50,0.42),(51,'Canadian Mist',51,0.4),(52,'Dewar\'s Scotch',52,0.45),(53,'Canadian Club',53,0.4),(54,'Kessler',54,0.41),(55,'Seagram\'s VO',55,0.4),(56,'Wild Turkey',56,0.39),(57,'Rich and Rare',57,0.4),(58,'Windsor',58,0.4),(59,'Botanist',59,0.45),(60,'Tanqueray',60,0.38),(61,'Beefeater',61,0.4),(62,'Bombay Saphire',62,0.47),(63,'Gordon\'s',63,0.41),(64,'Hendrick\'s',64,0.414),(65,'Fords Gin',65,0.45),(66,'Broker\'s',66,0.47),(67,'NO.3',67,0.41),(68,'Magellan',68,0.412),(69,'Caorunn',69,0.412),(70,'HayMans',70,0.42),(71,'Bloom',71,0.42),(72,'Black Friars',72,0.44),(73,'Monkey 47',73,0.4),(74,'Martin Millers',74,0.41),(75,'Williams chase',75,0.48),(76,'Big Dady J\'s',76,0.08),(77,'Tap and Die',77,0.075),(78,'Ionizer',78,0.083),(79,'Colt 45 High Gravity',79,0.085),(80,'Colt 45 Double',80,0.0561),(81,'Mickey\'s',81,0.056),(82,'Schiltz High Gravity V.S.L',82,0.085),(83,'Schiltz O.M.L',83,0.059),(84,'Red Horse',84,0.08),(85,'Haywards 5000 Super Premium',85,0.07),(86,'Big Hurt',86,0.07),(87,'Molson Brador',87,0.06),(88,'Evil Eye Ice',88,0.1),(89,'Natty Daddy',89,0.08),(90,'Schiltz Reb Bull X.L',90,0.059),(91,'Molson XXX',91,0.073),(92,'Crazy Stallion',92,0.059),(93,'Silver Thunder',93,0.086),(94,'Steel Reserve 211 Triple Export',94,0.081),(95,'Don Julio',95,0.4),(96,'Patron',96,0.4),(97,'Herradura',97,0.41),(98,'Gran Cava De Oro',98,0.45),(99,'1800',99,0.42),(100,'Cabo Wabo',100,0.4),(101,'Milagro',101,0.4),(102,'Casa Noble',102,0.4),(103,'Corralejo',103,0.42),(104,'Tres Generationes',104,0.467),(105,'Hornitos',105,0.45),(106,'Cazadores',106,0.44),(107,'Avion',107,0.41),(108,'Tres Agaves',108,0.42),(109,'El Jimador',109,0.41),(110,'El Tesoro Tequila',110,0.4),(111,'Clase Azul',111,0.4),(112,'Corzo',112,0.4),(113,'Ocho',113,0.45),(114,'Espolon',114,0.431),(115,'Macallan',115,0.414),(116,'Johnnie Walker Blue',116,0.42),(117,'Brownmore 25 years aged',117,0.4),(118,'Bunnahabhain 25 years old',118,0.4),(119,'Glenmorangie Signet',119,0.42),(120,'SpringBank 12 years old',120,0.41),(121,'Ardbeg Uigeadail',121,0.4),(122,'Laphroaig Quarter Cask',122,0.44),(123,'Chivas Regal 18 years old',123,0.42),(124,'Highland Park 25 years old',124,0.4),(125,'Lagavulin 16 years old',125,0.4),(126,'Isle of Jura 30 years old',126,0.38),(127,'Old Pulteney 35 years old',127,0.41),(128,'Glenfinddich 15 years old',128,0.4),(129,'Dalemore Selene',129,0.44),(130,'Bacardi',130,0.44),(131,'McDowell\'s No. 1',131,0.41),(132,'Captin Morgan',132,0.4),(133,'Havana Club',133,0.4),(134,'Brugal',134,0.4),(135,'Contessa',135,0.41),(136,'Cacique',136,0.4),(137,'Madira',137,0.42),(138,'Montilla',138,0.38),(139,'Appleton',139,0.4),(140,'Robert Mondavi',140,0.121),(141,'Hardys',141,0.124),(142,'Gallo',142,0.122),(143,'Concha Y Toro',143,0.12),(144,'Yellow Tail',144,0.12),(145,'Lindemans',145,0.123),(146,'Jacobs Creek',146,0.121),(147,'Blossom Hill',147,0.122),(148,'Beringer',148,0.121),(149,'Sutter Home',149,0.12),(150,'Cabernet Sauvignon',150,0.123),(151,'Merlot',151,0.14),(152,'Pinot Noir',152,0.12),(153,'Syrah or Shiraz',153,0.12),(154,'Malbec',154,0.124),(155,'Zinfandel',155,0.121),(156,'Tempranillo',156,0.123),(157,'Moet & Chandon',157,0.12),(158,'Veuve Clicquot',158,0.12),(159,'Nicolas Feuillatte',159,0.12),(160,'G.H Mumm',160,0.12),(161,'Laurent-Perrier',161,0.12),(162,'Taittinger',162,0.12),(163,'Piper-Heidsieck',163,0.12),(164,'Pommery',164,0.12),(165,'Lanson',165,0.12),(166,'Canard-Duchene',166,0.12),(167,'Duval leroy',167,0.12),(168,'Besserat De Bellfon',168,0.12),(169,'Pol Roger',169,0.12),(170,'Ayala',170,0.12),(171,'Dom Ruinart',171,0.12),(172,'Louis Roederer',172,0.12),(173,'krug',173,0.12),(174,'De Luze XO',174,0.4),(175,'Martin XO Extra Old',175,0.41),(176,'Camus XO Borderies',176,0.4),(177,'De Fussigny XO',177,0.4),(178,'Remy Martin XO 1st Cru',178,0.4),(179,'Martell XO Cordon Bleu',179,0.42),(180,'Courvoisier XO Imperial',180,0.44),(181,'Remy Martin XO Excellence',181,0.412),(182,'Hennessey XO Extra Old',182,0.42),(183,'Meukow XO Extra Old',183,0.41);
/*!40000 ALTER TABLE `alc_types` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-05-03 18:21:49
