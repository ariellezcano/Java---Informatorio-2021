package EjerciciosComplementariosLevel2;

//Se dispone de una colección de Empleados, de cada empleado se conoce:
//Nombre y Apellido
//DNI
//horasTrabajadas
//valorPorHora
//Todos los empleados están cargados en un Set (HashSet),
// se desea calcular el sueldo (horasTrabajadas x valorPorHora) 
//de toda esa lista para luego almacenar en un Map (o Diccionario)
// donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Empleado> personas = new HashSet<>();
        Map<Integer, Integer> almacenar = new HashMap<Integer, Integer>();
        personas.add(new Empleado(35465210, "Guerra Gonzalo", 20, 300));
        personas.add(new Empleado(40201452, "Romero Alejandro", 200, 500));
        personas.add(new Empleado(38875642, "López Romina", 100, 210));
        personas.add(new Empleado(30145987, "Lezcano Ariel", 169, 150));
        personas.add(new Empleado(35589745, "Melgarejo Axel", 165, 200));

        System.out.print("LISTA DE EMPLEADOS:\n");
        for (Empleado i:personas){
            int sueldoT = i.getValorHora() * i.getHorasTrabajadas();
            almacenar.put(i.getDni(), sueldoT);
            System.out.println("Empleado: " + i.getNombre() + " - DNI: " + i.getDni() + " - Sueldo: " + sueldoT);
        }
    }

    static class Empleado{
        private int dni;
        private String nombre;
        private int horasTrabajadas;
        private int valorHora;

        public Empleado(int dni, String nombre, int horasTrabajadas, int valorHora){
            this.dni = dni;
            this.nombre = nombre;
            this.horasTrabajadas = horasTrabajadas;
            this.valorHora = valorHora;
        }

        public int getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }
        
        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public int getValorHora() {
            return valorHora;
        }
    }    

}
