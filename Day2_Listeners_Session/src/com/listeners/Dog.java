package com.listeners;

//Connection  object
public class Dog {
	private String dogName;

	public Dog(String dogName) {
		this.dogName = dogName;
	}

	@Override
	public String toString() {
		return "Dog [dogName=" + dogName + "]";
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	
	
}