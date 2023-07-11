-- Schema MiBaseDeDatos
CREATE DATABASE IF NOT EXISTS MiBaseDeDatos;
USE MiBaseDeDatos;
-- Table MiTabla

CREATE TABLE IF NOT EXISTS MiTabla (
  fecha DATE,
  texto TEXT,
  numero_entero INTEGER,
  numero_decimal DECIMAL(10, 2)
);
DESCRIBE MiTabla;
