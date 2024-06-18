package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;


public class FetchData {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
			String sql = "Select * from tbl_product where price >= ?";
			PreparedStatement stmt = conn.prepareStatement(sql);

			Scanner s = new Scanner(System.in);
			System.out.println("Enter price based on which products will be displayed");
			double basePrice = s.nextDouble();
			stmt.setDouble(1, basePrice); // substituting ? with actual data
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");
				int quantity = rs.getInt("quantity");
				System.out.println(id+" , "+name+" , "+price+" , "+quantity);

			}

		} catch (ClassNotFoundException e) {
			System.out.println("Please check the no. of your glasses 0-0");
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
