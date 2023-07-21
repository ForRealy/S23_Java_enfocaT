package com.main;

import java.sql.*;

public class Javasql {

  public static void main(String[] args) throws SQLException {

    // Crea una conexión a la base de datos
    Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydatabase", "postgres", "mypassword");

    // Crea un objeto Statement
    Statement statement = connection.createStatement();

    // Ejecuta una consulta SELECT
    ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");

    // Itera sobre los resultados de la consulta
    while (resultSet.next()) {
      System.out.println(resultSet.getString("column1") + " " + resultSet.getString("column2"));
    }

    // Cierra la conexión
    connection.close();
  }
}
