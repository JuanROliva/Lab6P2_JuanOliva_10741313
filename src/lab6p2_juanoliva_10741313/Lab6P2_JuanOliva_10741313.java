package lab6p2_juanoliva_10741313;

import java.util.ArrayList;

public class Lab6P2_JuanOliva_10741313 {
    static BaseDatos db = new BaseDatos();
    
    public static void main(String[] args) {
        Login inicio = new Login(db);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }
}
