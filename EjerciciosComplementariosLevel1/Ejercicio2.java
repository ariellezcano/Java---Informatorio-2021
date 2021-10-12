package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Operaciones: SUMA, RESTA, MULTIPLICACION, DIVISION\n");
        System.out.println("Ingrese el primer número:\t");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número:\t");
        num2 = scanner.nextInt();

        /*Ejercicios*/
        int suma = num1 + num2;
        System.out.println(num1 +" + "+num2+": "+suma);
        int resta = num1 - num2;
        System.out.println(+ num1 +" - "+num2+": "+resta);
        int multiplicacion = num1 * num2;
        System.out.println(num1 +" * "+num2+": "+multiplicacion);
        int division = num1 / num2;
        System.out.println(num1 +" / "+num2+": "+division);
        int modulo = num1 % num2;
        System.out.println(num1 +" % "+num2+": "+modulo);
        
    }
    
}

/*Realizar un programa que solicite por consola 2 números enteros.
 Para luego imprimir el resultado de la suma, resta, multiplicación,
  división y módulo (resto de la división) de ambos números.*/
