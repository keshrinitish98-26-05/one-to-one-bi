package com.ty.CashCaddingVehicleCharcy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteVehicleAndCharcy {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Vehicle vehicle=entityManager.find(Vehicle.class,2);
		if(vehicle!=null)
		{
			entityTransaction.begin();
			entityManager.remove(vehicle);
			entityTransaction.commit();
		}
	}

}
