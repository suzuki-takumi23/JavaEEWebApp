package jp.ac.ttc.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 resp.setContentType("text/html charset=UTF-8");
	 PrintWriter out = resp.getWriter();
	 String text = """
	 				<html>
	 					<head>
	 						<title>たいとる</title>
	 					</head>
	 					<body>
	 						<h1>やーい、ばーかばーか</h1>
	 					</body>
	 				</html>
	 				""";
 }
}
