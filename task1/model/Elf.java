package model;

import controller.ElfUtil;

public class Elf extends ElfUtil {

	private String name;
	private String street;
	private int houseNumber;
	private String country;
	private int password;

	public Elf (String skill, String competence, String name, String street, int houseNumber, String country, int password) {
		super (skill, competence);
		this.name = name;
		this.street = street;
		this.houseNumber = houseNumber;
		this.country = country;
		this.password = password;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public String getStreet () {
		return street;
	}

	public void setStreet (String street) {
		this.street = street;
	}

	public int getHouseNumber () {
		return houseNumber;
	}

	public void setHouseNumber (int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCountry () {
		return country;
	}

	public void setCountry (String country) {
		this.country = country;
	}

	public int getPassword () {
		return password;
	}

	public void setPassword (int password) {
		this.password = password;
	}

	@Override
	public String toString () {
		return "Elf{" +
				"name='" + name + '\'' +
				", street='" + street + '\'' +
				", houseNumber=" + houseNumber +
				", country='" + country + '\'' +
				", password=" + password +
				'}';
	}
}
