package models;

import java.sql.*;

public class DBConnect {

    private static String userName = "gcc200255936";
    private static String password = "HfWRpIwwRL";
    private static String connectionString = "jdbc:mysql://aws.computerstudi.es:3306/gcc200255936?useSSL=false";

    public static boolean login(String loginName, String loginPassword) throws SQLException {

        boolean validLogin = false;

        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try
        {
            // connect to DB
            conn = DriverManager.getConnection(connectionString, userName, password);

            // create statement object
            statement = conn.createStatement();

            // create the sql code
            String sqlStatement = "SELECT * FROM users WHERE username = '"+loginName+"' AND password = '"+loginPassword+"';";

            // create and execute query
            resultSet = statement.executeQuery(sqlStatement);

            // if there is an entry in the resultSet, return true
            if(resultSet.next())
            {
                validLogin = true;

                CurrentUser.setUsername(resultSet.getString("username"));
                CurrentUser.setAdmin(resultSet.getBoolean("admin"));
                CurrentUser.setUser_id(resultSet.getInt("user_id"));

            }
        }
        catch(SQLDataException e)
        {
            System.err.println(e);
        }
        finally {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (resultSet != null)
                resultSet.close();
        }

        return validLogin;
    }

}
