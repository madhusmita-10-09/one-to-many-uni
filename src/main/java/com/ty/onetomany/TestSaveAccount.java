package com.ty.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveAccount {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		UserAccount account=new UserAccount();
		account.setEmail("soumya@gmail.com");
		account.setPassword("gdgd234");
		account.setMobile(937373790l);
		account.setName("soumya_390");
		
		Page page1=new Page();
		page1.setName("first page");
		page1.setTitle("image");
		page1.setDescription("Nothing is absolute in this world");
		
		Page page2=new Page();
		page2.setName("video");
		page2.setTitle("java video");
		page2.setDescription("Evertthing is possible");
		
		
		
		List<Page> pages=new ArrayList<Page>();
		pages.add(page1);
		pages.add(page2);
		
		account.setPage(pages);
		
		entityTransaction.begin();
	    entityManager.persist(account);
	    entityManager.persist(page1);
	    entityManager.persist(page2);
		entityTransaction.commit();
		
		
		

	}

}
