package be.technifutur.exercices.logiqueDeProgrammation;

import java.util.Scanner;

public class Saisir {

    /**
     * 
     * @param scan
     * @return
     */
    public static int scanNumber(Scanner scan) {
        int val = Integer.MIN_VALUE;
        try{
            val = Integer.parseInt(scan.nextLine());
        }catch(NumberFormatException ex){
            System.err.println("Ceci nétait pas un nombre !");
        }
        return val;
    }

    /**
     * 
     * @param scan
     * @return
     */
    public static String scanString(Scanner scan) {
        return scan.nextLine();
    }

    /**
     * 
     * @param scan
     */
    public static void attendreEnter(Scanner scan) {
        System.out.println("faites <Enter> pour continuer");
        Saisir.scanString(scan);
    };
}
