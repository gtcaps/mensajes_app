package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConnection() {
        
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","root");
            if (connection != null) {
                System.out.println("La conexion con la base de datos fue exitosa");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return connection;
    }
    
}
