package com.cmr.amazon.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


import com.cmr.amazon.dao.CategoryDAO;
import com.cmr.amazon.entity.Category;
@WebServlet("/CategoryContrl")
public class CategoryController extends HttpServlet {
//	public void init() {}
	private static final long serialVersionUID = 1L;

	CategoryDAO catdao = new CategoryDAO();
	
	public void service(ServletRequest request,ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); //he will be a direct pointerrowser
		out.print("hello");
	//	String action = request.getParameter("action");// to client b
		
	//	if(action.equalsIgnoreCase("delete")) {
	//		RequestDispatcher rd = request.getRequestDispatcher("adminCatList.jsp");
	//		int id = Integer.parseInt(request.getParameter("id"));
		//	Boolean success = catdao.delete(id);
	//		if(success) {
		//		rd.include(request, response);
		//		out.println("<center><h3><font color='blue'>Category deleted Successfully</font></h3></center>");
	//		}
		//	else {
		//		rd.include(request, response);
//				out.println("<center><h3><font color='orange'>Unable to delete Category. Please try again</font></h3></center>");
	//		}
	//	}
		//else {
	/*		String catname = request.getParameter("catname");
			
			Category cat = new Category();
			cat.setCatname(catname);
			
			Boolean success = false;
			if(action.equalsIgnoreCase("save"))
				success = catdao.save(cat);
			else if(action.equalsIgnoreCase("edit")) {
				int id = Integer.parseInt(request.getParameter("id"));
				cat.setId(id);
				success = catdao.update(cat);
			}
				
			
			RequestDispatcher rd = request.getRequestDispatcher("adminCatList.jsp");
			if(success) {
				rd.include(request, response);
				out.println("<center><h3><font color='blue'>Category Added Successfully</font></h3></center>");
			}
			else {
				rd.include(request, response);
				out.println("<center><h3><font color='orange'>Unable to add Category. Please try again</font></h3></center>");
			}
		}*/
	}	
	//}
	//public void destroy() {}
}
