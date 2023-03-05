package com.springcore.ref;

public class Student {
private int id;
private String name;
private Address address;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + ", getId()=" + getId() + ", getName()="
			+ getName() + ", getAddress()=" + getAddress() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
