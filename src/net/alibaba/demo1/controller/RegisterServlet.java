package net.alibaba.demo1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.alibaba.demo1.domain.Users;
import net.alibaba.demo1.service.ifac.ServiceFactory;
import net.alibaba.demo1.service.ifac.UserServiceIfac;
import net.alibaba.demo1.service.impl.UserServiceImpl;

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
		
		/*
		 * System.out.println("===============================");
		 * System.out.println(request.getRequestURL());
		 * System.out.println(request.getRequestURI());
		 * System.out.println(request.getQueryString());
		 * System.out.println(request.getRemoteAddr());
		 * System.out.println(request.getRemoteHost());
		 * System.out.println(request.getRemotePort());
		 * System.out.println(request.getLocalAddr());
		 * System.out.println(request.getLocalName()); System.out.println();
		 * System.out.println(); System.out.println(); System.out.println();
		 */
		  
			// 获取表单数据：id username xingqu sex province
			System.out.println(request.getRemoteHost());
			String id = request.getParameter("id");
			System.out.println("id:" + id);
			String username = request.getParameter("username");
			System.out.println("username:" + username);
			String[] xingqu = request.getParameterValues("xingqu");//["lanqiu","zuqiu","paiqiu"]--->lanqiu,zuqiu,paiqiu
			
			StringBuffer sb_xingqu=new StringBuffer("");
			//需求：["lanqiu","zuqiu","paiqiu"]--->lanqiu,zuqiu,paiqiu
			for (int i = 0; i < xingqu.length; i++) {
				sb_xingqu.append(xingqu[i]);
				if(i==xingqu.length-1)
				{
					break;
				}
				sb_xingqu.append(",");
			}
			System.out.println("sb_xingqu:"+sb_xingqu);
			
			
			
			System.out.println("xingqu:" + Arrays.toString(xingqu));

			String sex = request.getParameter("sex");
			System.out.println("sex:" + sex);
			String province = request.getParameter("province");
			System.out.println("province:" + province);
			
			int sex_value=sex.equals("男")?1:0;
			
			Users user=new Users(Integer.parseInt(id), username, Arrays.toString(xingqu),sex_value , province);
//			UserServiceIfac userService=new UserServiceImpl();
			UserServiceIfac userService = ServiceFactory.getUserServiceInstance();
			boolean result=userService.register(user);
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter pw=response.getWriter();
			if(result)
			{
				pw.println("<script>alert('register success');</script>");
			}else
			{
				pw.println("<script>alert('register fail');</script>");
			}
	}
}
