package Clases;

import java.util.Arrays;

/* Introduction to arrays
Cuando necesite procesar varios objetos del mismo tipo, puede guardarlos en una matriz y luego procesarlos juntos como una sola unidad. Es un enfoque muy conveniente si no sabe cuántos objetos procesará el programa durante el tiempo de ejecución.

Puede considerar una matriz como una colección de elementos del mismo tipo. Todos los elementos se almacenan en la memoria de forma secuencial.

La colección proporciona un nombre para sus elementos. El número posible de elementos a almacenar se establece cuando se crea la matriz y no se puede modificar. Pero un elemento almacenado se puede modificar en cualquier momento.
El primer elemento tiene el índice 0, el último elemento tiene el índice de igual tamaño de matriz - 1.

En Java, una matriz tiene las siguientes características importantes:

1. una matriz es un tipo de referencia;
2. todos los elementos de la matriz se almacenan en la memoria secuencialmente;
3. se accede a cada elemento de la matriz por su índice numérico, el primer elemento tiene el índice 0;
4. se accede al último elemento mediante el índice igual al tamaño de la matriz - 1;
5. es posible crear una matriz para almacenar elementos de cualquier tipo.


Declaration, instantiation, initialization ***************************

Para crear una matriz llena de elementos debemos:

declarar una variable de un tipo de matriz (declaración);

crear una instancia del objeto de matriz (instanciación);

inicializar la matriz con algunos valores (inicialización).

Cuando declaramos una variable, definimos su tipo y nombre. La instanciación ocurre cuando se asigna memoria para este objeto. La inicialización del objeto de matriz significa que colocamos ciertos valores del objeto de matriz en la memoria de nuestro programa.


Creating an array with the specified elements *********************************

Java proporciona varias formas de crear una matriz con los elementos especificados.

Creating an array using the keyword "new" ***************************************

La forma más general de crear una matriz es usar la palabra clave especial new y especificar el número necesario de elementos:

    int n = ...; // n is a length of an array
    int[] numbers = new int[n];

Esta forma es útil cuando el número de elementos es conocida antes de iniciar el programa. Cuando creamos una instancia del objeto de matriz con la longitud indicada como [n] o [5] y no enumeramos sus elementos explícitamente, la matriz se inicializa con los valores predeterminados de su tipo.

Ahora, la matriz tiene n elementos. Cada elemento es igual a cero (el valor predeterminado del tipo Int). A continuación, deberíamos hacer una inicialización explícita de elementos.

****El tamaño de una matriz no puede ser mayor que Integer.MAX_VALUE. De hecho, es incluso un poco menor que este valor.


The length of an array *******************************************************************

Para obtener la longitud de una matriz existente, acceda a la propiedad especial arrayName.length.


Accessing elements **************************************************************************

Los valores de los elementos de una matriz se pueden cambiar. Puede usar el índice para establecer un valor en una matriz o para obtener un valor de ella.

    array[index] = val;
    val = array[index];

Si intentamos acceder a un elemento no existente mediante un índice, se produce una excepción en tiempo de ejecución.
El programa lanza ArrayIndexOutOfBoundsException.


The utility class Arrays *******************************************************************

Si necesita procesar matrices, puede utilizar métodos estándar agrupados en la clase de utilidad Arrays.
Por supuesto, la clase Arrays contiene muchos otros métodos útiles, incluida la copia de matrices, la búsqueda en matrices, etc. Para obtener más detalles, consulte aquí:
    https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html

*/

	public class C11_Arrays {public static void main(String[] args) {
        int[] array; // declaration's form 1
        int array2[]; // declaration's form 2: less used in practice
        array = new int[] {1,2,3,4,5,6,7,8};
        array2 = new int[10];
        System.out.println(array + " " + array2);
/*
La forma más sencilla de instanciar e inicializar una matriz es enumerar
todos sus elementos:
*/
        int[] numbers = { 1, 2, 3, 4 }; // instantiating and initializing an array of 1, 2, 3, 4
        int a = 1, b = 2, c = 3, d = 4;
        int[] numbers2 = { a, b, c, d }; // instantiating and initializing an array of 1, 2, 3, 4
        /* Es posible separar la declaración y la instanciación en dos líneas: */
        int n = 5;
        int[] numbers3; // declaration
        numbers3 = new int[n]; // instantiation and initialization with default values
        System.out.println(numbers + " " + numbers2 + " " + numbers3);

/* Además, podemos escribir la palabra clave new y enumerar todos los elementos de una matriz: */
        float[] floatNumbers; // declaration 
        floatNumbers = new float[] { 1.02f, 0.03f, 4f }; // instantiation and initialization

        int length = floatNumbers.length; // number of elements of the array
        System.out.println(length);



/* convertir matriz en cadena usando Arrays.toString(Array) y luego imprimirlo */
        byte[] famousNumbers = { 0, 1, 2, 4, 8, 16, 32, 64 };
        String arrayAsString = Arrays.toString(famousNumbers); // [0, 1, 2, 4, 8, 16, 32, 64]
        System.out.println(arrayAsString);

/* ordenar una matriz completa o una parte de ella usando Arrays.sort(Array): */
        long[] bigNumbers = { 200000000L, 400000000L, 100000000L, 300000000L }; // it's unsorted
        Arrays.sort(bigNumbers); // sorting whole array
        System.out.println(Arrays.toString(bigNumbers)); // [100000000, 200000000, 300000000, 400000000]

/* comparando matrices: dos matrices son iguales si contienen los mismos elementos en el mismo orden: */
        int[] numbers11 = { 1, 2, 5, 8 };
        int[] numbers21 = { 1, 2, 5 };
        int[] numbers31 = { 1, 2, 5, 8 };

        System.out.println(Arrays.equals(numbers11, numbers21)); // it prints "false"
        System.out.println(Arrays.equals(numbers11, numbers31)); // it prints "true"

/* llenando una matriz completa o una parte de ella con algunos valores: */
        int size = 10;
        char[] characters = new char[size];
// It takes an array, start index, end index (exclusive), and the value for filling the array
        Arrays.fill(characters, 0, size / 2, 'A'); 
        Arrays.fill(characters, size / 2, size, 'B');
        System.out.println(Arrays.toString(characters)); // it prints [A, A, A, A, A, B, B, B, B, B]
    }
}