package view;

import java.util.Scanner;

public class Console {


	private Scanner scanner;

	/*
	 * the console dialog comes here
	 */
	public void dialog () {
		System.out.println("Please login:");
		System.out.println("1. Santa");
		System.out.println("2. Elf");
		System.out.println("3. Child");
	}

	public void childLogin () {
		System.out.println("Hallo, was möchtest Du machen?");
		System.out.println("1. einloggen");
		System.out.println("2. neu anmelden");
		System.out.println("3. Zurück zum Hauptmenü");
	}

	public void santaLogin() {
		System.out.println("Herzlich willkommen Santa! Was möchtest Du gerne machen?");
		System.out.println("1. Kinder finden nach Namen");
		System.out.println("2. Kinder und deren Wunschgeschenk");
		System.out.println("3. Ist der Schlitten beladen?");
		System.out.println("4. Zurück zum Hauptmenü");

	}
	public void elfLogin() {
		System.out.println("Herzlich willkommen Elf! Was möchtest Du gerne machen?");
		System.out.println("1. Geschenke nach Wohnort ausgeben");
		System.out.println("2. Schlitten beladen");
		System.out.println("4. Zurück zum Hauptmenü");

	}
}




