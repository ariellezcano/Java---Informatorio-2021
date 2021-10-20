package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {

//Dados 2 ArrayList que contienen horas-trabajadas (array1) y 
//valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. 
//Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.

    public static void main(String[] args) {
        List <Integer> horastrabajadas = new ArrayList<Integer>();
        List <Integer> valorxhora = new ArrayList<Integer>();
        List <Integer> total = new ArrayList<Integer>(); 

        Scanner consola = new Scanner(System.in);
        
        int horas;
        int valor;
        int totalM;

        System.out.println("Ingrese horas trabajadas");
        for (int i = 0; i < 5; i++) {
            horas = consola.nextInt();
            horastrabajadas.add(horas);
        }

        System.out.println("\n");

        System.out.println("Ingrese valor por hora");
        for (int i = 0; i < 5; i++) {
            valor = consola.nextInt();
            valorxhora.add(valor);
        }
        System.out.println("\n");
        System.out.println("multiplicar la matriz");
        //multiplicar la matriz
        for (int i = 0; i < 5; i++) {
            totalM = horastrabajadas.get(i) * valorxhora.get(i);
           System.out.println("multiplicar la matriz" + totalM);
           total.add(totalM);
        }

        System.out.println("\n");
        System.out.println("totales");
        
        for (int i = 0; i < total.size(); i++) {
           System.out.println(total.get(i));
        }
        
    }
}
