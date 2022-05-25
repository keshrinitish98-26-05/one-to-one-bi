package com.ty.CashCaddingVehicleCharcy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleAndCharcy {
	
	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.setName("Boleno");
		vehicle.setCost(900000);
		
		Charcy charcy=new Charcy();
		charcy.setCharcyNumber("IND3487543U945");
		charcy.setType("on road");
		
		vehicle.setCharcy(charcy);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
		
	}

}
