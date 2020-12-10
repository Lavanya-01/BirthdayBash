package com.birthday.birthdaybash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Abhi {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long aId;
	private String aName;
	private String aPassword;
	public Abhi() {
		super();
	}
	public Abhi(String aName, String aPassword) {
		super();
		this.aName = aName;
		this.aPassword = aPassword;
	}
	public long getaId() {
		return aId;
	}
	public void setaId(long aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaPassword() {
		return aPassword;
	}
	public void setaPassword(String aPassword) {
		this.aPassword = aPassword;
	}
	@Override
	public String toString() {
		return "Abhi [aId=" + aId + ", aName=" + aName + ", aPassword=" + aPassword + "]";
	}
	
	
	
	

}
