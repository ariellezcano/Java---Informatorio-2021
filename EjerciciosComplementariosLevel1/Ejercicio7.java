package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
  static StringBuilder sb = new StringBuilder();
  public static void main(String args[]){
    //public static String ReverseCases(String str) {
      Scanner scanner = new Scanner(System.in);

      String texto ;

      System.out.println("Ingrese texto para su conversión:");
      texto = scanner.nextLine();

      String resultado = Procedimiento(texto);

      System.out.println(resultado);
      
      
  }
  
  static String Procedimiento(String texto){
        
    for (int i = 0; i < texto.length(); i++) {
      char temp;
      if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
        temp = (char)(texto.charAt(i) - 32);
      }
      else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z'){
        temp = (char)(texto.charAt(i) + 32);
      }
      else {
        temp = texto.charAt(i);
      }

      sb.append(temp);
    }
    return sb.toString();
  }   
    
}
      

