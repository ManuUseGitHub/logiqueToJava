package be.technifutur.exercices.logiqueDeProgrammation;

import java.util.Scanner;

/***********************************************
 * 1.3 Assignation : Permutation 2 variables *
 ***********************************************/

/*
 * Ecrire le programme qui permet de permuter les valeurs de X et de Y.
 * La valeur de X vaut 3 et la valeur de Y vaut 5.
 */
public class GestionDesVariables1_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("=== Version A ===");
		Saisir.attendreEnter(scan);
		versionA(scan);

		System.out.println("=== Version B ===");
		Saisir.attendreEnter(scan);
		versionB(scan);

		scan.close();
	}

	private static void versionA(Scanner scan) {
		int x;
		int y;

		System.out.println("Entrez X :");
		x = Saisir.scanNumber(scan);

		System.out.println("Entrez Y :");
		y = Saisir.scanNumber(scan);

		System.out.println(String.format("x = %d ; y = %d", x, y));

		if (x != Integer.MIN_VALUE || y != Integer.MIN_VALUE) {
			x = y + x;
			y = x - y;
			x = x - y;

			System.out.println(String.format("x = %d ; y = %d", x, y));
		} else {
			System.err.println("Une des entrées nétait pas un nombre ...");
		}

	}

	private static void versionB(Scanner scan) {
		int x;
		int y;
		int z;
		System.out.println("Entrez X :");
		x = Saisir.scanNumber(scan);

		System.out.println("Entrez Y :");
		y = Saisir.scanNumber(scan);

		System.out.println(String.format("x = %d ; y = %d", x, y));

		z = x;
		x = y;
		y = z;

		System.out.println(String.format("x = %d ; y = %d", x, y));
		Saisir.attendreEnter(scan);
	}
}