package src/ejercicio5;
/*Al inicio del turno, el sistema pide al cajero que ingrese el monto de apertura de caja.
El monto debe ser mayor a $0. Si el cajero ingresa un valor inválido, el sistema debe volver a
pedirlo.
Simula este comportamiento con un do-while. Como no usamos Scanner en este ejercicio,
define el valor dentro del código y fuerza al menos una iteración con un valor inválido primero.
Pregunta: ¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en
el orden de ejecución*/
public class Main {
    public static void main(String[] args) {
        double montoApertura = 0;
        do {
            System.out.println("Monto inválido. Ingrese un monto de apertura.");
            montoApertura = 50000;
        } while (montoApertura <= 0);

        System.out.println("Monto de apertura aceptado: " + montoApertura);
    }
}