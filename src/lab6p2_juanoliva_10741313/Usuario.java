package lab6p2_juanoliva_10741313;

import java.awt.Color;
import java.util.Date;

public class Usuario {
    private String nombre;
    private String apellido;
    private String nUsuario;
    private String password;
    private Date nacimiento;
    private Color favorito;
    private Pokedex pk1;
    private Pokedex pk2;
    private Pokedex pk3;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nUsuario, String password, Date nacimiento, Color favorito, Pokedex pk1, Pokedex pk2, Pokedex pk3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nUsuario = nUsuario;
        this.password = password;
        this.nacimiento = nacimiento;
        this.favorito = favorito;
        this.pk1 = pk1;
        this.pk2 = pk2;
        this.pk3 = pk3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getnUsuario() {
        return nUsuario;
    }

    public void setnUsuario(String nUsuario) {
        this.nUsuario = nUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Color getFavorito() {
        return favorito;
    }

    public void setFavorito(Color favorito) {
        this.favorito = favorito;
    }

    public Pokedex getPk1() {
        return pk1;
    }

    public void setPk1(Pokedex pk1) {
        this.pk1 = pk1;
    }

    public Pokedex getPk2() {
        return pk2;
    }

    public void setPk2(Pokedex pk2) {
        this.pk2 = pk2;
    }

    public Pokedex getPk3() {
        return pk3;
    }

    public void setPk3(Pokedex pk3) {
        this.pk3 = pk3;
    }

    @Override
    public String toString() {
        return nombre +" "+apellido;
    }
    
    
}
