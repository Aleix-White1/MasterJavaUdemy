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
        double notasIgual1[] = new double[1];
        double notasMayor5[] = new double[1];
        double notasMenor4[] = new double[1];

        for (int i = 1; i < 10; i++){
            System.out.printf("Ingresa la nota %d:", i);
            try {
                notas = scanner.nextDouble();
                if (notas <= 7 & notas >= 1){
                    System.out.println(notas);
                    if (notas == 1){
                        notasIgual1[i] = notas;
                    }else if (notas > 5){
                        notasMayor5[i] = notas;
                    }else if (notas < 4){
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

    }
}
