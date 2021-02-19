package com.company.DATA.interfaces;
import java.sql.Connection;
import java.sql.SQLException;
public interface IDB {//interface for connection
    Connection getConnection() throws SQLException, ClassNotFoundException;
}
