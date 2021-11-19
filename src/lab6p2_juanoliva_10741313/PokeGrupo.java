package lab6p2_juanoliva_10741313;

import java.util.ArrayList;
import java.util.Date;

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
    
    
    
}
