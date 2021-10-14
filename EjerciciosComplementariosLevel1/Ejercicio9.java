package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String texto;
    int totalCaracteres = 0;
    char letra;


    System.out.println("Ingrese texto:");
    texto = scanner.nextLine();
    
    System.out.println("Ingrese letra a buscar:");
    letra = scanner.next().charAt(0);
    scanner.close();

    for (int i = 0; i < texto.length(); i++) {
        char indice = texto.charAt(i);

        if (letra == indice){
            totalCaracteres++;
        } 
    }
    
   if (totalCaracteres == 0){
       System.out.println("La letra"+" "+ letra +" "+"no existe dentro del texto");
   }else{
    System.out.println("la cantidad de "+ letra +" en el sistema es:"+" "+totalCaracteres);
   }
    }
}