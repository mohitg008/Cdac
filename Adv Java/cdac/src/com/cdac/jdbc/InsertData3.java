package com.cdac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertData3 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");

			Statement stmt = conn.createStatement();

			// collecting data from user
			Scanner s = new Scanner(System.in);
			String ans ="";
			
			do {
			System.out.println("Enter Product Name");
			String name = s.nextLine();
			System.out.println("Enter the price of the product");
			double price = Double.parseDouble(s.nextLine());
			System.out.println("Enter quantity of the product");
			int quantity = Integer.parseInt(s.nextLine());
			String sql = "insert into tbl_product (name, price, quantity) values ('" + name + "', " + price + ", "
					+ quantity + ")";
			// System.out.println(sql);
			stmt.executeUpdate(sql);
			System.out.println("Record Inserted..");
			System.out.println("Do you wish to continue (y/n)");
			ans =s.nextLine();
			}while(ans.equals("y"));
			
			
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
