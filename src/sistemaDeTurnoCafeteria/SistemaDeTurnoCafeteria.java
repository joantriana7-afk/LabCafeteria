package sistemaDeTurnoCafeteria;
/*Construye un programa que simule el procesamiento de pedidos de una cafetería durante un turno completo.
El programa no usa Scanner: todos los datos están declarados directamente en el código. Lee el contexto
completo antes de empezar.
Contexto del negocio
La cafetería tiene un menú fijo de 5 productos con nombre, precio y categoría.
En el turno llegan 6 pedidos. Cada pedido indica qué producto se pidió (por índice del array) y
cuántas unidades.
Al final del turno se genera un reporte.
Datos que debes declarar en tu código
String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada",
"Brownie"};
double[] precios = {3500, 5000, 4000, 4500, 6000};
char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida,
P=Postre
int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido
*/

public class SistemaDeTurnoCafeteria {
    static void main() {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada", "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'}; // B=Bebida caliente, F=Fría, C=Comida P=Postre
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3}; // índice del producto en cada pedido
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2}; // unidades por pedido

        /*Tarea 1 — Procesamiento de pedidos
Recorre los 6 pedidos con un for. Para cada pedido imprime: número de pedido, nombre del
producto, cantidad, categoría (usa switch para mostrar la descripción completa) y subtotal del
pedido.*/

        /*Tarea 2 — Descuento por pedido
Si el subtotal de un pedido supera $12.000, aplica un descuento del 10%. Muestra si aplicó o no
el descuento y el valor final.*/

        /*Tarea 3 — Validación de inventario
Hay 10 unidades disponibles de Brownie (índice 4). Antes de procesar cada pedido de Brownie,
verifica si hay suficiente inventario. Si no hay, imprime un mensaje de producto agotado y no lo
cobres. No uses ciclos anidados.*/

        /*Tarea 4 — Apertura de turno
Antes de procesar los pedidos, simula la apertura de caja con un do-while: el monto de apertura
debe ser mayor a $0. Usa un valor inválido primero para forzar una iteración.*/


/*Tarea 5 — Reporte de cierre
Al finalizar todos los pedidos imprime: total de pedidos procesados, total recaudado y el número
del pedido con mayor valor*/
    }
}
