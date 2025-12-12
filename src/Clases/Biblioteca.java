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
    
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario agregado: "+usuario.getNombre());
    }
    
    public void mostrarLibro(){
        if (libros.isEmpty()){
            System.out.println("No hay libros en la biblioteca");
        } else {
            for(Libro libro : libros){
                libro.mostrarInfo();
            }
        }
    }
    
    public void prestarLibro(int idLibro){
        Libro libro = buscarLibroPorId(idLibro);
        if(libro == null){
            System.out.println("Error: el libro con ID "+idLibro+ " no existe");
        } else if (!libro.isDisponible()){
            System.out.println("El libro: '"+libro.getTitulo()+ "' no esta disponible.");
        } else {
            libro.setDisponible(false);
            System.out.println("Se ha prestado el libro: "+libro.getTitulo());
        }
    }
    
    public void devolverLibro(int idLibro){
        Libro libro = buscarLibroPorId(idLibro);
        if(libro == null){
            System.out.println("Error: el libro con ID "+idLibro+ " no existe");
        } else if (!libro.isDisponible()){
            System.out.println("El libro: '"+libro.getTitulo()+ "' no esta disponible");
        } else {
            libro.setDisponible(true);
            System.out.println("Se ha prestado el libro: "+libro.getTitulo());
        }
    }
    
    private Libro buscarLibroPorId(int idLibro){
        for(Libro libro : libros){
            if(libro.getId() == idLibro){
                return libro;
            }
        }
        return null;
    }
}
