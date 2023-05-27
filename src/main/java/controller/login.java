package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.mock_dao;
import dto.login_dto;
@WebServlet("/login")
public class login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
		String password=req.getParameter("pwd");
	 	long pwd1=Long.parseLong(password);
		String email=req.getParameter("email");
	    mock_dao mdao=new mock_dao();
	    login_dto mdto= mdao.login(email);
		
	    if(mdto!=null)
	    {
	    	if(mdto.getPwd()==pwd1)
	    	{
	    		resp.getWriter().print("welcome");
	    		
	    	}
	    	else
	    	{
	    		resp.getWriter().print("<h1>invalid password</h1>");
	    		req.getRequestDispatcher("login.html");
	    		
	    }
		
	}
	    else
	    {
	    	resp.getWriter().print("<h1>enter pwd</h1><a href='login.html'>click here</a>");
	    }
	}
}
