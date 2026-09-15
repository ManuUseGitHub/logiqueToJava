package be.technifutur.exercices.logiqueDeProgrammation.RDactionDAlternativesSimplesEtComposEs;

import java.util.Scanner;

import store.luniversdemm.common.Saisir;

/*************************************************
 * 3.1 Alternative : Equation 1er degré *
 *************************************************/

/*
 * Écrire le programme qui résout l’équation du 1er degré: ax + b = 0
 * Le programme demande à l'utilisateur une valeur pour a et pour b et donne
 * si possible la valeur de x.
 */

public class Ex3_1 {
	public static void main(String[] args) {
		double a = 0;
		double b = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("entrez a");
		a = Saisir.scanDouble(scan);

		System.out.println("entrez b");
		b = Saisir.scanDouble(scan);

		if (a != 0) {
			System.out.println(String.format("x = %.2f", -(b / a)));
		} else if (b == 0) {
			System.err.println(String.format("x est indéterminé, b doit être un nombre non null : %d", b));
		} else {
			System.err.println(String.format("impossible, a doit être un nombre non null : %d", a));
		}
		scan.close();
	}
}