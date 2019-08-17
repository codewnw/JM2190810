package com.jm2100810.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecords {

	public static void main(String[] args) throws SQLException {

		// 1
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		// 2
		Statement stmt = con.createStatement();

		Scanner scan = new Scanner(System.in);
		String userChoice = "Y";
		while (userChoice.equalsIgnoreCase("Y")) {
			System.out.print("Enter ID: ");
			int id = Integer.parseInt(scan.nextLine());

			System.out.print("Enter name: ");
			String name = scan.nextLine();

			// 3
			int result = stmt.executeUpdate("INSERT INTO JM2190810_USER VALUES(" + id + ", '" + name + "')");
			// 4
			if (result == 1) {
				System.out.println("Record inserted successfully.");
			}

			System.out.print("Do you wish to continue? (Y/N): ");
			userChoice = scan.nextLine();
		}

	}

}
