package com.jm2100810.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement stmt = con.createStatement();
		int result = stmt.executeUpdate("INSERT INTO JM2190810_USER VALUES(1, 'Atul')");
		if (result == 1) {
			System.out.println("Record inserted successfully.");
		}
	}

}
