package controller;

import model.Sledge;  //Eigenschaften vom Elf

public class ElfUtil extends Sledge {


	private String skill;
	private String competence;

	public ElfUtil (String skill, String competence) {
		this.skill = skill;
		this.competence = competence;
	}

	public String getSkill () {
		return skill;
	}

	public void setSkill (String skill) {
		this.skill = skill;
	}

	public String getCompetence () {
		return competence;
	}

	public void setCompetence (String competence) {
		this.competence = competence;
	}

	@Override
	public String toString () {
		return "ElfUtil{" +
				"skill='" + skill + '\'' +
				", competence='" + competence + '\'' +
				'}';
	}
	/*
	 * sledge should be prepared here
	 */
}
