package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> ciudades = new ArrayList<String>();
        String ciudad;

        System.out.println("Ingrese nombre de la ciudad");
        ciudad = input.nextLine();
        System.out.println("************************");
        ciudades.add(ciudad);
        while(true){
            System.out.println("Desea seguir agregando ciudades? 1=si / 2=no");
            int resultado = input.nextInt();
            input.nextLine();
            if (resultado == 1) {
                System.out.println("Ingrese nombre de la ciudad");
                ciudad = input.nextLine();
                System.out.println("************************");
                ciudades.add(ciudad);
            } else {
                System.out.println("************************");
                System.out.println("Carga finalizada");
                System.out.println("************************");
                System.out.println("Ranking");
                for (int i = 0; i < ciudades.size(); i++) {
                    System.out.println(i+1 +" "+ ciudades.get(i));
                }
                break;            
            }
                    
        }       
    
    }
}

    


