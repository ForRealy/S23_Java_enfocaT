CREATE DATABASE IF NOT EXISTS MiBaseDeDatos;

USE MiBaseDeDatos;

CREATE TABLE IF NOT EXISTS Genere(idGenere INT PRIMARY KEY, Genere VARCHAR(255));
CREATE TABLE IF NOT EXISTS Album(idAlbum INT PRIMARY KEY, albumName VARCHAR(255), dateReleased DATETIME);
CREATE TABLE IF NOT EXISTS Artist(idArtist INT PRIMARY KEY, artistName VARCHAR(255));

DESCRIBE Genere;
DESCRIBE Album;
DESCRIBE Artist;
