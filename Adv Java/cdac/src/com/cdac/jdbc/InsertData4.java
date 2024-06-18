package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData4 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
			String sql = "insert into tbl_product (name,price,quantity) values (?,?,99)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, "Mototrola Razr40");
			stmt.setDouble(2, 49000);
			// stmt.setInt(3, 45);
			stmt.executeUpdate();
			System.out.println("records inserted..");

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
