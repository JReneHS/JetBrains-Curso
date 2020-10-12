package Clases;

/*
Types_Variables Una variable es un marcador de posición para almacenar un
valor de un tipo particular: una cadena, un número u otra cosa. Cada variable
tiene un nombre (también conocido como identificador) para distinguirla de
las demás. Antes de comenzar a usar una variable, debe declararla.
 */
public class C01_Types_Variables {
    public static void main(String[] args) {
        int numero = 23;//Variable
        int age; //Declaracion
        age = 44; //Inicializacion
        System.out.println(numero);/* Shortcut sysout */
        String dayofWeek = "Monday";
        System.out.println(dayofWeek);
        System.out.println(dayofWeek);
        int one = 1;
        int num = one;
        System.out.println(num+" "+one);
/* A partir de Java 10 existe var para que autodetecte el tipo de dato */
        var dato = "String";
        var dato2 = 123_456; /* Para numeros grandes combiene usar _ cada 3 digitos */
        var dato3 = 's';
        System.out.println(age+" "+dato+" "+dato2+" "+dato3);
        System.out.println((-5) * (-10) * (-20));
    }
}