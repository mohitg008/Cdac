package com.cdac.servlet;

// this is the controller of MVC
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.jdbc.Question;
import com.cdac.jdbc.QuestionLoader;

/**
 * Servlet implementation class QuestionLoaderServlet
 */
@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int qNo;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		QuestionLoader loader = new QuestionLoader();
		List<Question> list = loader.loadQuestions();

		HttpSession session = request.getSession();

		if (qNo < list.size()) {
			Question q = list.get(qNo++);
			session.setAttribute("currentQ", q);
			System.out.println("Question loaded and set in session: " + q.getQuestion());

			response.sendRedirect("viewQuestion.jsp");
		}
		else
			response.sendRedirect("score.jsp");

	}

}
