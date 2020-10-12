/* Creando un generador pseudoaleatorio
La clase Randompuede generar valores aleatorios de diferentes tipos, tales como int, long, double, e incluso boolean. Consideraremos cómo usar esta clase para números.

Primero que nada, necesitamos hacer la importación:

import java.util.Random;package Clases;

Tenemos dos constructores para crear un objeto de esta clase:

Random() crea un nuevo generador pseudoaleatorio y establece la semilla del generador en un valor que es muy probable que sea distinto de cualquier otra invocación de este constructor:
Random(long seed) crea un nuevo generador pseudoaleatorio con el valor inicial especificado de su estado interno:

Los metodos basicos
Después de haber creado un generador, podemos invocar uno de los siguientes métodos:

int nextInt()devuelve un valor pseudoaleatorio del inttipo;
int nextInt(int n)devuelve un valor pseudoaleatorio de inttipo en el rango de 0(inclusive) a n(exclusivo);
long nextLong()devuelve un valor pseudoaleatorio de longtipo;
double nextDouble()devuelve un valor pseudoaleatorio de doubletipo entre 0.0y 1.0;
void nextBytes(byte[] bytes) genera bytes aleatorios y los coloca en una matriz de bytes proporcionada por el usuario.
Todos los métodos enumerados producen valores distribuidos uniformemente.

Si necesitamos reproducir la misma secuencia de números aleatorios, podemos especificar una semilla para el constructor:

un objeto de la clase Random puede generar números dobles pseudoaleatorios distribuidos en Gauss invocando el método nextGaussian(). Esta distribución puede ser necesaria para algunas aplicaciones de aprendizaje automático y análisis estadístico, pero no es tan común en la programación general.


This way we can generate any numbers from 2 to 5 inclusive both borders.

int next = random.nextInt(upper - lower + 1) + lower;
 */