package model;

public class Presents {

	private String name;

	public Presents() {


		// TODO Auto-generated constructor stub
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	@Override
	public String toString () {
		return "Present{name=" + name +'}';
	}
}
