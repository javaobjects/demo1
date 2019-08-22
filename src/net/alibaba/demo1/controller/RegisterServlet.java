package net.alibaba.demo1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// System.out.println("来了");
		// 客户端的所有信息都封装在request参数中
		/*
		 * String autyType=request.getAuthType(); request.getRemoteAddr();
		 */

		/*
		 * getRequestURL方法返回客户端发出请求时的完整URL getRequestURI方法返回请求行中的资源名部分 getQueryString
		 * 方法返回请求行中的参数部分 getRemoteAddr方法返回发出请求的客户机的IP地址 getRemoteHost方法返回发出请求的客户机的完整主机名
		 * getRemotePort方法返回客户机所使用的网络端口号 getLocalAddr方法返回WEB服务器的IP地址
		 * getLocalName方法返回WEB服务器的主机名
		 * 
		 * 获得客户机请求头
		 * 
		 * getHeader方法 getHeaders方法 getHeaderNames方法
		 */
		
		  System.out.println("===============================");
		  System.out.println(request.getRequestURL());
		  System.out.println(request.getRequestURI());
		  System.out.println(request.getQueryString());
		  System.out.println(request.getRemoteAddr());
		  System.out.println(request.getRemoteHost());
		  System.out.println(request.getRemotePort());
		  System.out.println(request.getLocalAddr());
		  System.out.println(request.getLocalName()); System.out.println();
		  System.out.println(); System.out.println(); System.out.println();

	}
}
