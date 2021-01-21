package model;

import java.util.ArrayList;

public class Presents {

	private String presentsName;

	public Presents() {
		ArrayList<String> presentsName = new ArrayList<String> ();
		presentsName.add ("Modellauto");
		presentsName.add ("Barbiepuppe");
		presentsName.add ("Puppenküche");
		presentsName.add ("Carrerbahn");

		// TODO Auto-generated constructor stub
	}

	public String getName () {
		return presentsName;
	}

	public void setName (String name) {
		this.presentsName = presentsName;
	}

	@Override
	public String toString () {
		return "Present{name=" + presentsName +'}';
	}
}
