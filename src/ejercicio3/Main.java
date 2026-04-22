package ejercicio3;

/*Ejercicio 3 — switch
La cafetería clasifica sus productos en categorías: B = Bebida caliente, F = Bebida fría, C =
Comida, P = Postre.
Dado el código de categoría de un producto (tipo char), usa un switch para imprimir la
descripción completa de la categoría y el porcentaje de IVA que aplica (bebidas calientes 0%,
frías 5%, comida 8%, postres 8%).
Incluye un caso por defecto para códigos no reconocidos.
Pregunta: ¿En qué situación preferirías usar switch en lugar de una cadena de if-else? ¿Hay algún caso en
este ejercicio donde el switch no sería la mejor opción?*/
public class Main {
    static void main() {
        char codigo = 'G';

        switch (codigo) {
            case 'B':
                System.out.println("Bebida caliente 0%");
                break;
            case 'F':
                System.out.println(
                        "Bebida Fria 5%");
                break;
            case 'C':
                System.out.println(
                        "Comida 8% ");
                break;
            case 'P':
                System.out.println(
                        "Postre 8%");
                break;
            default:
                System.out.println(
                        "Código desconocido");
        }
    }
}
