package Ejercicio4;

import java.util.Scanner;

public class TanqueGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de gasolina: ");
        int gasolina = scanner.nextInt();

        if (gasolina > 70) {
            System.out.println("ERROR! El valor maximo es de 70 litros");
        }else if (gasolina == 70){
            System.out.println("Estanque lleno");
        }else if (gasolina > 60) {
            System.out.println("Estanque casi llena");
        }else if (gasolina < 60 && gasolina > 40) {
            System.out.println("Estanque a 3/4");
        } else if (gasolina <= 40 && gasolina > 35) {
            System.out.println("Estanque en la mitad");
        } else if (gasolina <= 35 && gasolina > 20 ) {
            System.out.println("Suficiente");
        } else if (gasolina <= 20 && gasolina > 1) {
            System.out.println("Insuficiente");
        }

    }

    }

