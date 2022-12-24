package anagrama;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author paucape
 */

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

public class Anagrama {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String p01;
        String p02;

        System.out.println("Introduce la primera palabra: ");
        p01 = scanner.nextLine();
        System.out.println("Introduce la segunda palabra: ");
        p02 = scanner.nextLine();

        System.out.println(anagrama(p01, p02));
    }

    static boolean anagrama(String p01, String p02) {

        if (p01.length() != p02.length()) {
            return false;
        }
        
        char[] a01 = p01.toCharArray();
        char[] a02 = p02.toCharArray();

        Arrays.sort(a01);
        Arrays.sort(a02);

        return Arrays.equals(a01, a02);
    }
}
