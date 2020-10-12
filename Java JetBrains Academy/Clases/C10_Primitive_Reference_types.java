package Clases;

/* Primitive and reference types

En Java, todos los tipos de datos se dividen en dos grupos: tipos primitivos y tipos de referencia.

Java proporciona solo ocho tipos primitivos. Están incorporadas en la sintaxis del lenguaje como palabras clave. Los nombres de todos los tipos primitivos están en minúsculas. El tipo más utilizado es int, que representa un número entero.

El número de tipos de referencia es enorme y crece constantemente. Un programador puede incluso crear su propio tipo y usarlo como tipos estándar. Los tipos de referencia utilizados con más frecuencia son String, Scanner y arrays. Recuerde que Java, como la mayoría de los lenguajes de programación, distingue entre mayúsculas y minúsculas.
En este tema, nos centraremos en String, que es un ejemplo común del tipo de referencia.


The "new" keyword

En la mayoría de los casos, se puede crear un objeto de un tipo de referencia utilizando la palabra clave "new". Cuando usamos la palabra clave new, la memoria se asigna para el objeto que creamos. Eso se llama instanciación del objeto porque creamos una instancia de él. Luego inicializamos la variable asignándole algún valor. A menudo, como en nuestro ejemplo, se hace con una línea.


The main difference

La diferencia básica es que una variable de tipo primitivo almacena los valores reales, mientras que una variable de tipo de referencia almacena una dirección en la memoria (referencia) donde se encuentran los datos. Los datos se pueden presentar como una estructura compleja que incluye otros tipos de datos como sus partes.

La siguiente imagen simplemente demuestra esta diferencia. Hay dos espacios de memoria principales: Stack y Heap. Todos los valores de los tipos primitivos se almacenan en la memoria de Stack, pero las variables de los tipos de referencia almacenan direcciones en objetos ubicados en la memoria de Heap.


Assignment

La forma de almacenar datos también afecta el mecanismo para asignar el valor de una variable a otra variable:
tipos primitivos: el valor solo se copia;
tipos de referencia: se copia la dirección al valor (los datos se comparten entre varias variables).


Comparisons

Comparar tipos de referencia usando == y! = No es lo mismo que comparar tipos primitivos. En realidad, cuando compara dos variables del tipo String, compara referencias (direcciones) en lugar de valores reales.

Por lo tanto, no necesita utilizar operadores de comparación cuando desee comparar los valores. La forma correcta de comparar contenido es invocar el método especial es "equals".


The null type

A diferencia de los tipos primitivos, una variable de un tipo de referencia puede hacer referencia a un valor nulo especial que representa el hecho de que aún no se ha inicializado o no tiene un valor.

Desafortunadamente, el uso frecuente del valor nulo puede conducir fácilmente a errores en el programa y complicar el código. Intente evitar el nulo siempre que sea posible, solo úselo si realmente lo necesita
*/

public class C10_Primitive_Reference_types {
    public static void main(String[] args) {
/* El primer enfoque con la palabra clave new es común para los tipos de referencia, mientras que el segundo es solo específico de la cadena. Ambos enfoques nos dan el mismo resultado para las cadenas, pero tienen algunas diferencias técnicas que no consideraremos aquí. */
        String language = new String("java");
        String language2 = "java";
        System.out.println(language + " " + language2);

/* La variable b tiene una copia del valor almacenado en la variable a. Pero las variables lenguaje3 y java hacen referencia al mismo valor, en lugar de copiarlo. */
        int a = 100;
        int b = a; // 100 is copied to b

        String language3 = new String("java");
        String java = language3;
        System.out.println(b + " " + java);

        String s1 = new String("java");

        String s2 = new String("java");
        String s3 = s2;

        System.out.println(s1 == s2); // false -> Diferentes espacios de mememoria
        System.out.println(s2 == s3); // true -> mismo espacio de memoria
        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true

        String str = null;
        System.out.println(str); // null
        str = "hello";
        System.out.println(str); // hello
    }
}