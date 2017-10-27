package com.flymvc.demo.model;

import com.flymvc.annotation.Id;
import com.flymvc.annotation.Ignore;
import com.flymvc.annotation.Table;
import com.flymvc.model.Model;

@Table("tb_user")
public class User extends Model{
	
	/**
	 * 
	 */
	@Ignore
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	
	private String name;
	
	private String password;
	
	private int age;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public User() {
	}

	public User(Integer id, String name, String password, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}

	
}
