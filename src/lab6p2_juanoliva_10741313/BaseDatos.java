package lab6p2_juanoliva_10741313;

import java.util.ArrayList;

public class BaseDatos {
    private ArrayList<Usuario> users = new ArrayList();
    private ArrayList<PokeGrupo> grups = new ArrayList();

    public BaseDatos() {
    }

    public ArrayList<Usuario> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Usuario> users) {
        this.users = users;
    }

    public ArrayList<PokeGrupo> getGrups() {
        return grups;
    }

    public void setGrups(ArrayList<PokeGrupo> grups) {
        this.grups = grups;
    }
    
    public void setUsuario(Usuario u){
        users.add(u);
    }
    
    public void setGrupo(PokeGrupo p){
        grups.add(p);
    }
}
