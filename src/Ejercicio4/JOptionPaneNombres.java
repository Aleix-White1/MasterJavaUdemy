package Ejercicio4;

import javax.swing.*;

public class JOptionPaneNombres {
    public static void main(String[] args) {
        String nombreCompleto = JOptionPane.showInputDialog("Introduce tu nombre completo nombre + apellido: ");

        String nombre = nombreCompleto.split(" ")[0];
        String apellido1 = nombreCompleto.split(" ")[1];
        String apellido2 = nombreCompleto.split(" ")[2];

        System.out.println(nombre.length());
        System.out.println(apellido1.length());
        System.out.println(apellido2.length());


    }
}
