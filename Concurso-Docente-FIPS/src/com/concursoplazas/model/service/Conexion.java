package com.concursoplazas.model.service;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {

	public static Connection getConnection() {
		Connection dbConnection = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String srcDB = "jdbc:mysql://localhost:3306/concursoplazas";
			dbConnection = DriverManager.getConnection(srcDB, "root", "12345"); 
		} catch(Exception e) {
			System.out.println(e);
		}  
		return dbConnection;
	}

}
