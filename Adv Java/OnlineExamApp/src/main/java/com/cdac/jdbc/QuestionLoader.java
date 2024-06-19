package com.cdac.jdbc;
// this is model of MVC
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuestionLoader {
	public List<Question> loadQuestions() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac", "root", "cdac");
			String sql = "select * from tbl_question";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			List<Question> list = new ArrayList<>();
			while (rs.next()) {
				Question q = new Question();
				q.setId(rs.getInt("id"));
				q.setQuestion(rs.getString("question"));
				q.setOption1(rs.getString("option1"));
				q.setOption2(rs.getString("option2"));
				q.setOption3(rs.getString("option3"));
				q.setOption4(rs.getString("option4"));
				q.setRightAnswer(rs.getInt("right_answer"));
				list.add(q);
				 System.out.println("Loaded question: " + q.getQuestion());
			}
			return list;

		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null)
				conn.close();
			} catch (Exception e) {
			}
		}
	}
}
