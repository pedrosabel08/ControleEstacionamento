-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema estacionamento
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema estacionamento
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `estacionamento` DEFAULT CHARACTER SET utf8mb4 ;
USE `estacionamento` ;

-- -----------------------------------------------------
-- Table `estacionamento`.`controle_estacionamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `estacionamento`.`controle_estacionamento` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `vaga` VARCHAR(10) NULL DEFAULT NULL,
  `data` DATE NULL DEFAULT NULL,
  `hora` TIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 372
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `estacionamento`.`entradas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `estacionamento`.`entradas` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `data_entrada` DATETIME NOT NULL,
  `data_saida` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 15
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `estacionamento`.`estacionamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `estacionamento`.`estacionamento` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `entrada` DATETIME NULL DEFAULT NULL,
  `saida` DATETIME NULL DEFAULT NULL,
  `valor_pago` DECIMAL(10,2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 18
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
