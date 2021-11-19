package lab6p2_juanoliva_10741313;
public class Pokemon {
    private String nombre;
    private int damage;
    private int vida;
    private String velocidad;
    private String tipo;

    public Pokemon() {
    }

    public Pokemon(String nombre, int damage, int vida, String velocidad, String tipo) {
        this.nombre = nombre;
        this.damage = damage;
        this.vida = vida;
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
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
}
