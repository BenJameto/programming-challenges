package sucesionfibonacci;

/**
 *
 * @author pauca
 */

/*
 * Escribe un programa que imprima los 50 primeros números 
 * de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en 
 * la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

public class SucesionFibonacci {

    public static void main(String[] args) {

        /* Las variables de tipo int presentan un problema una vez 
         * alcanzan su límite, empiezan a representar números negativos
         */
        int aux01 = 0;
        int aux02 = 1;
        int aux03 = 0;

        // Impresión de los primeros dos números de la sucesión
        System.out.print("(" + aux01);
        System.out.print(", " + aux02);

        for (int i = 0; i <= 50; i++) {

            // Sumatorio de las variables
            aux03 = aux01 + aux02;

            System.out.print(", " + aux03);

            // Cambiamos los números de las variables para que sean los dos últimos
            aux01 = aux02;
            aux02 = aux03;
        }
        System.out.println(")");
    }
}
