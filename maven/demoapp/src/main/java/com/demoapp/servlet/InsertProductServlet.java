package com.demoapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/InsertProductServlet")
public class InsertProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int productId = Integer.parseInt(request.getParameter("pid"));
		String productName = request.getParameter("pname");
		double productPrice = Double.parseDouble(request.getParameter("pprice"));
		LocalDate mfd = LocalDate.parse(request.getParameter("pdate"));
		String category = request.getParameter("pcategory");

		PrintWriter out = response.getWriter();

		out.println("<html><head><title>Insert Product</title></head><body>");

		out.println("<h2>");
		out.println("<br>ProductId: " + productId);
		out.println("<br>ProductName: " + productName);
		out.println("<br>Price: " + productPrice);
		out.println("<br>MFD: " + mfd);
		out.println("<br>ProductName: " + category);

		out.println("</h2>");

		String url = "jdbc:mysql://localhost/abcmart";
		String username = "root";
		String password = "Ankit@321";
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connected");

			String sql = "insert into products values(?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productId);
			ps.setString(2, productName);
			ps.setDouble(3, productPrice);
			ps.setDate(4, Date.valueOf(mfd));
			ps.setString(5, category);

			int noOfRowsEffected = ps.executeUpdate();

			out.println("<h2>New Product is add</h2>");

		} catch (ClassNotFoundException e) {
			e.getStackTrace();
		} catch (SQLException e) {
			e.getStackTrace();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
					System.out.println("COnnection closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		out.println("</body></html>");
		out.close();
	}
}
