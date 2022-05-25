package com.ty.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String branchname;
	private long accountno;
	private String accountholder;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the branchname
	 */
	public String getBranchname() {
		return branchname;
	}
	/**
	 * @param branchname the branchname to set
	 */
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	/**
	 * @return the accountno
	 */
	public long getAccountno() {
		return accountno;
	}
	/**
	 * @param accountno the accountno to set
	 */
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	/**
	 * @return the accountholder
	 */
	public String getAccountholder() {
		return accountholder;
	}
	/**
	 * @param accountholder the accountholder to set
	 */
	public void setAccountholder(String accountholder) {
		this.accountholder = accountholder;
	}
	
	

}
