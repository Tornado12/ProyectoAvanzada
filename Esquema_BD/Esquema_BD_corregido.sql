/*
SQLyog Enterprise - MySQL GUI v5.14
Host - 5.5.32 : Database - tornado_bd
*********************************************************************
Server version : 5.5.32
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `tornado_bd`;

USE `tornado_bd`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `auditorio` */

DROP TABLE IF EXISTS `auditorio`;

CREATE TABLE `auditorio` (
  `id_auditorio` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `video_beam` tinyint(1) DEFAULT NULL,
  `computadores` int(11) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_auditorio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `auditorio` */

/*Table structure for table `laboratorio` */

DROP TABLE IF EXISTS `laboratorio`;

CREATE TABLE `laboratorio` (
  `id_laboratorio` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `torre` varchar(20) DEFAULT NULL,
  `video_beam` tinyint(1) DEFAULT NULL,
  `computadores` int(11) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_laboratorio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `laboratorio` */

/*Table structure for table `reserva` */

DROP TABLE IF EXISTS `reserva`;

CREATE TABLE `reserva` (
  `id_reserva` int(11) NOT NULL AUTO_INCREMENT,
  `estado` char(2) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora_inicial` date DEFAULT NULL,
  `hora_final` date DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `id_espacio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_reserva`),
  KEY `FK_reserva` (`id_usuario`),
  CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `reserva` */

/*Table structure for table `salon` */

DROP TABLE IF EXISTS `salon`;

CREATE TABLE `salon` (
  `id_salon` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `torre` varchar(20) DEFAULT NULL,
  `video_beam` tinyint(1) DEFAULT NULL,
  `computadores` int(11) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_salon`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `salon` */

/*Table structure for table `teatro` */

DROP TABLE IF EXISTS `teatro`;

CREATE TABLE `teatro` (
  `id_teatro` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) DEFAULT NULL,
  `torre` varchar(20) DEFAULT NULL,
  `video_beam` tinyint(1) DEFAULT NULL,
  `computadores` int(11) DEFAULT NULL,
  `capacidad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_teatro`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `teatro` */

/*Table structure for table `tipo_espacio_auditorio` */

DROP TABLE IF EXISTS `tipo_espacio_auditorio`;

CREATE TABLE `tipo_espacio_auditorio` (
  `id_espacio` int(11) NOT NULL AUTO_INCREMENT,
  `id_auditorio` int(11) NOT NULL,
  `id_num_reserva` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_espacio`),
  KEY `FK_tipo_espacio_auditorio` (`id_auditorio`),
  KEY `FK_num_reserva` (`id_num_reserva`),
  CONSTRAINT `tipo_espacio_auditorio_ibfk_2` FOREIGN KEY (`id_num_reserva`) REFERENCES `reserva` (`id_reserva`),
  CONSTRAINT `tipo_espacio_auditorio_ibfk_1` FOREIGN KEY (`id_auditorio`) REFERENCES `auditorio` (`id_auditorio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipo_espacio_auditorio` */

/*Table structure for table `tipo_espacio_laboratorio` */

DROP TABLE IF EXISTS `tipo_espacio_laboratorio`;

CREATE TABLE `tipo_espacio_laboratorio` (
  `id_espacio` int(11) NOT NULL AUTO_INCREMENT,
  `id_laboratorio` int(11) NOT NULL,
  `id_num_reserva` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_espacio`),
  KEY `FK_tipo_espacio_laboratorio` (`id_laboratorio`),
  KEY `FK_num_espacio` (`id_num_reserva`),
  CONSTRAINT `tipo_espacio_laboratorio_ibfk_2` FOREIGN KEY (`id_num_reserva`) REFERENCES `reserva` (`id_reserva`),
  CONSTRAINT `tipo_espacio_laboratorio_ibfk_1` FOREIGN KEY (`id_laboratorio`) REFERENCES `laboratorio` (`id_laboratorio`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipo_espacio_laboratorio` */

/*Table structure for table `tipo_espacio_salon` */

DROP TABLE IF EXISTS `tipo_espacio_salon`;

CREATE TABLE `tipo_espacio_salon` (
  `id_espacio` int(11) NOT NULL AUTO_INCREMENT,
  `id_salon` int(11) NOT NULL,
  `id_num_reserva` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_espacio`),
  KEY `FK_num_reserva` (`id_num_reserva`),
  KEY `FK_id_salon` (`id_salon`),
  CONSTRAINT `tipo_espacio_salon_ibfk_2` FOREIGN KEY (`id_salon`) REFERENCES `salon` (`id_salon`),
  CONSTRAINT `tipo_espacio_salon_ibfk_1` FOREIGN KEY (`id_num_reserva`) REFERENCES `reserva` (`id_reserva`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipo_espacio_salon` */

/*Table structure for table `tipo_espacio_teatro` */

DROP TABLE IF EXISTS `tipo_espacio_teatro`;

CREATE TABLE `tipo_espacio_teatro` (
  `id_espacio` int(11) NOT NULL AUTO_INCREMENT,
  `id_teatro` int(11) NOT NULL,
  `id_num_reserva` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_espacio`),
  KEY `FK_num_reserva` (`id_num_reserva`),
  KEY `FK_num_teatro` (`id_teatro`),
  CONSTRAINT `tipo_espacio_teatro_ibfk_2` FOREIGN KEY (`id_teatro`) REFERENCES `teatro` (`id_teatro`),
  CONSTRAINT `tipo_espacio_teatro_ibfk_1` FOREIGN KEY (`id_num_reserva`) REFERENCES `reserva` (`id_reserva`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipo_espacio_teatro` */

/*Table structure for table `usuario` */

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `cedula` int(11) DEFAULT NULL,
  `cargo` varchar(100) DEFAULT NULL,
  `genero` char(1) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `rol` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

SET SQL_MODE=@OLD_SQL_MODE;