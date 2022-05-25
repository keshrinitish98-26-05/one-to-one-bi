package com.ty.personPan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPersonAndPanById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class,1);
		if(person!=null)
		{
			System.out.println("Pname : "+person.getName());
			System.out.println("P"+person.getEmail());
			System.out.println(""+person.getPhone());
			
			System.out.println("-------------------------");
			
			Pan pan=person.getPan();
			System.out.println(""+pan.getId());
			System.out.println(""+pan.getPanNumber());
			System.out.println(""+pan.getAddress());
		}
	}

}
