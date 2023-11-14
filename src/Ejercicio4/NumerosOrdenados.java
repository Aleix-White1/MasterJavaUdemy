package Ejercicio4;

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce primer numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduce segundo numero: ");
        int num2 = scanner.nextInt();

        String numeros = (num1 > num2) ? String.format("%d, %d", num1, num2) : String.format("%d, %d", num2, num1);
        System.out.println(numeros);


    }
}
