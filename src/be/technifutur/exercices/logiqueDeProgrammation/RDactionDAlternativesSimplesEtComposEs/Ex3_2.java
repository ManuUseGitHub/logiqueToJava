package be.technifutur.exercices.logiqueDeProgrammation.RDactionDAlternativesSimplesEtComposEs;

import java.util.Scanner;

import store.luniversdemm.common.Saisir;

/*************************************************
 * 3.2 Alternative : Comparaison de 2 nombres *
 *************************************************/

/*
 * Écrire le programme qui compare deux nombres et qui indique quel est le plus
 * grand ou s’ils sont égaux.
 */

public class Ex3_2 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("entrez a");
		a = Saisir.scanNumber(scan);

		System.out.println("entrez b");
		b = Saisir.scanNumber(scan);

		if (a == b) {
			System.out.println(String.format("a = b : %d", a));
		} else if (a > b) {
			System.out.println(String.format("a > b : %d > %d", a, b));
		} else {
			System.out.println(String.format("a < b : %d < %d", a, b));
		}
	}
}