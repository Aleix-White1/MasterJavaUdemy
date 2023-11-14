package Ejercicio3;

import java.util.Scanner;

public class NombresFamiliares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce primer nombre de un familiar/amigo: ");
        String primerNombre = scanner.nextLine();

        System.out.println("Introduce segundo nombre de un familiar/amigo: ");
        String segundoNombre = scanner.nextLine();

        System.out.println("Introduce tercer nombre de un familiar/amigo: ");
        String tercerNombre = scanner.nextLine();

        String formatPrimerNombre = primerNombre.toUpperCase().charAt(1) + "." + primerNombre.substring(primerNombre.length()-2);
        System.out.println(formatPrimerNombre);

        String formatSegundoNombre = segundoNombre.toUpperCase().charAt(1) + "." + segundoNombre.substring(segundoNombre.length()-2);
        System.out.println(formatSegundoNombre);

        String formatTercerNombre = tercerNombre.toUpperCase().charAt(1) + "." + tercerNombre.substring(tercerNombre.length()-2);
        System.out.println(formatTercerNombre);

        String resultadoFinal = formatPrimerNombre + "_" + formatSegundoNombre + "_" + formatPrimerNombre;
        System.out.println(resultadoFinal);
    }
}
