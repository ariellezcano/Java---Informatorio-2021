package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Ingrese número: \t");
        numero = scanner.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            System.out.println("");
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
        }
        System.out.println("");
    }
}
