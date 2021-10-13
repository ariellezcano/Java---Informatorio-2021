package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese número a calcular:");
        int numero = scanner.nextInt();
        System.out.println("Ingrese potencia:");
        int potencia = scanner.nextInt();

        int resultado = calcularPotencia(numero,potencia);

        System.out.println(numero+" elevado a "+potencia+" = "+resultado);
    }
    static int calcularPotencia(int num, int pot){
        int respuesta = 1;

        if(num > 0 && pot==0){
            return respuesta;
        }
        else if(num == 0 && pot>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= pot; i++){
                respuesta = respuesta * num;
            }
            return respuesta;
        }
    }
}
