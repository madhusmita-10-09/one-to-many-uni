package com.ty.onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPersonBankAccountById {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Person person=entityManager.find(Person.class,1);
		if(person!=null)
		{
		List<BankAccount> bankAccounts=person.getBankAccount();
		
		System.out.println("------------------------------");
		System.out.println("Person : "+person.getName());
		System.out.println("Person Account no is : "+person.getAccountno());
		System.out.println("Accoutnt mobile number : "+person.getPhone());
		
		
		System.out.println("-----------------------------");
		
		
		for(BankAccount bankAccount:bankAccounts)
		{
			System.out.println("Account   id is: "+bankAccount.getAccountno());
			System.out.println("Bank  manager name is :"+bankAccount.getAccountholder());
			System.out.println("Bank Brach name is: "+bankAccount.getBranchname());
			
			System.out.println("-----------------------------------");
		}
	}
		else
		{
			System.out.println("Person  doesnot  exist");
		}
	}


	

}
