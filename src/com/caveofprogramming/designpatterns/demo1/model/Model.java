package com.caveofprogramming.designpatterns.demo1.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Model {

	public Model() {

	}

	public void validateJDBC(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Where is your MySQL JDBC Driver?");
		e.printStackTrace();
		return;
	}
	}

	public void addData(String userid, String passwd){
		Statement statement = null;
		Connection connection = null;
		this.validateJDBC();

		try {
			connection = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/test","xxxx", "xxxx");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		String insertQuery = "INSERT INTO LOGINS "
				+ "(name, passwd) " + "VALUES"
				+ "('" + userid + "', '"+ passwd + "');";
		System.out.println(insertQuery);

		try {
			statement = connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println(insertQuery);
			System.out.println("Record is inserted into DBUSER table!");
		} catch (SQLException e) {
			System.out.println("Insert Failed! Check output console");
			e.printStackTrace();
			return;
		}
	}
}
