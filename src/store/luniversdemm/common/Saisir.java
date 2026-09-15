package store.luniversdemm.common;

import java.util.Scanner;

public class Saisir {

    /**
     * Permet à l'utilisateur d'encoder un nombre
     * @param scan une référence vers le scanner
     * @return un nombre qui vaut la valeur rentrée
     * Dans le cas où une valeur entrée ne peut être parsé en entier
     * la valeur de retour est égale à Integer.MIN_VALUE (-2147483648) ou -2^31^ pour signifier
     * un NOT a NUMBER
     */
    public static int scanNumber(Scanner scan) {
        int val = Integer.MIN_VALUE;
        try {
            val = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException ex) {
            System.err.println("Ceci nétait pas un nombre !");
        }
        return val;
    }

    /**
     * Permet à l'utilisateur d'encoder un nombre
     * 
     * @param scan une référence vers le scanner
     * @return un nombre qui vaut la valeur rentrée
     *         Dans le cas où une valeur entrée ne peut être parsé en entier
     *         la valeur de retour est égale à Integer.MIN_VALUE
     *         (0x0.0000000000001P-1022) ou
     *         -2^-1074^ pour signifier
     *         un NOT a NUMBER
     */
    public static double scanDouble(Scanner scan) {
        double val = Double.MIN_VALUE;
        try {
            val = Double.parseDouble(scan.nextLine());
        } catch (NumberFormatException ex) {
            System.err.println("Ceci nétait pas un nombre !");
        }
        return val;
    }

    /**
     * Permet à l'utilisateur d'encoder une chaine
     *
     * @param scan une référence vers le scanner
     * @return
     */
    public static String scanString(Scanner scan) {
        return scan.nextLine();
    }

    /**
     * Permet d'attendre que l'utilisateur soit mentalement pret passer àà la suite
     *
     * @param scan une référence vers le scanner
     */
    public static void attendreEnter(Scanner scan) {
        System.out.println("faites <Enter> pour continuer");
        Saisir.scanString(scan);
    };
}
