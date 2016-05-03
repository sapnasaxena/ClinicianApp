package com.qa.mobileapp.MobileApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dbtime;
		String dbUrl = "jdbc:mysql:https://intranet.portea.com/pma/index.php?db=&server=5&token=fe74eef25d53f28677184ffb4e2557e9&old_usr=toor";
		String userName ="toor";
		String passWord= "23NP6w68P353";
		String server = "portea-test.c6wevl4fx9j5.ap-southeast-1.rds.amazonaws.com";
		String dbName = "portea_crm";
		String query = "Select * FROM otp_verification where mobileNo='8095627267'";
		
			try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection ("jdbc:mysql://intranet.portea.com/pma/index.php",userName, passWord);
			
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
//need connection strings for DB
			while (rs.next()) {
			dbtime = rs.getString(1);
			System.out.println(dbtime);
			} //end while

			con.close();
			} //end try

			catch(ClassNotFoundException e) {
			e.printStackTrace();
			}

			catch(SQLException e) {
			e.printStackTrace();
			}

			}
	}


