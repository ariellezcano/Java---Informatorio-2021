package EjerciciosComplementariosLevel2;
//Crear un ArrayList, agregar 5 números enteros.
// Luego, agregar un número entero al principio de la lista y otro al final.
// Por último, iterar e imprimir los elementos de la lista
// y el tamaño de la misma (antes y después de agregar a en la primera y última posición).

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listnumeros = new ArrayList<>();
        
        int numeros;
        System.out.println("************************");
        System.out.println("Ingrese 5 números enteros");
        
        for (int i = 0; i < 5; i++) {
            numeros = scanner.nextInt();
            listnumeros.add(numeros);
        }
        
        System.out.println("Números agregados");
        for (int i = 0; i < listnumeros.size(); i++) {
            System.out.println(i+1+" "+""+listnumeros.get(i));
        }

        if (listnumeros.size()!=0){
            System.out.println("Agregar elemento al principio");
            numeros = scanner.nextInt();
            listnumeros.add(0, numeros);
            System.out.println("Lista actualizada con el número al principio de la lista");
            for (int i = 0; i < listnumeros.size(); i++) {
                System.out.println(i+1+" "+""+listnumeros.get(i));
            }
            System.out.println("Agregar elemento al final de la lista");
            numeros = scanner.nextInt();
            listnumeros.add(listnumeros.size(), numeros);
            
        }

        System.out.println("Lista actualizada");
        System.out.println("Tamaño de la lista"+" "+listnumeros.size());
        for (int i = 0; i < listnumeros.size(); i++) {
            System.out.println(i+1+" "+""+listnumeros.get(i));
        }

    }
  
}
