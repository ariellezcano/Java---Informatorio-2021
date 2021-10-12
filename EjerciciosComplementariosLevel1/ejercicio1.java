package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class ejercicio1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese su nombre:\n");
        nombre = scanner.nextLine();
        scanner.close();
        System.out.println("Hola"+" "+nombre);


    }

}