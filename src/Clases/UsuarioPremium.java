package Clases;

/**
 *
 * @author Axel Zuri
 */
public class UsuarioPremium extends Usuario{
    
    private boolean membresiaActiva;
    
    public UsuarioPremium(int id, String nombre, boolean membresiaActiva){
        super(id, nombre);
        this.membresiaActiva = membresiaActiva;
    }

    public boolean isMembresiaActiva() {
        return membresiaActiva;
    }

    public void setMembresiaActiva(boolean membresiaActiva) {
        this.membresiaActiva = membresiaActiva;
    }
    
    public void mostrarTipo(){
        if(membresiaActiva){
            System.out.println(getNombre()+ " Es usuario Premium");
        } else{
            System.out.println(getNombre()+" No es usuario premium");
        }
    }
}
