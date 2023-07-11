CREATE SCHEMA IF NOT EXISTS `db_test`;
USE `db_test`;


CREATE TABLE IF NOT EXISTS `country` (
  `country_id` SMALLINT NOT NULL,
  `coutry` VARCHAR(50) NULL,
  `last_update` TIMESTAMP NULL,
  PRIMARY KEY (`country_id`)
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `city` (
  `city_id` SMALLINT NOT NULL,
  `city` VARCHAR(50) NULL,
  `country_id` SMALLINT NOT NULL,
  `last_update` TIMESTAMP NULL,
  PRIMARY KEY (`city_id`, `country_id`),
  INDEX `fk_city_country1_idx` (`country_id`),
  CONSTRAINT `fk_city_country1`
    FOREIGN KEY (`country_id`)
    REFERENCES `country` (`country_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `address` (
  `address_id` SMALLINT NOT NULL,
  `address` VARCHAR(50) NULL,
  `address2` VARCHAR(50) NULL,
  `district` VARCHAR(20) NULL,
  `city_id` SMALLINT NOT NULL,
  `postal_code` VARCHAR(10) NULL,
  `phone` VARCHAR(20) NULL,
  `location` VARCHAR(20) NULL,
  `last_update` TIMESTAMP NULL,
  PRIMARY KEY (`address_id`, `city_id`),
  INDEX `fk_address_city_idx` (`city_id`),
  CONSTRAINT `fk_address_city`
    FOREIGN KEY (`city_id`)
    REFERENCES `city` (`city_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE = InnoDB;

INSERT INTO country (country_id, coutry, last_update) VALUES
(1, 'Spain', CURRENT_TIMESTAMP),
(2, 'United States', CURRENT_TIMESTAMP),
(3, 'Germany', CURRENT_TIMESTAMP),
(4, 'France', CURRENT_TIMESTAMP),
(5, 'Italy', CURRENT_TIMESTAMP),
(6, 'United Kingdom', CURRENT_TIMESTAMP),
(7, 'China', CURRENT_TIMESTAMP),
(8, 'Japan', CURRENT_TIMESTAMP),
(9, 'Brazil', CURRENT_TIMESTAMP),
(10, 'Australia', CURRENT_TIMESTAMP),
(11, 'Canada', CURRENT_TIMESTAMP),
(12, 'Mexico', CURRENT_TIMESTAMP),
(13, 'India', CURRENT_TIMESTAMP),
(14, 'Russia', CURRENT_TIMESTAMP),
(15, 'South Africa', CURRENT_TIMESTAMP),
(16, 'Argentina', CURRENT_TIMESTAMP),
(17, 'Sweden', CURRENT_TIMESTAMP),
(18, 'Netherlands', CURRENT_TIMESTAMP),
(19, 'Switzerland', CURRENT_TIMESTAMP),
(20, 'Norway', CURRENT_TIMESTAMP);

INSERT INTO city (city_id, city, country_id, last_update) VALUES
(1, 'Madrid', 1, CURRENT_TIMESTAMP),
(2, 'Barcelona', 1, CURRENT_TIMESTAMP),
(3, 'New York', 2, CURRENT_TIMESTAMP),
(4, 'Los Angeles', 2, CURRENT_TIMESTAMP),
(5, 'Berlin', 3, CURRENT_TIMESTAMP),
(6, 'Munich', 3, CURRENT_TIMESTAMP),
(7, 'Paris', 4, CURRENT_TIMESTAMP),
(8, 'Marseille', 4, CURRENT_TIMESTAMP),
(9, 'Rome', 5, CURRENT_TIMESTAMP),
(10, 'Milan', 5, CURRENT_TIMESTAMP),
(11, 'London', 6, CURRENT_TIMESTAMP),
(12, 'Birmingham', 6, CURRENT_TIMESTAMP),
(13, 'Beijing', 7, CURRENT_TIMESTAMP),
(14, 'Shanghai', 7, CURRENT_TIMESTAMP),
(15, 'Tokyo', 8, CURRENT_TIMESTAMP),
(16, 'Osaka', 8, CURRENT_TIMESTAMP),
(17, 'Sao Paulo', 9, CURRENT_TIMESTAMP),
(18, 'Rio de Janeiro', 9, CURRENT_TIMESTAMP),
(19, 'Sydney', 10, CURRENT_TIMESTAMP),
(20, 'Melbourne', 10, CURRENT_TIMESTAMP);


INSERT INTO address (address_id, address, address2, district, city_id, postal_code, phone, location, last_update) VALUES
(1, 'Street 1', 'Building A', 'District 1', 1, '12345', '123-456-7890', 'Location A', CURRENT_TIMESTAMP),
(2, 'Street 2', 'Building B', 'District 2', 2, '23456', '987-654-3210', 'Location B', CURRENT_TIMESTAMP),
(3, 'Street 3', 'Building C', 'District 3', 3, '34567', '456-789-0123', 'Location C', CURRENT_TIMESTAMP),
(4, 'Street 4', 'Building D', 'District 4', 4, '45678', '321-654-9870', 'Location D', CURRENT_TIMESTAMP),
(5, 'Street 5', 'Building E', 'District 5', 5, '56789', '654-987-0123', 'Location E', CURRENT_TIMESTAMP),
(6, 'Street 6', 'Building F', 'District 6', 6, '67890', '987-012-3456', 'Location F', CURRENT_TIMESTAMP),
(7, 'Street 7', 'Building G', 'District 7', 7, '78901', '012-345-6789', 'Location G', CURRENT_TIMESTAMP),
(8, 'Street 8', 'Building H', 'District 8', 8, '89012', '345-678-9012', 'Location H', CURRENT_TIMESTAMP),
(9, 'Street 9', 'Building I', 'District 9', 9, '90123', '678-901-2345', 'Location I', CURRENT_TIMESTAMP),
(10, 'Street 10', 'Building J', 'District 10', 10, '01234', '901-234-5678', 'Location J', CURRENT_TIMESTAMP),
(11, 'Street 11', 'Building K', 'District 11', 11, '12345', '234-567-8901', 'Location K', CURRENT_TIMESTAMP),
(12, 'Street 12', 'Building L', 'District 12', 12, '23456', '567-890-1234', 'Location L', CURRENT_TIMESTAMP),
(13, 'Street 13', 'Building M', 'District 13', 13, '34567', '890-123-4567', 'Location M', CURRENT_TIMESTAMP),
(14, 'Street 14', 'Building N', 'District 14', 14, '45678', '123-456-7890', 'Location N', CURRENT_TIMESTAMP),
(15, 'Street 15', 'Building O', 'District 15', 15, '56789', '456-789-0123', 'Location O', CURRENT_TIMESTAMP),
(16, 'Street 16', 'Building P', 'District 16', 16, '67890', '789-012-3456', 'Location P', CURRENT_TIMESTAMP),
(17, 'Street 17', 'Building Q', 'District 17', 17, '78901', '012-345-6789', 'Location Q', CURRENT_TIMESTAMP),
(18, 'Street 18', 'Building R', 'District 18', 18, '89012', '345-678-9012', 'Location R', CURRENT_TIMESTAMP),
(19, 'Street 19', 'Building S', 'District 19', 19, '90123', '678-901-2345', 'Location S', CURRENT_TIMESTAMP),
(20, 'Street 20', 'Building T', 'District 20', 20, '01234', '901-234-5678', 'Location T', CURRENT_TIMESTAMP);