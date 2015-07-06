// Generated 2015-7-6 15:02:17 by Hibernate Tools 3.4.0.CR1
package com.wuyufei.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Userinfo generated by hbm2java
 */
public class Userinfo implements java.io.Serializable {

	private String username;
	private String password;
	private String email;
	private String telephone;
	private Set saleses = new HashSet(0);
	private Set orderLists = new HashSet(0);

	public Userinfo() {
	}

	public Userinfo(String username, String password, String email,
			String telephone) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.telephone = telephone;
	}

	public Userinfo(String username, String password, String email,
			String telephone, Set saleses, Set orderLists) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.telephone = telephone;
		this.saleses = saleses;
		this.orderLists = orderLists;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Set getSaleses() {
		return this.saleses;
	}

	public void setSaleses(Set saleses) {
		this.saleses = saleses;
	}

	public Set getOrderLists() {
		return this.orderLists;
	}

	public void setOrderLists(Set orderLists) {
		this.orderLists = orderLists;
	}

}
