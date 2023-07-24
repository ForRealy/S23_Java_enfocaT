DROP DATABASE IF EXISTS imdb;
CREATE DATABASE imdb;
USE imdb;

CREATE TABLE movies (
  id INT NOT NULL AUTO_INCREMENT,
  title VARCHAR(255) NOT NULL,
  year INT NOT NULL,
  genre VARCHAR(255) NOT NULL,
  director_id INT NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE directors (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE movies_directors (
  movie_id INT NOT NULL,
  director_id INT NOT NULL,
  PRIMARY KEY (movie_id, director_id),
  FOREIGN KEY (movie_id) REFERENCES movies (id),
  FOREIGN KEY (director_id) REFERENCES directors (id)
);

CREATE TABLE stars (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE movies_stars (
  movie_id INT NOT NULL,
  star_id INT NOT NULL,
  PRIMARY KEY (movie_id, star_id),
  FOREIGN KEY (movie_id) REFERENCES movies (id),
  FOREIGN KEY (star_id) REFERENCES stars (id)
);

INSERT INTO movies (title, year, genre, director_id) VALUES ('Pulp Fiction', 1994, 'Crime', 1);
INSERT INTO directors (name) VALUES ('Quentin Tarantino');
INSERT INTO movies_directors (movie_id, director_id) VALUES (1, 1);

DELETE FROM movies;
DELETE FROM directors;
DELETE FROM movies_directors;
DELETE FROM stars;
