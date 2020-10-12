package Clases;

/* El compilador realiza automáticamente una conversión implícita cuando el tipo de destino es más ancho que el tipo de origen. La siguiente imagen ilustra la dirección de este casting (Implicit_Casting.png). Cualquier valor de un tipo determinado puede asignarse implícitamente al de la derecha.


Normalmente, no hay pérdida de información cuando el tipo de destino es más ancho que el tipo de fuente, por ejemplo, cuando lanzamos int a long. Pero no es posible lanzar automáticamente en orden inverso (por ejemplo, de long a int o de double a float).

Tenga en cuenta que no hay un tipo booleano en la imagen de arriba, porque es imposible convertir este tipo a cualquier otro y viceversa.

En algunos casos, la conversión de tipos implícitos puede tener un poco de pérdida. Cuando convertimos un int en float, o un long en float o en double, podemos perder algunos bits menos significativos del valor, lo que resultará en la pérdida de precisión. Sin embargo, el resultado de esta conversión será una versión correctamente redondeada del valor entero, que estará en el rango general del tipo de destino.

Cuando convertimos un char en un int en Java, obtenemos el valor ASCII para un carácter dado. El valor ASCII es una representación entera de letras del alfabeto inglés (mayúsculas y minúsculas), dígitos y otros símbolos. Aquí puede encontrar algunos de los símbolos estándar en ASCII.

Estrictamente hablando, Java usa Representaciones de caracteres Unicode (UTF-16), que es un superconjunto de ASCII e incluye un conjunto de símbolos mucho mayor. Sin embargo, los números del 0 al 127 tienen los mismos valores en ASCII y Unicode.

La conversión implícita considerada no funciona cuando el tipo de destino es más estrecho que el tipo de origen. Pero los programadores pueden aplicar conversión explícita a un tipo de fuente para obtener otro tipo que deseen. Puede perder información sobre la magnitud general de un valor numérico y también puede perder precisión.

Para realizar una conversión explícita, un programador debe escribir el tipo de destino entre paréntesis antes de la fuente. "(targetType) source"



*/


public class C06_Casting {
    public static void main(String[] args) {
        long bigLong =  1_200_000_002L;
        float bigFloat = bigLong; // 1.2E9 (= 1_200_000_000)
        System.out.println(bigFloat);
        char character = 'a';
        char upperCase = 'A';
        int ascii1 = character; // this is 97
        int ascii2 = upperCase; // this is 65
        System.out.println(ascii1 + " " + ascii2);

        double d = 2.00003;
        // it loses the fractional part
        long l =  (long) d; // 2

        // requires explicit casting because long is wider than int
        int i = (int) l; // 2 

        // requires explicit casting because the result is long (indicated by L)
        int val = (int) (3 + 2L); // 5

        // casting from a long literal to char
        char ch = (char) 55L; // '7'

        long bigNum = 100_000_000_000_000L;
        int n = (int) bigNum; // 276447232
        System.out.println(i + " " + val + " " + ch + " " + n);
/* ¡Ups! El valor se ha truncado. Este problema se conoce como desbordamiento de tipos. El mismo problema puede ocurrir al convertir int a corto o byte. Veamos qué pasa exactamente.

Como recordará, en Java long es un número de 64 bits, mientras que int es de 32 bits. Al convertir long a int, el programa solo toma los últimos 32 bits para representar el nuevo número. Si el largo contiene un número menor o igual que Integer.MAX_VALUE, puede convertirlo sin perder información. De lo contrario, el resultado no tendrá ningún sentido, aunque determinado. Es por eso que no debe realizar la conversión de un tipo más grande a uno más pequeño a menos que esté absolutamente seguro de que es necesario y que el truncamiento no interferirá con su programa.

La conversión explícita también funciona cuando la conversión implícita es suficiente. */
    }
}