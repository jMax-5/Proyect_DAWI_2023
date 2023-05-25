-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema almacen
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `almacen` ;

-- -----------------------------------------------------
-- Schema almacen
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `almacen` DEFAULT CHARACTER SET utf8mb3 ;
USE `almacen` ;

-- -----------------------------------------------------
-- Table `almacen`.`almacenero`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`almacenero` ;

CREATE TABLE IF NOT EXISTS `almacen`.`almacenero` (
  `idalmacenero` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `login` VARCHAR(45) NULL DEFAULT NULL,
  `clave` VARCHAR(45) NULL DEFAULT NULL,
  `telefono` VARCHAR(45) NULL DEFAULT NULL,
  `correo` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idalmacenero`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `almacen`.`marca`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`marca` ;

CREATE TABLE IF NOT EXISTS `almacen`.`marca` (
  `idmarca` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idmarca`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `almacen`.`tipo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`tipo` ;

CREATE TABLE IF NOT EXISTS `almacen`.`tipo` (
  `idtipo` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idtipo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `almacen`.`proveedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`proveedor` ;

CREATE TABLE IF NOT EXISTS `almacen`.`proveedor` (
  `idproveedor` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL DEFAULT NULL,
  `ruc` VARCHAR(45) NULL DEFAULT NULL,
  `direccion` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idproveedor`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `almacen`.`producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`producto` ;

CREATE TABLE IF NOT EXISTS `almacen`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NULL DEFAULT NULL,
  `idtipo` INT NOT NULL,
  `idmarca` INT NOT NULL,
  `stock_minimo` INT NULL DEFAULT NULL,
  `stock_actual` INT NULL DEFAULT NULL,
  `fecha` DATE NULL DEFAULT NULL,
  `proveedor_idproveedor` INT NOT NULL,
  PRIMARY KEY (`idproducto`),
  INDEX `fk_producto_tipo_idx` (`idtipo` ASC) VISIBLE,
  INDEX `fk_producto_marca1_idx` (`idmarca` ASC) VISIBLE,
  INDEX `fk_producto_proveedor1_idx` (`proveedor_idproveedor` ASC) VISIBLE,
  CONSTRAINT `fk_producto_marca1`
    FOREIGN KEY (`idmarca`)
    REFERENCES `almacen`.`marca` (`idmarca`),
  CONSTRAINT `fk_producto_tipo`
    FOREIGN KEY (`idtipo`)
    REFERENCES `almacen`.`tipo` (`idtipo`),
  CONSTRAINT `fk_producto_proveedor1`
    FOREIGN KEY (`proveedor_idproveedor`)
    REFERENCES `almacen`.`proveedor` (`idproveedor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `almacen`.`entradas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`entradas` ;

CREATE TABLE IF NOT EXISTS `almacen`.`entradas` (
  `identradas` INT NOT NULL AUTO_INCREMENT,
  `idproducto` INT NOT NULL,
  `cantidad` INT NULL DEFAULT NULL,
  `precio_compra` DOUBLE NULL DEFAULT NULL,
  `fecha_registro` DATE NULL DEFAULT NULL,
  `idalmacenero` INT NOT NULL,
  PRIMARY KEY (`identradas`),
  INDEX `fk_entradas_producto1_idx` (`idproducto` ASC) VISIBLE,
  INDEX `fk_entradas_almacenero1_idx` (`idalmacenero` ASC) VISIBLE,
  CONSTRAINT `fk_entradas_almacenero1`
    FOREIGN KEY (`idalmacenero`)
    REFERENCES `almacen`.`almacenero` (`idalmacenero`),
  CONSTRAINT `fk_entradas_producto1`
    FOREIGN KEY (`idproducto`)
    REFERENCES `almacen`.`producto` (`idproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `almacen`.`salidas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `almacen`.`salidas` ;

CREATE TABLE IF NOT EXISTS `almacen`.`salidas` (
  `idsalidas` INT NOT NULL AUTO_INCREMENT,
  `fecha_registro` DATE NULL DEFAULT NULL,
  `fecha_salida` DATE NULL DEFAULT NULL,
  `idproducto` INT NOT NULL,
  `cantidad` INT NULL DEFAULT NULL,
  `responsable` VARCHAR(45) NULL DEFAULT NULL,
  `idalmacenero` INT NOT NULL,
  PRIMARY KEY (`idsalidas`),
  INDEX `fk_salidas_producto1_idx` (`idproducto` ASC) VISIBLE,
  INDEX `fk_salidas_almacenero1_idx` (`idalmacenero` ASC) VISIBLE,
  CONSTRAINT `fk_salidas_almacenero1`
    FOREIGN KEY (`idalmacenero`)
    REFERENCES `almacen`.`almacenero` (`idalmacenero`),
  CONSTRAINT `fk_salidas_producto1`
    FOREIGN KEY (`idproducto`)
    REFERENCES `almacen`.`producto` (`idproducto`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;




INSERT INTO `almacen`.`tipo` (`descripcion`) VALUES ('KJBK');
INSERT INTO `almacen`.`marca` (`descripcion`) VALUES ('JBHHJÑB');
INSERT INTO `almacen`.`proveedor` (`nombre`, `RUC`, `direccion`) VALUES ('khvlj', '123465789', 'knhvikfhgcvlhk');
INSERT INTO `almacen`.`producto` (`descripcion`, `idtipo`, `idmarca`, `stock_minimo`, `stock_actual`, `fecha`, `proveedor_idproveedor`) VALUES ('jbj', '1', '1', '12', '12', '2023-04-05', '1');
