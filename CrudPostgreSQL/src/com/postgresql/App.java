package com.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {

    private final String url = "jdbc:postgresql://localhost/BD2";
    private final String user = "postgres";
    private final String password = "aoa123";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public static void main(String[] args){
        App app = new App();
        app.connect();
    }

}
