package com.jm2100810.jdbc.dml.batch.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordsUsingBatchAndPstmt {

	public static void main(String[] args) {

		try {
			// 1. Establish the connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create command
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190810_USER VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter name: ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);

				pstmt.addBatch();

				System.out.print("Do you wish to continue(Y/N): ");
				userChoice = scan.nextLine();
			}

			// 3. Execute command
			int[] result = pstmt.executeBatch();
			// 4. Process the result
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + "	");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
