package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.mock_dao;
import dto.login_dto;
@WebServlet("/insert")
public class insertion extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.doPost(req, resp);
	String id=req.getParameter("id");
	int id1=Integer.parseInt(id);
	String name=req.getParameter("name");
	String password=req.getParameter("pwd");
 	long pwd1=Long.parseLong(password);
	String email=req.getParameter("email");
	login_dto mdto=new login_dto();
	mdto.setId(id1);
	mdto.setName(name);
	mdto.setEmail(email);
	mdto.setPwd(pwd1);
	
	mock_dao mdao=new mock_dao();
	mdao.insert(mdto);
}
}
