package ejercicio7;
/*Ejercicio 7 — Debugging
El siguiente código tiene errores. Encuéntralos, corrígelos y explica cada uno.
public class CajaRegistradora { public static void main(String[] args) { int
cantidadVendida = "5"; double precioUnitario = 4500; double total = cantidadVendida *
precioUnitario boolean aplicaDescuento = (total > 20000); if (aplicaDescuento = true)
{ total = total - (total * 0.10); } System.out.println("Total: " + total); } }
Pregunta: ¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error
lógico? ¿Cómo los distingues?*/
public class CajaRegistradora {
    public static void main(String[] args) {
        int cantidadVendida = 5;  //Es un error de logico, Se le estaba pasando un caracter a una variable declarada entera.
        double precioUnitario = 4500;
        double total = cantidadVendida *
        precioUnitario; //Otro error de compilación porque faltaba el ; al final del codigo.
        boolean aplicaDescuento = (total > 20000);
        if (aplicaDescuento == true){ //Este es un error logico,se está asignando en vez de comparando, debe cambiarse por ==
            total = total - (total * 0.10);
        }
        System.out.println("Total: " + total); }
}
