package com.jm2100810.jdbc.dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecords {

	public static void main(String[] args) {

		try {
			// 1. Establish the connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command/statement
			Statement stmt = con.createStatement();
			// 3. Execute command/statement
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2190810_USER");
			// 4. Process the result
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(id + " " + name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
