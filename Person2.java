package org.abijeeth.jdbc;

public class Person2 {
	 private int id;
	 public Person2(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	private String name;
	 private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person2 [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
