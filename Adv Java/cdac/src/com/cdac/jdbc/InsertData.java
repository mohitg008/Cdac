package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
			System.out.println("Yayy!, got Connected!");
			Statement stmt = conn.createStatement();
			// stmt.executeUpdate("insert into tbl_product (name, price, quantity) values
			// ('Samsung S21', 39000, 20)");
			String sql = "insert into tbl_product (name, price, quantity) values ('Samsung S21', 39000, 25)";
			stmt.executeUpdate(sql);
			System.out.println("Record Inserted..");
		} catch (SQLException e) {
			System.out.println("Something wrong with MySQL!");
			e.printStackTrace();
		} finally {

			try {
				conn.close();
			} catch (Exception e) {

				e.printStackTrace();
			}

		}
	}

}
