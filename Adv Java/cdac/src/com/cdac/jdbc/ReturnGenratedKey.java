package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReturnGenratedKey {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
			String sql = "insert into tbl_product (name,price,quantity) values (?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			Scanner s = new Scanner(System.in);
			String ans = "";
			do {
				System.out.println("Enter the product name");
				String name = s.nextLine();
				System.out.println("Enter the price");
				double price = Double.parseDouble(s.nextLine());
				System.out.println("Enter the quantity");
				int quantity = Integer.parseInt(s.nextLine());

				stmt.setString(1, name);
				stmt.setDouble(2, price);
				stmt.setInt(3, quantity);
				stmt.executeUpdate();

				int id = 0;
				ResultSet rs = stmt.getGeneratedKeys();
				if (rs.next())
					id = rs.getInt(1);

				System.out.println("recored is inserted, product id is " + id);
				System.out.println("Do you want to continue (y/n)");
				ans = s.nextLine();
			} while (ans.equals("y"));

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
