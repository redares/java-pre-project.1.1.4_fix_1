package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    public Connection getDbConnection()
            throws SQLException, ClassNotFoundException {

        String connectionURL = "jdbc:mysql://localhost:3306/dbuser";
        String userName = "root";
        String password = "riddar";

        Connection dbConnection = DriverManager.getConnection(connectionURL, userName, password);

        return dbConnection;
    }
}
