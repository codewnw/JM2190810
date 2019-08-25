package com.jm2100810.jdbc.image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreImage {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190810_PROFILE VALUES(?,?)");

			pstmt.setString(1, "JDBC");
			FileInputStream fis = new FileInputStream("resources//images//tech-word-cloud.jpg");
			pstmt.setBinaryStream(2, fis, fis.available());
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("Profile has been created.");
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
