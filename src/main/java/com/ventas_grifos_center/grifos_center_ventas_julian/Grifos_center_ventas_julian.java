/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ventas_grifos_center.grifos_center_ventas_julian;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Grifos_center_ventas_julian {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/grifos_center";
        String user = "root";
        String password = "";
        
        try {
          Connection conn = DriverManager.getConnection(url, user, password);
          Statement stmt = conn.createStatement();
          /*Registrar venta
          stmt.execute("INSERT INTO facturas VALUES (NULL, NULL, '95022784', 50000)");
          */
        /*Listar facturas*/
            ResultSet rs = stmt.executeQuery("SELECT * FROM facturas");

            while (rs.next()) {
            System.out.println("ID Factura: " + rs.getInt("id_fac"));
            System.out.println("Fecha y Hora: " + rs.getTimestamp("fecha"));
            System.out.println("Cédula Cliente: " + rs.getString("id_cliente"));
            System.out.println("Total Pagado: $" + rs.getDouble("total_pago"));
            System.out.println("---------------------------------");
}
          /*Modificar factura
          stmt.execute("UPDATE facturas SET total_pago = 150000 WHERE id_fac = 1");
          */
          /*Anular venta
          stmt.execute("DELETE FROM facturas WHERE id_fac = 1");
          */
          System.out.println("Informacion ingresada");
    
            } catch (Exception e) {
            System.out.println("Has tenido un error" + e);
        }
        
       
        
        
    }
}
