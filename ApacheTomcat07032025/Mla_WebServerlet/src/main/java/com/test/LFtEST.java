package com.test;

import jakarta.security.auth.message.config.ServerAuthConfig;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.net.http.HttpRequest;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.bcel.classfile.ClassFormatException;

/**
 * Servlet implementation class LFtEST
 */
@jakarta.servlet.annotation.WebServlet("/LFtEST")
public class LFtEST extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LFtEST() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServerAuthConfig config) throws ClassFormatException {
		// TODO Auto-generated method stub
		System.out.println("Init");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpRequest request, HttpServlet response) throws IOException {
		// TODO Auto-generated method stub
	}

}
