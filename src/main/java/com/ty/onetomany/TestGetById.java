package com.ty.onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class TestGetById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Mobile mobile=entityManager.find(Mobile.class,1);
		if(mobile!=null)
		{
		List<Sim> sims=mobile.getSim();
		
		System.out.println("------------------------------");
		System.out.println("Mobile name is :"+mobile.getName());
		System.out.println("Mobile cost is : "+mobile.getCost());
		
		System.out.println("-----------------------------");
		
		
		for(Sim sim:sims)
		{
			System.out.println("sim id "+sim.getId());
			System.out.println("sim provider "+sim.getProvider());
			System.out.println("sim type "+sim.getType());
			System.out.println("-----------------------------------");
		}
	}
		else
		{
			System.out.println("no mobile exist");
		}
	}

}
