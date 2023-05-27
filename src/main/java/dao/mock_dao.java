package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.login_dto;

public class mock_dao {
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
EntityManager em=emf.createEntityManager();
EntityTransaction et=em.getTransaction();
public login_dto login(String email) {
	login_dto ldto=em.find(login_dto.class, email);
	return ldto; 
}
public void insert(login_dto mdto) {
	// TODO Auto-generated method stub
	et.begin();
	em.persist(mdto);
	et.commit();
}
}
