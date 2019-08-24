package com.jm2100810.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecords {

	public static void main(String[] args) {

		try {
			// 1. Establish the connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command/prepared-statement
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM JM2190810_USER WHERE ID = ?");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID:");
				int id = Integer.parseInt(scan.nextLine());

				// 3. Execute the command
				pstmt.setInt(1, id);
				int result = pstmt.executeUpdate();
				// 4. Process the result
				if (result == 1) {
					System.out.println("Record deleted successfully.");
				}

				System.out.print("Do you wish to continue(Y/N):");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
