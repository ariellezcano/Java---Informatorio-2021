package EjerciciosComplementariosLevel2;
//Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
//nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final.
//Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y
// si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
//Observacion: Los 2 argumentos indican con que valor se arranca a calcular
 //y el segundo con qué valor debe frenar (no se incluye en el cálculo)
//Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    static ArrayList lista = new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
            
        int num1;
        int num2;
        
        boolean valido = false;
        
        do{
            System.out.println("Ingresa primer número:");
            num1 = scan.nextInt();
            System.out.println("Ingresa segundo número:");
            num2 = scan.nextInt();
            
            valido = Validar(num1, num2);
            if (valido == false){
                System.out.println("El primer numero que ingresó debe ser menor que el segundo");
            }
        }while (valido == false);
        
        lista(num1, num2);

        System.out.println("Listado:\n");
        mostrarLista();
    }

    static boolean Validar(int num1, int num2){
        if (num1 > num2){
            return false;
        }else{
            return true;
        }
    }

    
    
    static void lista(int num1, int num2){
        for(int i = num1; i < num2; i++){
            if (i % 2 == 0 && i % 3 != 0){
                lista.add("Fizz");
            }else if (i % 2 != 0 && i % 3 == 0){
                lista.add("Buzz");
            }else if (i % 2 == 0 && i % 3 == 0){
                lista.add("FizzBuzz");
            }else{
                lista.add(i);
            }
        }
    }
    
    static void mostrarLista(){
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
