package Ejercicio5;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

/*Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for iterar el
numero de veces (ingresado) para pedir el numero entero, entonces se requiere:
Calcular el menor número e imprimir el valor.
Si el menor número es menor que 10, imprimir "El número menor es menor que 10!". si no, imprimir " el numero
menor es igual o mayor que 10!".*/
public class NumeroMenor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres comparar? ");
        int cantidad = scanner.nextInt();
        while (cantidad > 10){

        }
            System.out.println("ERROR! Debes comparar almenos 10 numeros");


        int[] nums = new int[cantidad];

        for (int i = 1; i< cantidad; i++){
            System.out.printf("Numero %d: " , i);
            nums[i] = scanner.nextInt();
        }

            System.out.println(InumMenor);




    }
}
