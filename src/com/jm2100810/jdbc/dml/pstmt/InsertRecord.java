package com.jm2100810.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {

	public static void main(String[] args) {

		try {
			// 1. Establish connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190810_USER VALUES(?, ?)");
			// 3. Execute command
			pstmt.setInt(1, 10);
			pstmt.setString(2, "Ravi");
			int result = pstmt.executeUpdate();
			// 4. Process the result
			if (result == 1) {
				System.out.println("Record inserted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
