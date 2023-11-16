package Ejercicio4;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class JOptionPaneNombres {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog("Introduce tu nombre completo nombre + apellido: ");
        String persona2 = JOptionPane.showInputDialog("Introduce tu nombre completo nombre + apellido: ");
        String persona3 = JOptionPane.showInputDialog("Introduce tu nombre completo nombre + apellido: ");

        String[] nombreP1 = persona1.split(" ");
        String primerNombre = nombreP1[0];

        String[] nombreP2 = persona2.split(" ");
        String segundoNombre = nombreP2[0];

        String[] nombreP3 = persona3.split(" ");
        String tercerNombre = nombreP3[0];

        String nombreMasLargo = primerNombre;

        if (segundoNombre.length() > nombreMasLargo.length()) {
            nombreMasLargo = segundoNombre;
        }

        if (tercerNombre.length() > nombreMasLargo.length()) {
            nombreMasLargo = tercerNombre;
        }

        System.out.println(nombreMasLargo + " tiene el nombre mas largo");




    }
}
