package com.ty.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetAccountById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		UserAccount account=entityManager.find(UserAccount.class,2);
		if(account!=null)
		{
		List<Page> pages=account.getPage();
		
		System.out.println("------------------------------");
		System.out.println("Account is : "+account.getEmail());
		System.out.println("Accoutn password is : "+account.getPassword());
		System.out.println("Accoutnt mobile number : "+account.getMobile());
		System.out.println("Accoutn name is : "+account.getName());
		
		
		System.out.println("-----------------------------");
		
		
		for(Page page:pages)
		{
			System.out.println("Page  id is: "+page.getName());
			System.out.println("Page  title is :"+page.getTitle());
			System.out.println("Page description is: "+page.getDescription());
			
			System.out.println("-----------------------------------");
		}
	}
		else
		{
			System.out.println("Account doesnot  exist");
		}
	}

	

}
