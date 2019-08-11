package com.jm2100810.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate("DELETE FROM JM2190810_USER WHERE ID = 1");
			if (result == 1) {
				System.out.println("Record deleted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
