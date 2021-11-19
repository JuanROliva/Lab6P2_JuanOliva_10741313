package lab6p2_juanoliva_10741313;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class PokeGrupo {
    private String nombre;
    private ArrayList<Usuario> miembros = new ArrayList();
    private Date creacion;
    private Usuario lider;
    private String tipo;

    public PokeGrupo() {
    }
    
    public PokeGrupo(String nombre, Date creacion, Usuario lider, String tipo) {
        this.nombre = nombre;
        this.creacion = creacion;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public void tipoGrupo(){
        int cantidad = miembros.size();
        switch (cantidad) {
            case 1: 
            case 2: 
            case 3: 
                tipo = "Novato";
                break;
                
            case 4: 
            case 5: 
            case 6: 
            case 7: 
                tipo = "Veterano";
                break;
            default:
                if (cantidad>=8) {
                    tipo = "Legendario";
                }else{
                    tipo = "No determinado";
                }
            break;
        }
    }
    
    public boolean cambioLider(){
        int cantidad = miembros.size();
        if (cantidad > 0) {
            Random aleatorio = new Random();
            lider = miembros.get(aleatorio.nextInt(cantidad-1));
            return true;
        }else{
            return false;
        }
    }
    
    
}
