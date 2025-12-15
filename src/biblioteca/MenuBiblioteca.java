package biblioteca;

import Clases.Biblioteca;
import Clases.Libro;
import java.util.Scanner;

/**
 *
 * @author Axel Zuri
 */
public class MenuBiblioteca {
    
    static Scanner scan = new Scanner(System.in);
    static Biblioteca biblioteca = new Biblioteca();
    
    public static void main(String[] args) {
        int opcion = 0;
        
        while (opcion!=5){
            System.out.println("Bienvenido a la biblioteca");
            System.out.println("1.- Registrar libros");
            System.out.println("2.- Prestar libros");
            System.out.println("3.- Devolver libros");
            System.out.println("4.- Mostrar libros");
            System.out.println("5.- Salir");
            opcion = scan.nextInt();
            scan.nextLine();
            
            switch(opcion){
                case 1: registrarLibro();
                break;
                
                case 2: prestarLibros();
                break;
                
                case 3: devolverLibros();
                break;
                
                case 4: mostrarLibros();
                break;
                
                case 5: System.out.println("Saliendo...");
                break;
                
                default: System.out.println("Error: Ingresa una opcion correcta");
                break;
            }
        }
    }
    
    public static void registrarLibro(){
        System.out.println("Ingresa el nombre del libro");
        String nombre = scan.nextLine();
        
        System.out.println("Ingresa el nombre del autor");
        String autor = scan.nextLine();
        
        Libro libro = new Libro(nombre, autor, true);
        
        biblioteca.agregarLibro(libro);
    }
    
    public static void prestarLibros(){
        System.out.println("Ingresa el ID del libro");
        int id = scan.nextInt();
        scan.nextLine();
        
        biblioteca.prestarLibro(id);
    }
    
    public static void devolverLibros(){
        System.out.println("Ingresa el ID del libro");
        int id = scan.nextInt();
        scan.nextLine();
        
        biblioteca.devolverLibro(id);
    }
    
    public static void mostrarLibros(){
        System.out.println("Lista de libros:");
        
        biblioteca.mostrarLibro();
    }
}
