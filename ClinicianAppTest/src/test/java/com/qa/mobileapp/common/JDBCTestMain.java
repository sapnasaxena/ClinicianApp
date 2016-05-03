package com.qa.mobileapp.common;
//package com.elfuaa.jdbc;


	
	import java.sql.ResultSet;
	import java.sql.ResultSetMetaData;
	import java.sql.SQLException;
	import java.sql.Types;
	import java.text.DateFormat;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.TimeZone;

	public class JDBCTestMain {

	    /*private static final String IP = "172.31.28.61"; //portea staging db
	    private static final String HOST = "toor"; //portea staging db
	    private static final String PASSWORD = "23NP6w68P353"; //portea staging db
	    private static final String DATABASE = "portea_crm"; */
		//https://intranet.portea.com/pma/index.php?server=
	    private static final String IP = "portea-test.c6wevl4fx9j5.ap-southeast-1.rds.amazonaws.com";
	    private static final String HOST = "toor";
	    private static final String PASSWORD = "23NP6w68P353";
	    private static final String DATABASE = "portea_crm";
	    private final JDBCConnector entityManager;

	    public static void main(String[] args) throws SQLException, ParseException {
	        new JDBCTestMain();
	    }

	    public JDBCTestMain() throws SQLException, ParseException {
	        entityManager = JDBCConnector.getInstance(getConfig());

//	        insert();
	        String query = "Select * FROM otp_verification where mobileNo='8095627267'";
	        select(query);
	        entityManager.destroy();
	    }

	    private void select(String query) throws SQLException {
	        ResultSet set = entityManager.executeQuery(query);

	        parseResultSet(set);
	    }

//	    private java.sql.Timestamp getBLah(String dateFormat) throws ParseException {
//	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//
//	        Date date = simpleDateFormat.parse(dateFormat);
//	        return new java.sql.Timestamp(date.getTime());
//
//	    }

//	    private void insert() throws SQLException, ParseException {
//	        String query = "INSERT INTO `Car`(`vehicle_id`, `car_type`, `manufacture_date`, `createdOn`) VALUES" +
//	                " (?,?,?,?)";
//	        entityManager.executeUpdate(query, 7,"sedan",getCurrentDate(), getTimeStamp());
//	    }

	    private java.sql.Timestamp getTimeStamp() throws ParseException {
	        String s = "03/24/2013 11:43";
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");

	        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
	        Date date = simpleDateFormat.parse(s);
	        return new java.sql.Timestamp(date.getTime());

	    }

	    public java.sql.Timestamp getCurrentDate() throws ParseException {
	        Date date = new Date();
	        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	        format.setTimeZone(TimeZone.getTimeZone("UTC"));
	        String formatted = format.format(date);
	       return getTimeStamp(formatted);
	    }

	    private java.sql.Timestamp getTimeStamp(String dateFormat) throws ParseException {
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	        Date date = simpleDateFormat.parse(dateFormat);
	        return new java.sql.Timestamp(date.getTime());

	    }

	    private java.sql.Timestamp getTimeStamp(Boolean currentTime) throws ParseException {

	        if (currentTime) {
	            return new java.sql.Timestamp(new Date().getTime());
	        }
	        return getTimeStamp();
	    }

	    private void parseResultSet(ResultSet rs) throws SQLException {

	        if (rs == null) {
	            System.out.println("No results!");
	            return;
	        }
	        ResultSetMetaData rsMetaData = rs.getMetaData();

	        int numberOfColumns = rsMetaData.getColumnCount();

	        String[] columnNames = new String[numberOfColumns];
	        Integer[] columnTypes = new Integer[numberOfColumns];
	        for (int i = 0; i < numberOfColumns; i++) {
	            columnNames[i] = rsMetaData.getColumnName(i + 1);
	            columnTypes[i] = rsMetaData.getColumnType(i + 1);
	            System.out.print(columnNames[i] + " - ");
	        }

	        System.out.println("");
	        while (rs.next()) {
	            for (int i = 0; i < columnNames.length; i++) {
	                String name = columnNames[i];
	                int type = columnTypes[i];
	                String value = null;
	                switch (type) {
	                    case Types.VARCHAR:
	                        value = rs.getString(name);
	                        break;
	                    case Types.DATE:
	                        if (rs.getDate(name) != null) {
	                            value = rs.getDate(name).toString();
	                        }
	                        break;
	                    case Types.TIMESTAMP:
	                        if (rs.getTimestamp(name) != null) {
	                            value = rs.getTimestamp(name).toString();
	                        }
	                        break;
	                }
	                System.out.print(value + " - ");
	            }
	            System.out.println("");
	        }
	    }

	    private Map<String, String> getConfig() {
	        Map<String, String> config = new HashMap<>();
	        config.put("ip", IP);
	        config.put("host", HOST);
	        config.put("password", PASSWORD);
	        config.put("db", DATABASE);
	        return config;
	    }

	    private java.sql.Date getDate() throws ParseException {
	        String s = "03/24/2013 21:54";
	        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm");

	        Date date = simpleDateFormat.parse(s);
	        return new java.sql.Date(date.getTime());
	    }
	}



