/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import java.time.Clock;
import static test1.util.Consoleutil.lireTexte;
import static test1.util.MathUtil.nombreEntre1Et100;

/**
 *
 * @author admin
 */
public class JeuNombreSecret {

//    //public static int nombre() {
//      //  double nombreSDecretDecimal = Math.random() * 100 + 1;
//       // int nombreSecret = (int) nombreSDecretDecimal;
//        return nombreSDecretDecimal
    //}
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {
        int nombre = nombreEntre1Et100();
        System.out.println(nombre);
        int n;
        int m = 1;

        do {
            String s = lireTexte("Veuillez entrer un nombre");
            n = Integer.valueOf(s);
            m = m + 1;
            if (n == nombre) {
                System.out.println("Gagné en" + m + "essaies");
            } else if (n < nombre) {
                System.out.println("inférieur");

            } else {
                System.out.println("supérieur");
            }

        } while (nombre != n);
        System.out.println("Gagné en" + m + "essaies");

        {
            if (m < 3) {
                System.out.println("GENIAL");
            } else if (m < 6) {
                System.out.println("SUPER)");

            } else if (m < 9) {
                System.out.println("COOL");
            }
        }

    }

}
