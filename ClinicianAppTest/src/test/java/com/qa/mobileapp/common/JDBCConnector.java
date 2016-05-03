package com.qa.mobileapp.common;

//package com.elfuaa.jdbc;

	import java.sql.*;
	import java.util.Map;

	/**
	 * Main connector to db. It's a singleton and client can only initialize the connection once.
	 */
	public class JDBCConnector {

	    private static Boolean initialized = false;
	    private static JDBCConnector instance;
	    private Connection connection;



	    private JDBCConnector(Map<String, String> config) {
	        init(config);
	      
	    }

	    /**
	     * Creates a connection to the database.
	     */
	    private void init(Map<String, String> config) {
	        try {
                 
	            String url = "jdbc:mysql://" + config.get("ip") + ":3306/" + config.get("db") + "?"
	                    + "user=" + config.get("host") + "&password=" + config.get("password");
	                    //+"&zeroDateTimeBehavior=convertToNull";
	            System.out.println("url = " + url);
	            connection = DriverManager.getConnection(url);

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public ResultSet executeQuery(String query) {
	        try {
	            Statement statement = connection.createStatement();

	            return statement.executeQuery(query);
	        } catch (SQLException e) {
	            System.out.println(e);
	        }
	        return null;
	    }

	    public static JDBCConnector getInstance(Map<String, String> config) {
	        if (!initialized) {
	            initialized = true;
	            instance = new JDBCConnector(config);
	        }
	        return instance;
	    }

	    public void destroy() {
	        try {
	            connection.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void executeUpdate(String query, Object... args) throws SQLException {
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        for (int i = 0; i < args.length; i++) {
	            if (args[i] instanceof String) {
	                preparedStatement.setString(i+1, (String) args[i]);
	            }
	            else if (args[i] instanceof Integer) {
	                preparedStatement.setInt(i+1, (Integer) args[i]);
	            }
	            else if (args[i] instanceof java.sql.Date) {
	                preparedStatement.setDate(i + 1, (java.sql.Date) args[i]);
	            }
	            else if (args[i] instanceof  java.sql.Timestamp){
	                preparedStatement.setTimestamp(i + 1, (java.sql.Timestamp) args[i]);
	            }
	        }
	        preparedStatement .executeUpdate();
	    }
	}


