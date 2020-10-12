package Clases;

/* Un programa típico orientado a objetos consiste en un conjunto de objetos que interactúan . Cada objeto tiene su propio estado separado de los demás. Cada objeto es una instancia de una clase particular (tipo) que define propiedades comunes y el posible comportamiento de sus objetos.

Todas las clases de la biblioteca estándar ( String, Date) y las clases definidas por los programadores son tipos de referencia, lo que significa que las variables de estos tipos almacenan direcciones donde se encuentran los objetos reales. En este sentido, las operaciones de comparación y asignación funcionan con objetos de manera diferente que con tipos primitivos.

Creando objetos
La palabra clave "new" crea un objeto de una clase particular.

Inmutabilidad de objetos
Hay un concepto importante en programación llamado inmutabilidad . La inmutabilidad significa que un objeto siempre almacena los mismos valores. Si necesitamos modificar estos valores, debemos crear un nuevo objeto. El ejemplo común es la clase estándar "String". Las cadenas son objetos inmutables, por lo que todas las operaciones de cadenas producen una nueva cadena. Los tipos inmutables le permiten escribir programas con menos errores.

Compartiendo referencias
Más de una variable puede hacer referencia al mismo objeto.
Es importante comprender que dos variables se refieren a los mismos datos en la memoria en lugar de dos copias independientes. Dado que nuestra clase es mutable, podemos modificar el objeto usando ambas referencias.

Nulabilidad
Como para cualquier tipo de referencia, una variable de un tipo de clase puede ser nula, lo que significa que aún no está inicializada.
Esta es una característica común en Java disponible para las clases, ya que son tipos de referencia.

Conclusión
A estas alturas, no solo ya hemos trabajado con algunas clases de la biblioteca estándar, sino que también hemos aprendido cómo Java nos permite crear nuestras propias clases. En este tema, hemos discutido que la naturaleza de los objetos de las clases personalizadas y los de las bibliotecas estándar se basan en los mismos principios.

Tenga en cuenta que las clases definidas por los programadores son tipos de referencia . Cuando los objetos son creados por el nuevo operador, devuelve la referencia en la memoria donde se encuentran los objetos creados. Con esta referencia, podemos acceder a sus campos y cambiarlos. Varias variables pueden hacer referencia al mismo objeto a través de una referencia. También es posible crear dos objetos independientes con el mismo contenido de campo. Es importante comprender que las referencias a dichos objetos son diferentes. Sin embargo, no todos los objetos permiten cambiar su estado después de su creación. Tal característica se llama inmutabilidad .
*/

public class C17_Objetos {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.name = "Mary";
        patient.age = 24;
        System.out.println(patient.name + " " + patient.age); // Mary 24
        Patient p = patient; //NO SE COPIAN LAS CLASES, COMPARTEN MISMO OBJETO
        System.out.println(p.name + " " + p.age); // Mary 24

        patient.age = 25;
        System.out.println(p.age); // 25
    }
}

class Patient {
    String name;
    int age;
}