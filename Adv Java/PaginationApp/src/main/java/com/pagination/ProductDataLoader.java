package com.pagination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ProductDataLoader {
	public List<Product> loadProducts(int offset) {

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
			String sql = "SELECT * FROM tbl_product LIMIT 5 OFFSET ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, offset);
			ResultSet rs = stmt.executeQuery();
			
			List<Product> list = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int price = rs.getInt(3);
				int quantity = rs.getInt(4);
				Product p = new Product(id,name,price,quantity);
				list.add(p);
				
			}
			return list;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}

}
