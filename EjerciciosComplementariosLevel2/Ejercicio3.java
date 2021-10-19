package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//Crear una lista que contenga como elementos la numeración de cartas
// de una baraja francesa (solo los valores, no figuras). 
// Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), 
//desordenar (mezclar) el arrayList y volver a imprimir.
public class Ejercicio3 {
    public static void main(String[] args) {
        List <String> barajaFrancesa = new ArrayList<>();
        //PICAS
        barajaFrancesa.add(0,"A = PICAS");
        barajaFrancesa.add(1,"2 = PICAS");
        barajaFrancesa.add(2,"3 = PICAS");
        barajaFrancesa.add(3,"4 = PICAS");
        barajaFrancesa.add(4,"5 = PICAS");
        barajaFrancesa.add(5,"6 = PICAS");
        barajaFrancesa.add(6,"7 = PICAS");
        barajaFrancesa.add(7,"8 = PICAS");
        barajaFrancesa.add(8,"9 = PICAS");
        barajaFrancesa.add(9,"10 = PICAS");
        barajaFrancesa.add(10,"J = PICAS");
        barajaFrancesa.add(11,"Q = PICAS");
        barajaFrancesa.add(12,"K = PICAS");
        //CORAZONES
        barajaFrancesa.add(13,"A = CORAZONES");
        barajaFrancesa.add(14,"2 = CORAZONES");
        barajaFrancesa.add(15,"3 = CORAZONES");
        barajaFrancesa.add(16,"4 = CORAZONES");
        barajaFrancesa.add(17,"5 = CORAZONES");
        barajaFrancesa.add(18,"6 = CORAZONES");
        barajaFrancesa.add(19,"7 = CORAZONES");
        barajaFrancesa.add(20,"8 = CORAZONES");
        barajaFrancesa.add(21,"9 = CORAZONES");
        barajaFrancesa.add(22,"10 = CORAZONES");
        barajaFrancesa.add(23,"J = CORAZONES");
        barajaFrancesa.add(24,"Q = CORAZONES");
        barajaFrancesa.add(25,"K = CORAZONES");
        //TREBOL
        barajaFrancesa.add(26,"A = TREBOL");
        barajaFrancesa.add(27,"2 = TREBOL");
        barajaFrancesa.add(28,"3 = TREBOL");
        barajaFrancesa.add(29,"4 = TREBOL");
        barajaFrancesa.add(30,"5 = TREBOL");
        barajaFrancesa.add(31,"6 = TREBOL");
        barajaFrancesa.add(32,"7 = TREBOL");
        barajaFrancesa.add(33,"8 = TREBOL");
        barajaFrancesa.add(34,"9 = TREBOL");
        barajaFrancesa.add(35,"10 = TREBOL");
        barajaFrancesa.add(36,"J = TREBOL");
        barajaFrancesa.add(37,"Q = TREBOL");
        barajaFrancesa.add(38,"K = TREBOL");
        //DIAMANTE
        barajaFrancesa.add(39,"A = DIAMANTE");
        barajaFrancesa.add(40,"2 = DIAMANTE");
        barajaFrancesa.add(41,"3 = DIAMANTE");
        barajaFrancesa.add(42,"4 = DIAMANTE");
        barajaFrancesa.add(43,"5 = DIAMANTE");
        barajaFrancesa.add(44,"6 = DIAMANTE");
        barajaFrancesa.add(45,"7 = DIAMANTE");
        barajaFrancesa.add(46,"8 = DIAMANTE");
        barajaFrancesa.add(47,"9 = DIAMANTE");
        barajaFrancesa.add(48,"10 = DIAMANTE");
        barajaFrancesa.add(49,"J = DIAMANTE");
        barajaFrancesa.add(50,"Q = DIAMANTE");
        barajaFrancesa.add(51,"K = DIAMANTE");        

        System.out.println("BARAJA FRANCESA");
        for (int i = 0; i < barajaFrancesa.size() ; i++) {
            System.out.println(barajaFrancesa.get(i));
        }

        System.out.println("ORDENAR BARAJA FRANCESA");
        Collections.sort(barajaFrancesa);
        for (int i = 0; i < barajaFrancesa.size() ; i++) {
            System.out.println(barajaFrancesa.get(i));
        }
    
        System.out.println("MEZCLAR BARAJA FRANCESA");
        Collections.shuffle(barajaFrancesa);
        for (int i = 0; i < barajaFrancesa.size() ; i++) {
            System.out.println(barajaFrancesa.get(i));
        }
    
    }
}
