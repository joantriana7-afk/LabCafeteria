# LabCafeteria

 ## Integrantes:
 - Joan Triana
 - Maria Gomez
 
1. Pregunta: ¿Por qué usas double para el precio y no int? ¿Qué pasaría si declaras el precio como int y le
   asignas 3.50?*/ Lo declaramos double porque el precio puede tener decimales y si lo delclaramos como int se van a perder las cifras decimales, lo cual podría afectar los calculos, porque int solo acepta enteros. Si declaramos el precio como int solo imprimiria 3.0 y se perderia la cifra decimal.
2. Pregunta: ¿Qué operador usaste para determinar si aplica el descuento? ¿Qué tipo de dato devuelve ese
   operador? R/ Usamos el operador booleano, para que devolviera True en caso de haber descuento y false cuando no hubiera descuento.
3. Pregunta: ¿En qué situación preferirías usar switch en lugar de una cadena de if-else? ¿Hay algún caso en
   este ejercicio donde el switch no sería la mejor opción?*R/Preferiria usarlo para los casos en donde se debe selecionar una opción, por ejemplo en un menú.
En este ejercicio no lo usaria para ya tomar deciciones mas complejas como descuentos o calculo de totales.
4. Pregunta: ¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en
   el orden de ejecución* R/ Es mas adecudado el do,while aquí porque se necesita validar primero que el monto inicial en caja cumpla con el requisito de ser mayor a 0. La diferencia entre el while y el Do-while aquí es que el do-while nos va a permitir realizar primero una ejercución antes de evaluar la condición del ciclo.
5. Pregunta: ¿Por qué do-while es más apropiado que while aquí? Describe con tus palabras la diferencia en
   el orden de ejecución. R/ el do-while es mas apropiado por que primero ejecuta el codigo y luego revisa la condicion, el white primero pregunta y luego actua.
6. ¿Por qué usas for aquí y no while? ¿Qué tiene el for que lo hace más conveniente cuando
   conoces el número de elementos? R/ Usamos for por que sabesmos exactamente cuantos productos hay en la lista, y el while se usaria mas cuando no se seabe cuantas veces va a repetirse algo.
7. ¿Cuántos errores encontraste? Clasifica cada uno: ¿es un error de compilación o un error
   lógico? ¿Cómo los distingues?* R/

   int cantidadVendida = 5;  //Es un error de logico, Se le estaba pasando un caracter a una variable declarada entera.

   double total = cantidadVendida *
   precioUnitario //Otro error de compilación porque faltaba el ; al final del codigo.

   if (aplicaDescuento = true){ //Este es un error logico,se está asignando en vez de comparando, debe cambiarse por ==
