package com.jm2100810.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecords {

	public static void main(String[] args) {

		try {
			// 1. Establish connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190810_USER VALUES(?, ?)");
			// 3. Execute command

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equals("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter name: ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				int result = pstmt.executeUpdate();
				// 4. Process the result
				if (result == 1) {
					System.out.println("Record inserted successfully.");
				}

				System.out.print("Do you wish to continue(Y/N): ");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
