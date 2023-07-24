CREATE DATABASE IF NOT EXISTS Universidad;
USE Universidad;

CREATE TABLE IF NOT EXISTS Estudiante (
  idEstudiante INT PRIMARY KEY,
  nombre VARCHAR(50),
  edad INT
);

CREATE TABLE IF NOT EXISTS Profesor (
  idProfesor INT PRIMARY KEY,
  nombre VARCHAR(50),
  especialidad VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Curso (
  idCurso INT PRIMARY KEY,
  nombre VARCHAR(50),
  idProfesor INT,
  FOREIGN KEY (idProfesor) REFERENCES Profesor(idProfesor)
);

INSERT INTO Estudiante (idEstudiante, nombre, edad) VALUES
(1, 'Juan Pérez', 20),
(2, 'María Gómez', 22),
(3, 'Pedro Rodríguez', 19);

INSERT INTO Curso (idCurso, nombre, idProfesor) VALUES
(1, 'Matemáticas', 101),
(2, 'Historia', 102),
(3, 'Inglés', 103);

INSERT INTO Profesor (idProfesor, nombre, especialidad) VALUES
(101, 'Laura Martínez', 'Matemáticas'),
(102, 'Carlos López', 'Historia'),
(103, 'Ana García', 'Idiomas');

SELECT e.*
FROM Estudiante e
INNER JOIN Curso c ON e.idEstudiante = c.idEstudiante
INNER JOIN Profesor p ON c.idProfesor = p.idProfesor
WHERE p.idProfesor = 101; -- Reemplaza el ID del profesor según tu caso

SELECT COUNT(*) AS totalCursos
FROM Curso
WHERE idProfesor = 101; -- Reemplaza el ID del profesor según tu caso

SELECT COUNT(*) AS totalCursos
FROM Curso
WHERE idEstudiante = 1; -- Reemplaza el ID del estudiante según tu caso
