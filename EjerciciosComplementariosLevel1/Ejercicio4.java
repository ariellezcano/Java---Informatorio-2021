package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int factorial = 1;

        System.out.println("Ingrese el número a calcular:");
        numero = scanner.nextInt();
        int numeroCalculado = numero;

        while(numero != 0){
            factorial *= numero; //multiplica el valor de numero por factorial y lo guarda en la variable
            numero --;// decrementa el valor de numero en 1
        }
        System.out.println("El factorial de"+" "+numeroCalculado+" "+"es:"+" "+factorial);
    }
}
