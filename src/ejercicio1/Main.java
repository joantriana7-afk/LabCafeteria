package ejercicio1;

/*Ejercicio 1 — Variables y tipos de dato
Declara variables para representar un producto de la cafetería:
nombre del producto (texto), precio unitario (decimal), cantidad en inventario (entero), si está
disponible hoy (booleano) y el código del producto (un solo carácter).
Imprime cada variable con una etiqueta clara usando String.format.
Pregunta: ¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le
asignas 3.50?*/
public class Main {
    static void main(String[] args) {
        String nombre = "Carne";
        double precioUnitario= 13000;
        int cantidad = 20;
        boolean disponible = true;
        char codigo = 'C';

        String resultado = String.format("El producto %s con precio unitario %.0f con cantidad en inventario %d, con codigo %c se encuentra disponible: %b ",nombre,precioUnitario,cantidad, codigo, disponible);
        System.out.println(resultado);
    }
}
