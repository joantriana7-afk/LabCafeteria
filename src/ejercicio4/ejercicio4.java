package ejercicio4;

import java.util.Scanner;

/*Ejercicio 5 — do-while
Al inicio del turno, el sistema pide al cajero que ingrese el monto de apertura de caja.
El monto debe ser mayor a $0. Si el cajero ingresa un valor inválido, el sistema debe volver a
pedirlo.
Simula este comportamiento con un do-while. Como no usamos Scanner en este ejercicio,
define el valor dentro del código y fuerza al menos una iteración con un valor inválido primero.
Pregunta: ¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en
el orden de ejecución*/
public class ejercicio4 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        double montoApertura = 0;
        boolean esValido = false;
        do {
            System.out.println("Ingresa el monto de apertura de la caja:");
            montoApertura = scanner.nextDouble();
            if(montoApertura > 0){
                esValido = true;
            }
        } while ( esValido == false );
        scanner.close();
    }
}
