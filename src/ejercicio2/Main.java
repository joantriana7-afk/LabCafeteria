package ejercicio2;
/*Ejercicio 2 — Operadores
Una cafetería aplica un descuento del 15% a los pedidos mayores a $30.000.
Dado un subtotal de $42.500, calcula: el valor del descuento, el total a pagar y si el cliente tiene
derecho al descuento (resultado booleano).
Muestra los tres valores con System.out.printf.
Pregunta: ¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese
operador?
Respuesta escri*/
public class Main {
    static void main(String[] args) {
        double descuento = 15;
        double subtotal = 22500;
        boolean tieneDescuento = false;

        if(subtotal > 30000){
            tieneDescuento = true;
            double totalDescuento = descuento/100;
            double total = subtotal - (subtotal*totalDescuento);
            System.out.printf("El cliente tiene descuento: %b %.0f %nValor total a pagar: %.0f",tieneDescuento,descuento
                    , total);
        }else{
            System.out.printf("El cliente no tiene descuento: %b %nValor total a pagar: %.0f",tieneDescuento,subtotal);
        }

    }
}
