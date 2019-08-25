package com.jm2100810.jdbc.metadata;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDataBaseMetaData {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			DatabaseMetaData dbmd = con.getMetaData();
			System.out.println(dbmd.getUserName());
			System.out.println(dbmd.getURL());
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());

			ResultSet rs = dbmd.getTables(null, null, "JM2190810_%", null);
			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
