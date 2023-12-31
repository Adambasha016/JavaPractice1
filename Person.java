package org.abijeeth.jdbc;

public class Person implements Comparable<Person> {
 private int id;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
}
@Override
public int compareTo(Person o) {
	
	// TODO Auto-generated method stub
	return o.getName().compareTo(o.getName());
}
 
}
