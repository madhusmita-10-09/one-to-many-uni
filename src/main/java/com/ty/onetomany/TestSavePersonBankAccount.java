package com.ty.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonBankAccount {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("Rashmi");;
		person.setAccountno(113100023021l);
		person.setPhone(993535366l);
		
		BankAccount bankAccount1=new BankAccount();
		bankAccount1.setBranchname("khaira");
		bankAccount1.setAccountno(846688363l);
		bankAccount1.setAccountholder("Nitish");
		
		BankAccount bankAccount2=new BankAccount();
		bankAccount2.setBranchname("kupari");
		bankAccount2.setAccountno(20336363l);
		bankAccount2.setAccountholder("deepak");
		
		
		
		
		List<BankAccount> bankAccounts=new ArrayList<BankAccount>();
		bankAccounts.add(bankAccount1);
		bankAccounts.add(bankAccount2);
		
	    person.setBankAccount(bankAccounts);
		
		entityTransaction.begin();
	    entityManager.persist(person);
	    entityManager.persist(bankAccount1);
	    entityManager.persist(bankAccount2);
		entityTransaction.commit();
		
		

	}

}
