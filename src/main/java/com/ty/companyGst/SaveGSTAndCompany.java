package com.ty.companyGst;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveGSTAndCompany {
	
	public static void main(String[] args) {
		
		Company company=new Company();
		company.setName("TestYantra");
		company.setWeb("www.testYantra.com");
		
		GST gst=new GST();
		gst.setGstNumber(9876545);
		gst.setState("Karnataka");
		
		company.setGst(gst);
		gst.setCompany(company);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}

}
