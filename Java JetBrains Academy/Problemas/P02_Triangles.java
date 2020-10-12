package Problemas;

import java.util.Scanner;

/* Dados tres números naturales A, B, C. Determina si puede existir un triángulo con estos lados.

Si el triángulo existe, envíe la cadena SÍ y, de lo contrario, envíe NO.

Un triángulo es válido si la suma de sus dos lados es mayor que el tercer lado. Si tres lados son A, B y C, entonces se deben cumplir tres veces la condicion */

public class P02_Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();
        if (sideA + sideB > sideC) {
            if (sideA + sideC > sideB) {
                if (sideB + sideC > sideA) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}