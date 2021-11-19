package lab6p2_juanoliva_10741313;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> lista = new ArrayList();
    private float damagePromedio;

    public Pokedex() {
    }

    public ArrayList<Pokemon> getArrayList() {
        return lista;
    }

    public void setArrayList(ArrayList<Pokemon> lista) {
        this.lista = lista;
    }

    public float getDamagePromedio() {
        return damagePromedio;
    }

    public void setDamagePromedio() {
        float totalDamage = 0;
        for (Pokemon temp : lista) {
            totalDamage += temp.getDamage();
        }
        damagePromedio = totalDamage/lista.size();
    }

    @Override
    public String toString() {
        return "Pokedex{" + "arrayList=" + lista + ", damagePromedio=" + damagePromedio + '}';
    }
    
    public boolean agregarPokemon(Pokemon p){
        if (lista.size()<3) {
            lista.add(p);
            return true;
        }else{
            return false;
        }
    }
}
