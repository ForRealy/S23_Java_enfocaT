package com.main;
public class Concat {
    public static void main(String args[]) {
        String nombre = "Juan";
        String apellido = "Ramon";
        String calle = "C/ de Sant Pere Mes Baix";
        String municipio = "Barcelona";
        String codigoPostal = "12345";
        char sexo = 'M';
        String correoElectronico = "juan@gmail.com";

        String mensaje = "Datos personales:\n" +
                "\tNombre: " + nombre + "\n" +
                "\tApellido: " + apellido + "\n" +
                "\tCalle: " + calle + "\n" +
                "\tMunicipio: " + municipio + "\n" +
                "\tCódigo Postal: " + codigoPostal + "\n" +
                "\tSexo: " + sexo + "\n" +
                "\tCorreo Electronico: " + correoElectronico;

        System.out.println(mensaje);
    }
}
