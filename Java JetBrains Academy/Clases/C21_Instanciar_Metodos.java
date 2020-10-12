package Clases;

/* 
Escribir métodos de instancia
Los métodos de instancia representan un comportamiento común para un conjunto completo de objetos que pertenecen a la misma clase.

El método se denomina método de instancia porque no tiene la palabra clave staticen su declaración. Los métodos de instancia corresponden a un objeto particular de una clase y pueden acceder a sus campos.

La palabra clave thisrepresenta una instancia particular de la clase. Esta palabra clave es opcional, pero muy útil cuando se trata de administrar objetos de la clase.

Lo importante de los métodos de instancia es que pueden tomar argumentos y devolver valores de cualquier tipo, incluido el mismo tipo que la clase definida.

En resumen, los métodos de instancia permiten a los programadores manipular objetos particulares de una clase. Pueden acceder a los campos de la clase con la palabra clave "this", pero es opcional. Los métodos de instancia son una excelente manera de trabajar con muchos objetos de sus clases.


*/

public class C21_Instanciar_Metodos {
    public static void main(String[] args) {
        MyClass object = new MyClass();
        object.field = 10;
        object.print(); // prints "10"

        Cat pharaoh = new Cat(); // an instance named "pharaoh"
        pharaoh.name = "pharaoh";
        
        for (int i = 0; i < 5; i++) {
            pharaoh.say(); // it says "meow" or "zzz"
        }

        pharaoh.wakeUp(); // invoking the instance method

        pharaoh.say();
    }
}

class MyClass {

    int field;

    public void print() {
        System.out.println(this.field);
    }
}


/* Gatos
Vayamos aún más lejos y consideremos un ejemplo más difícil de una clase Cat.

Cualquier gato tiene un nombre y un estado (durmiendo o no). Un gato puede decir una de dos frases, "miau" o "zzz", según su estado. A veces, después de decir "miau", un gato se duerme. Sin embargo, se puede despertar invocando el método wakeUp.

Aquí está el código que corresponde a la clase de gatos que se comportan de esta manera. Asegúrese de leer los comentarios proporcionados para comprender mejor los métodos de la clase. 

Ahora, podemos crear una instancia de esta clase e invocar sus métodos. ¡No olvides que cuando se crea un gato, está despierto!*/

class Cat {

    String name; // the cat's name
    boolean sleeping; // the current state of the cat (by default - false)

    /**
     * The cat says "meow" if it is not sleeping, otherwise it says "zzz".
     * After saying "meow" the cat can sometimes fall asleep.
     */
    public void say() {
        if (sleeping) {
            System.out.println("zzz");
        } else {
            System.out.println("meow");

            if (Math.random() > 0.5) {
                sleeping = true;
            }
        }
    }
    /**
     * This method wakes the cat up.
     */
    public void wakeUp() {
        sleeping = false;
    }
}