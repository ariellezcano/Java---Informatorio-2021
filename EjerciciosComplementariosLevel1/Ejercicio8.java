package EjerciciosComplementariosLevel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Persona> persona = new ArrayList<Persona>();

        Persona per = new Persona();
        System.out.println("Ingrese nombre:");
        per.setNombre(scanner.nextLine());
        System.out.println("Ingrese apellido:");
        per.setApellido(scanner.nextLine());
        System.out.println("Ingrese edad:");
        per.setEdad(scanner.nextInt());
        System.out.println("Ingrese direccion:");
        scanner.nextLine();
        per.setDireccion(scanner.nextLine());
        System.out.println("Ingrese ciudad:");
        per.setCiudad(scanner.nextLine());
        persona.add(per);

        System.out.println(persona.get(0).getCiudad()+" - "+ persona.get(0).getDireccion()+" - "+ persona.get(0).getEdad()+" - "+ persona.get(0).getNombre()+" "+ persona.get(0).getApellido());
    }

  
}

class Persona {
    //variables
    String nombre;
    String apellido;
    int edad;
    String direccion;
    String ciudad;
    //constructor
    public Persona(){
       

    }
    //constructor
    public Persona(String nombre, String apellido, int edad, String direccion, String ciudad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;

    }
     
  
    //getters y setters
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getCiudad(){
        return ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    
}    

