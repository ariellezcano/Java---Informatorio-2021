package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        
        int numero1, numero2;

        System.out.println("Introduce dos número enteros");
        System.out.print("Introduce número 1: ");
        numero1 = numeros.nextInt();
        System.out.print("Introduce número 2: ");
        numero2 = numeros.nextInt();
        
        int multi = multi(numero1, numero2);
        
        System.out.println("La multiplicación "+numero1+" x "+numero2+" = "+multi);
    }
   
    static int multi(int numero1, int numero2){
        int mul = 0;
        if((numero1 != 0) && (numero2 != 0)){
            for (int i = 0; i < numero2; i++) {
                mul += numero1;
            }
        }
        return mul;
    }



}
