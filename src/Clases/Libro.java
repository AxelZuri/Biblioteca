package Clases;

/**
 *
 * @author Axel Zuri
 */
public class Libro {
    
    private int id;
    private String titulo;
    private String autor;
    private boolean disponible;
    
    public Libro(int id, String titulo, String autor, boolean disponible){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void mostrarInfo(){
        System.out.println("ID: " +id);
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Dispoible: "+disponible);
    }
}
