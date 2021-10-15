package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> ciudades = new ArrayList<String>();
        System.out.println("QUE DESEA REALIZAR:");
        System.out.println("1 = AGREGAR CIUDADES / 2 = VER RANKING");

        int valor = input.nextInt();
        String ciudad;
        switch (valor) {
            case 1:{  
                    System.out.println("Ingrese nombre de la ciudad");
                    input.nextLine();
                    ciudad = input.nextLine();
                    System.out.println("************************");
                    ciudades.add(ciudad);
                while(true){
                    System.out.println("Desea seguir agregando ciudades? 1=si / 2=no");
                    int pregunta = input.nextInt();
                    int respuesta = pregunta;
                    if (respuesta == 1) {
                        System.out.println("Ingrese nombre de la ciudad");
                        input.nextLine();
                        ciudad = input.nextLine();
                        System.out.println("************************");
                        ciudades.add(ciudad);
                    } else {
                        System.out.println("************************");
                        System.out.println("Carga finalizada");        
                    }
                    break;
                }
                
            }
                
                //
            case 2:{
                System.out.println("Mostrar elementos");
                for (int i = 0; i < ciudades.size(); i++) {
                    System.out.println("1"+ ciudades.get(0));
                    System.out.println("2"+ ciudades.get(0));
                    System.out.println("3"+ ciudades.get(0));
                }
                
            }
                break;
            default:
                System.out.println("DEBE SELECCIONAR UN ELEMENTO");
                break;
 
            }       
    
    }
}

    


