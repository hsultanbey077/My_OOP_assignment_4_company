package com.company.MyApp.DATA;
import com.company.MyApp.DATA.interfaces.IDB;
import java.sql.*;
public class Postgre implements IDB{

    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/Sultan";
        try {
            // Here we load the driver’s class file into memory at the runtime
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "sultan");

            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
