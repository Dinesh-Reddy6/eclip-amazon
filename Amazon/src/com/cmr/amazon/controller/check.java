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
@WebServlet("/CategoryController")
public class check extends HttpServlet {
//	public void init() {}
	private static final long serialVersionUID = 1L;

	CategoryDAO catdao = new CategoryDAO();
	
	public void service(ServletRequest request,ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String c=request.getParameter("catname");
		Category cat=new Category();
		cat.setCatname(c);
		CategoryDAO catdao=new CategoryDAO();
		boolean s=catdao.save(cat);
		RequestDispatcher rd=request.getRequestDispatcher("index.html");
		if(s) {
		rd.include(request, response);
		out.println("success");
		}
		else {
		out.println("try again");
		}
		
	}}
