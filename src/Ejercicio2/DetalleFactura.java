package Ejercicio2;

import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tipo de factura:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce el primer precio:");
        double primerPrecio = scanner.nextDouble();

        System.out.println("Introduce el segundo precio:");
        double segundoPrecio = scanner.nextDouble();

        double totalBruto = primerPrecio + segundoPrecio;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        System.out.printf("La factura %s tiene un total bruto de %.3f, con un impuesto de %.3f y el monto después de impuesto es de %.3f", nombre, impuesto , totalBruto, totalNeto);
    }
}
