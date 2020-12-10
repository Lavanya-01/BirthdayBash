package com.birthday.birthdaybash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String about;
	
	private String wishes;
	
	
	public Users() {
		super();
	}


	public Users(String name, String about, String wishes) {
		super();
		this.name = name;
		this.about = about;
		this.wishes = wishes;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAbout() {
		return about;
	}


	public void setAbout(String about) {
		this.about = about;
	}


	public String getWishes() {
		return wishes;
	}


	public void setWishes(String wishes) {
		this.wishes = wishes;
	}


	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", about=" + about + ", wishes=" + wishes + "]";
	}
	
	


	

}
