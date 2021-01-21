package model;

import java.util.Scanner;

public class Child extends Address {

	private String firstName;
	private String secondName;
	private String sex;
	private int password;

	public Child (String city, int postcode, int houseNumber, String street, String country, String firstName, String secondName, String sex, int password) {
		super (city, postcode, houseNumber, street, country);
		this.firstName = firstName;
		this.secondName = secondName;
		this.sex = sex;
		this.password = password;
	}

	public String getFirstName () {
		return firstName;
	}

	public void setFirstName (String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName () {
		return secondName;
	}

	public void setSecondName (String secondName) {
		this.secondName = secondName;
	}

	public String getSex () {
		return sex;
	}

	public void setSex (String sex) {
		this.sex = sex;
	}

	public int getPassword () {
		return password;
	}

	public void setPassword (int password) {
		this.password = password;
	}

	@Override
	public String toString () {
		return "Child{" +
				"firstName='" + firstName + '\'' +
				", secondName='" + secondName + '\'' +
				", sex='" + sex + '\'' +
				", password=" + password +
				'}';
	}
}