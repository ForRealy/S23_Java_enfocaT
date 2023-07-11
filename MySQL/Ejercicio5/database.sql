CREATE DATABASE IF NOT EXISTS MiBaseDeDatos;
USE MiBaseDeDatos;

-- Tabla Genere
DROP TABLE IF EXISTS Genere;
CREATE TABLE Genere (
  idGenere INT PRIMARY KEY,
  Genere VARCHAR(255)
);

INSERT INTO Genere (idGenere, Genere)
VALUES
  (1, 'Rock'),
  (2, 'Pop'),
  (3, 'Hip Hop'),
  (4, 'Electrónica'),
  (5, 'Jazz'),
  (6, 'Reggae'),
  (7, 'Country'),
  (8, 'Clásica'),
  (9, 'Funk'),
  (10, 'R&B');

-- Tabla Album
DROP TABLE IF EXISTS Album;
CREATE TABLE Album (
  idAlbum INT PRIMARY KEY,
  albumName VARCHAR(255),
  dateReleased DATETIME
);

INSERT INTO Album (idAlbum, albumName, dateReleased)
VALUES
  (1, 'Thriller', '1982-11-30'),
  (2, 'Back in Black', '1980-07-25'),
  (3, 'Dark Side of the Moon', '1973-03-01'),
  (4, 'Nevermind', '1991-09-24'),
  (5, 'Rumours', '1977-02-04'),
  (6, 'The Wall', '1979-11-30'),
  (7, 'Abbey Road', '1969-09-26'),
  (8, 'Appetite for Destruction', '1987-07-21'),
  (9, 'Led Zeppelin IV', '1971-11-08'),
  (10, 'Purple Rain', '1984-06-25');

-- Tabla Artist
DROP TABLE IF EXISTS Artist;
CREATE TABLE Artist (
  idArtist INT PRIMARY KEY,
  artistName VARCHAR(255)
);

INSERT INTO Artist (idArtist, artistName)
VALUES
  (1, 'Michael Jackson'),
  (2, 'AC/DC'),
  (3, 'Pink Floyd'),
  (4, 'Nirvana'),
  (5, 'Fleetwood Mac'),
  (6, 'Pink Floyd'),
  (7, 'The Beatles'),
  (8, 'Guns N\' Roses'),
  (9, 'Led Zeppelin'),
  (10, 'Prince');

-- Consultas SELECT
SELECT * FROM Genere LIMIT 10;
SELECT * FROM Album LIMIT 10;
SELECT * FROM Artist LIMIT 10;

-- Descripción de las tablas
DESCRIBE Genere;
DESCRIBE Album;
DESCRIBE Artist;
