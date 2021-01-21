package application;

import controller.ElfUtil;
import model.Address;
import model.Child;
import model.Elf;
import view.Console;

import java.util.Scanner;



public class Main {
	public static void main (String[] args) {
		new Console().dialog();
		Scanner scanner = new Scanner(System.in);

	}

	private static void dialog () {

		int input = scanner.nextInt();
		scanner.nextLine;

		switch (input) {
			case 1:
				System.out.println ("Hallo, liebes Kind");
				childLogin ();
				break;
			case 2:
				int pw = 777;
				System.out.println ("Bitte das Passwort eingeben:");
				int sc = Integer.parseInt ((scanner.nextLine ()));


				if (sc == pw) {
					System.out.println ("Lieber SantaClaus");
					santaLogin ();
				} else {
					System.out.println ("Falsches Passwort");
					dialog ();
				}
				break;
			case 3:
				//Elf
				break;

			default:
				System.out.println ("falsche Eingabe! ;)");
				break;

		}

	}

	private static void santaLogin(){
		santaLogin ();
	}

	private static void childLogin() {

	}
	private static void setup() { //Kinder, Elfen, ...

		Child child1 = new Child("Wien",1234,5,"Waldstraße","Austria","Maria",
				"Maier","female",111);

		Elf elf1 = new Elf ("fly","wish list","Trixi","northstreet",2,"polarkreis",123);

	}

}




