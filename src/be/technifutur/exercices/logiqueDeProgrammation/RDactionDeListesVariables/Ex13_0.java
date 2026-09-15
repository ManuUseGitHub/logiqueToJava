package be.technifutur.exercices.logiqueDeProgrammation.RDactionDeListesVariables;

import be.technifutur.libs.Liste;
import be.technifutur.libs.ListeUtil;

// testList class
public class Ex13_0 {
	public static void main(String[] args) {
		// test 1
		System.out.println("test 1, peek");
		Liste maListe = new Liste();
		maListe.setValue(5);
		System.out.println(ListeUtil.peek(maListe));

		// test 2
		System.out.println("test 2, size");
		Liste maListe2 = new Liste();
		System.out.println(ListeUtil.size(maListe2));

		// test 3
		System.out.println("test 3, push");
		Liste maListe3 = new Liste();
		maListe.setValue(0);

		System.out.println(ListeUtil.size(maListe3));
		maListe3 = ListeUtil.push(maListe3, 1);
		maListe3 = ListeUtil.push(maListe3, 2);
		maListe3 = ListeUtil.push(maListe3, 3);
		System.out.println(ListeUtil.size(maListe3));

		// test 4
		System.out.println("test 4, get");
		System.out.println(ListeUtil.get(maListe3, 1).getValue());
		System.out.println(ListeUtil.get(maListe3, 2).getValue());
		System.out.println(ListeUtil.get(maListe3, 3).getValue());
		System.out.println(ListeUtil.get(maListe3, 4).getValue());

		// test 5
		System.out.println("test 5, update");
		ListeUtil.update(maListe3, 3, 99);

		System.out.println(ListeUtil.get(maListe3, 1).getValue());
		System.out.println(ListeUtil.get(maListe3, 2).getValue());
		System.out.println(ListeUtil.get(maListe3, 3).getValue());
		System.out.println(ListeUtil.get(maListe3, 4).getValue());
		ListeUtil.update(maListe3, 3, 1);

		// test 6
		System.out.println("test 6, add");
		ListeUtil.add(maListe3, 100);
		System.out.println(ListeUtil.get(maListe3, 5).getValue());

		// test 7
		System.out.println("test 7, pop");
		int size = ListeUtil.size(maListe3) - 1;

		for (int i = 0; i < size; ++i) {
			maListe3 = ListeUtil.pop(maListe3);
		}

		System.out.println(ListeUtil.size(maListe3));

		// test 8
		System.out.println("test 8, delete");
		Liste maListe4 = new Liste();
		maListe4.setValue(0);

		maListe4 = ListeUtil.push(maListe4, 1);
		maListe4 = ListeUtil.push(maListe4, 2);
		maListe4 = ListeUtil.push(maListe4, 3);
		maListe4 = ListeUtil.push(maListe4, 4);

		ListeUtil.delete(maListe4, 2);

		System.out.println(ListeUtil.get(maListe4, 1).getValue());
		System.out.println(ListeUtil.get(maListe4, 2).getValue());
		System.out.println(ListeUtil.get(maListe4, 3).getValue());

		// test 9
		System.out.println("test 8, delete");
		Liste maListe5 = new Liste();
		maListe4.setValue(0);

		maListe5 = ListeUtil.push(maListe5, 1);
		maListe5 = ListeUtil.push(maListe5, 2);
		maListe5 = ListeUtil.push(maListe5, 3);
		maListe5 = ListeUtil.push(maListe5, 4);

		ListeUtil.delete(maListe5, 2);

		System.out.println(ListeUtil.get(maListe5, 1).getValue());
		System.out.println(ListeUtil.get(maListe5, 2).getValue());
		System.out.println(ListeUtil.get(maListe5, 3).getValue());
	}
}