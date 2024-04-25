package main;

import interfaces.Login;
import logica.*;

public class AppVeterinaria {
    private GestorDatos gestordatos;
    
    public static void main(String[] args) {
        Login inicio = new Login ();
        inicio.setLocationRelativeTo(null);
        inicio.setVisible(true);
        
        System.out.println("Programa iniciado!");
    }
}
