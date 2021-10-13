package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String texto;

    texto = scanner.next();

    int totalCharacters = 0;
    char temp;

    for (int i = 0; i < texto.length(); i++) {

        temp = exampleString.charAt(i);
        if (temp == 'i')
            totalCharacters++;
    }

    System.out.println("i appears " + totalCharacters + " times in exampleString");
}

        


    }
}
//Dado un String de entrada (frase, texto, etc) 
//calcular la cantidad de veces que aparece una letra dada.