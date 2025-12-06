package Clases;

import java.util.ArrayList;

/**
 *
 * @author Axel Zuri
 */
public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;
    
    public Biblioteca(){
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro agregado: "+libro.getTitulo());
    }
}
