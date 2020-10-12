package Problemas;

import java.util.Scanner;

/* Se le dan las coordenadas de dos reinas en un tablero de ajedrez. Descubra si se pegan o no.

Formato de datos de entrada

Cuatro números enteros x_1, y_1, x_2, y_2x

Formato de datos de salida

Escriba "YES" (en mayúsculas) si se golpean entre sí o "NO" si no lo hacen. */

public class P01_Queens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2 || y1 == y2) { /* Determina si estan en la misma columna o misma fila */
            System.out.println("YES");
        } else if (Math.abs(x1 - y1) == Math.abs(x2 - y2)) { /* Determina si estan en la misma diagonal */
            System.out.println("YES");
        } else if (x1 + y1 == x2 + y2) { /* Determina si estan en la misma Contra-diagonal */
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}