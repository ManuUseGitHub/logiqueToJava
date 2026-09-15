package be.technifutur.exercices.logiqueDeProgrammation.RDactionsDeBouclesTantQue;

import java.util.Scanner;

import store.luniversdemm.common.Saisir;

/*************************************************
 * 4.2 boucle «tant que» : Moyenne *
 *************************************************/

/*
 * Ecrire le programme qui calcule la moyenne d'une série de nombres entrés
 * au clavier.
 */

// La fin de la série sera annoncée par un 100.

public class Ex4_2 {
	public static void main(String[] args) {

		int _n = 0;
		int _somme = 0;
		int _nombre = 0;

		String _message = "Entrez un relevé. Terminez par la valeur 100 (non repris)!";

		Scanner scan = new Scanner(System.in);
		System.out.println(_message);
		_nombre = Saisir.scanNumber(scan);

		while (_nombre != 100) {
			++_n;
			_somme += _nombre;

			System.out.println(_message);
			_nombre = Saisir.scanNumber(scan);

		}
		if (_n == 0) {
			System.out.println("aucun relevé entrée");
		} else {
			System.out.println("la moyenne est:");
			System.out.println(_somme / (_n));
		}
	}
}