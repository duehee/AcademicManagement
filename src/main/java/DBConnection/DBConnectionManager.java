package DBConnection;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

import static DBConnection.DBConnectionConstant.*;

public class DBConnectionManager {
    public static Connection getConnetion() throws SQLException
    {
        try
        {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            return connection;
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
