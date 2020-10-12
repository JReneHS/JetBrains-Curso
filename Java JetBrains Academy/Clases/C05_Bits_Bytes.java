package Clases;

/* Hay unidades de información más grandes ya que las computadoras modernas procesan grandes cantidades de información que exceden significativamente los bytes.

La industria de la computación ha utilizado históricamente las unidades kilobyte, megabyte y gigabyte en al menos dos sistemas de medición ligeramente diferentes que son ligeramente contradictorios entre sí.

El primero es un sistema basado en decimales, que utiliza bytes en potencias de diez: kilobyte (10 ^ 3 bytes), megabyte (10 ^ 6 bytes) y gigabyte (10 ^ 9 bytes) y así sucesivamente. Estas unidades son utilizadas por el Sistema Internacional de Unidades (SI).
El segundo es un sistema binario que utiliza bytes en potencias de dos: kilobyte (2 ^ 10 bytes), megabyte (2 ^ 20 bytes), gigabyte (2 ^ 30 bytes) y así sucesivamente. Este sistema se utilizó activamente para describir la memoria de la computadora.
Para resolver esta confusión, la Comisión Electrotécnica Internacional (IEC) sugirió usar los prefijos kilo, mega y giga solo para el sistema de base decimal y usar nuevos prefijos kibi, mebi, gibi para el sistema de base binaria. Aquí bi significa binario: kibibyte es kilo byte binario.


Integer numbers (0, 1, 2, ...) are represented by the following four types: long,int,short,byte(from the largest to the smallest). These types have different sizes and may represent different ranges of values. The range of an integer type is calculated as −(2^(n−1)) to (2^(n−1))−1, where n is the number of bits. The range includes 0, which is the reason for subtracting 1 from the upper bound.

byte: size 8 bits (1 byte), range from -128 to 127
short: size 16 bits (2 bytes), range from -32768 to 32767
int: size 32 bits (4 bytes), range from −(2^31) to (2^31)−1
long: size 64 bits (8 bytes), range from −(2^63) to (2^63)−1

double (64 bits)
float (32 bits)

char = short type (2 bytes = 16 bits).


        1 GiB = 1 * 1024 * 1024 = 1048576 KiB;
        16384 bits = (16384 / 8) / 1024 = 2 KiB;
        1 GB = 1 * 1000 * 1000 = 1000000 kB;

*/



public class C05_Bits_Bytes {
    public static void main(String[] args) {
        
    }
}