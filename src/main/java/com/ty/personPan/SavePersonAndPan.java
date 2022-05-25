package com.ty.personPan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class SavePersonAndPan {
	
	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Nitish");
		person.setEmail("nitish@gmail.com");
		person.setPhone(98765456);
		
		
		Pan pan=new Pan();
		pan.setPanNumber("NIT12345SE");
		pan.setAddress("Bangalore");
		
		person.setPan(pan);
		pan.setPerson(person);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();
	}

}
