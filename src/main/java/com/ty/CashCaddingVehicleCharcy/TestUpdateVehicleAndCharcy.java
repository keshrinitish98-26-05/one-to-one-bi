package com.ty.CashCaddingVehicleCharcy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateVehicleAndCharcy {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=entityManager.find(Vehicle.class,3);
		
		if(vehicle!=null)
		{
			Charcy charcy=vehicle.getCharcy();
			vehicle.setName("Creta");
		    charcy.setType("off-road");
		    entityTransaction.begin();
		    entityManager.persist(charcy);
		    entityManager.persist(vehicle);
		    entityTransaction.commit();
		}
	}

}
