package application;

import model.Address;
import model.Child;
import view.Console;

import java.util.Scanner;



public class Main {
	public static void main (String[] args) {
		new Console().dialog();
		Scanner scanner = new Scanner(System.in);
		dialog();
	}

	private static void dialog () {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.nextLine();

		switch (input) {
			case 1: //Santa login
				System.out.println("Herzlich willkommen Santa, bitte geben Sie Ihr Passwort ein:");
				santaLogin();
				break;
			case 2:  //Elf login
				System.out.println("Herzlich willkommen Elf, bitte gib dein Passwort ein:");
				break;
			case 3:  //Child login
				System.out.println("Herzlich willkommen Kind");

				break;

			default:
				System.out.println("falsche Eingabe!");
				break;
		}
	}
	private static void santaLogin () {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.nextLine();

		switch (input) {
		}

	}
	private static void childLogin() {

	}






	private static void setup() {

		Child child1 = new Child("Wien",1234,5,"Waldstraße","Austria","Maria",
				"Maier","female",111);
	}

}



