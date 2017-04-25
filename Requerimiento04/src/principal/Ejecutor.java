package principal;

import clases.*;

/**
 *
 * @authores Cristhian Apolo, Nelson Aranda y Fernando León 
 */
public class Ejecutor {

    public static void main(String[] args) {
        Domicilio domicilio = new Domicilio("Lojana", "AV.Pablo Placios", "Loja", "------", "------");
        Productos prod = new Productos("PATATAS", 0.60);
        Productos prod2 = new Productos("ARROZ", 0.80);
        LineItems items = new LineItems(3);
        items.agregarProductos(prod);
        items.agregarProductos(prod2);
        Factura fact = new Factura(domicilio);
        fact.agregarLineItems(items);
        System.out.println(fact.toString());

    }
}
