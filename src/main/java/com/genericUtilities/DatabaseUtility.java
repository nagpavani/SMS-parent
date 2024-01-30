package com.genericUtilities;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class DatabaseUtility{
	Connection con=null;
	/**
	 * this method is for registering to database
	 * @throws SQLException
	 */
	
	public void connectToDB() throws SQLException {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	
	 con=DriverManager.getConnection(IpathConstants.DBURL,IpathConstants.DBUsername,IpathConstants.DBpassword);
	} 
	/**
	 * This method is forexecute query
	 * @param query
	 * @param con
	 * @param columnIndex
	 * @param expData
	 * @return
	 * @throws SQLException
	 */
	public String DbExecution(String query,Connection con,int columnIndex,String expData) throws SQLException {
	Statement state = con.createStatement();
	boolean flag =false;
	  ResultSet result = state.executeQuery(query);
	  while(result.next()) {
		 String data = result.getString(columnIndex);
		  if(data.equalsIgnoreCase(expData)) {
			  
			  flag=true;
			  break;
			   
		  }
	  }
	if(flag) {
		String data = null;
		System.out.println(data +"---->data verified");
		return expData;
	}
	else {
		System.out.println("data not verified");
		return"";
	}
	
	}
	/**
	 * this method is for closing database
	 * @param con
	 * @throws SQLException
	 */
	public void closeDb(Connection con) throws SQLException {
		con.close();
	}
}

