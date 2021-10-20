package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList)
// e imprimir dichos cursos.
public class Ejercicio4 {
    public static void main(String[] args) {
        List <String> alumnos = new ArrayList<>(); 
        Scanner consola = new Scanner(System.in);

        String nombres; 

        for (int i = 0; i < 12; i++) {
            System.out.println("Ingrese nombre del alumno");
            nombres = consola.nextLine();
            alumnos.add(nombres);
            System.out.println("***************************");
        }
        System.out.println("\n");

        System.out.println("Listado completo de alumnos");
        for (int i = 0; i < alumnos.size(); i++) {
            System.out.println("alumno:"+" "+alumnos.get(i));
        }
        System.out.println("***************************\n");

        
        List<String> curso1 = alumnos.subList(0,4);
        System.out.println("Lista 1");
        for (int i = 0; i < curso1.size(); i++) {
            System.out.println("alumno:"+" "+curso1.get(i));
        }
        System.out.println("***************************\n");
        List<String> curso2 = alumnos.subList(4,8);
        System.out.println("Lista 2");
        for (int i = 0; i < curso2.size(); i++) {
            System.out.println("alumno:"+" "+curso2.get(i));
        }
        System.out.println("***************************\n");
        List<String> curso3 = alumnos.subList(8,12);
        System.out.println("Lista 3");
        for (int i = 0; i < curso3.size(); i++) {
            System.out.println("alumno:"+" "+curso3.get(i));
        }
        System.out.println("***************************");
    }
}
