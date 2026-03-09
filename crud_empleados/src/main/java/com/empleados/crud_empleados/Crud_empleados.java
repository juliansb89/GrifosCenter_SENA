/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.empleados.crud_empleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Andres
 */
public class Crud_empleados {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/codificacion_modulos";
        String user = "root";
        String password = "";
        
        try {
            Connection conexion = DriverManager.getConnection(url, user, password);
            Statement stat = conexion.createStatement();
            
            
            /* INSERTAR
            String insert = "INSERT INTO EMPLEADOS (Id_empleado, Cargo, Seccion, Nombre) VALUES " +
                         "(2, 'Vendedor', 'Punto de venta', 'Daniel Ramirez')";
            
            
            
            
            stat.executeUpdate(insert); 
            
            System.out.println("El empleado fue ingresado correctamente");
            
            // Cerrar conexiones 
            stat.close();
            conexion.close();
            */
            
            /*MODIFICAR
            stat.execute("UPDATE EMPLEADOS SET Nombre = 'Andres Medina' WHERE Id_empleado = 2");
            */
            
            /*LISTAR*/
            ResultSet rs = stat.executeQuery("SELECT * FROM EMPLEADOS");

            while (rs.next()){
                System.out.println("Id_empleado: " + rs.getInt("Id_empleado"));
                System.out.println("Cargo: " + rs.getString("Cargo"));
                System.out.println("Seccion: " + rs.getString("Seccion"));
                System.out.println("Nombre: " + rs.getString("Nombre"));
            }
            
            /*Eliminar
            
            stat.execute("DELETE * FROM EMPLEADOS WHERE Id_empleados = 100");
            */
            
            
            
            stat.close();
            conexion.close();
            
        } catch(Exception e){
            System.out.println("ERROR");
        }    
    }
}