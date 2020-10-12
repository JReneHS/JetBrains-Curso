package Problemas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P13_Compose_Numbers {
/* Metodo de la Criba de Eratóstenes */
    public static boolean isComposite(long number) {
        int top = (int) Math.floor(Math.sqrt(number)) + 1;
        List<Long> compuestos = new ArrayList<Long>();
        int pos = 0;
        for (int i = 2; i <= top; i++) {
            if (!compuestos.contains(Long.valueOf(i))) {
                for (int j = i; j <= number / i + 1; j++) {
                    compuestos.add(Long.valueOf(i * j));
                }
            }
        }
        for (pos = 2; pos < number; pos++) {
            if (!compuestos.contains(Long.valueOf(pos)) && number % pos == 0) {
                return true;
            }
        }
        return false;
    }


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
        scanner.close();
    }
}
