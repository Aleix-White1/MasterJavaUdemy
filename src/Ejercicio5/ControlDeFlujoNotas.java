package Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;
/*
* Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
* Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
* ademas mostrar el promedio total.
Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar
* los cálculos (contadores, sumas).
Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error
* finalizando el programa.*/
public class ControlDeFlujoNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double notas;
        double[] notasIgual1= new double[10];
        double[] notasMayor5 = new double[10];
        double[] notasMenor4 = new double[10];

        for (int i = 0; i < 10; i++){
            System.out.printf("Ingresa la nota %d:", i);
            try {
                notas = scanner.nextDouble();
                if (notas <= 7 & notas >= 1){
                    if (notas == 1){
                        notasIgual1[i] = notas;
                    }else if (notas >= 5){
                        notasMayor5[i] = notas;
                    }else if (notas <= 4){
                        notasMenor4[i] = notas;
                    }
                }else{
                    System.out.println("La nota tiene que estar entre el 1 y el 7");
                    scanner.nextLine();
                    i--;
                }
            }catch (InputMismatchException e){
                System.out.println("ERROR! Tiene que ser un numero");
                scanner.nextLine();
                i--;
            }
        }
        System.out.println("Notas igual a 1");
        for(double num : notasIgual1){
            System.out.println(num);
        }
        System.out.println("Notas mayor a 5");
        for(double num : notasMayor5){
            System.out.println(num);
        }
        System.out.println("Notas menor a 4");
        for(double num : notasMenor4){
            System.out.println(num);
        }

    }
}
