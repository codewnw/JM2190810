package com.jm2100810.jdbc.dml.batch.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecordsUsingStmtBatch {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";
			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				stmt.addBatch("DELETE FROM JM2190810_USER WHERE ID = " + id);

				System.out.print("Do you wish to continue(Y/N): ");
				userChoice = scan.nextLine();
			}

			int[] result = stmt.executeBatch();
			for (int i = 0; i < result.length; i++) {
				System.out.print(result[i] + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
