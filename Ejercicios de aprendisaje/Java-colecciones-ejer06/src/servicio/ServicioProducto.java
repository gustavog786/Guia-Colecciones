/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioProducto {
    
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Float> mapaProducto = new HashMap();
    
    
    
    //metodo para crear un alumno
    public void crearProducto(){
        
        System.out.println("Ingrese el nombre del producto: ");
        String producto = scan.next();
        System.out.println("Ingrese el precio del producto: ");
        Float precio = scan.nextFloat();
        mapaProducto.put(producto, precio);
        }
    
    // metodo mostrar pruducto
    public void mostrarProducto(){
        System.out.println("Mapa de productos creados: ");
        for (Map.Entry<String, Float> entry : mapaProducto.entrySet()) {
            System.out.println("nombre producto: " + entry.getKey()
            +", precio="+ entry.getValue());
        }
    }
    
    //metodo para modificar el precio del producto
    /*
    public void modificarPrecio(){
        System.out.println("Ingrese el producto al que quiere modificar el precio: ");
        String auxprod= scan.next();
        System.out.println("Ingrese el nuevo precio: ");
        Float precionuevo = scan.nextFloat();
        boolean x = false;
        for (Map.Entry<String, Float> entry : mapaProducto.entrySet()) {
            String key = entry.getKey();
            Float value = entry.getValue();
            if (key.equals(auxprod)) {
               value= precionuevo;
               x= true;
            }
        }
        if (x) {
            System.out.println("El producto no se encuentra en el mapa ");
        }
    }
    */
    //modificar precio mauro
    public void modificarPrecio(){
        System.out.println("Ingrese el producto a actualizar su precio");
        String producto = scan.next();
        if (!mapaProducto.containsKey(producto)) {
            System.out.println("El producto no se encuentra en la lista");
        }else{
        System.out.println("Ingrese el nuevo precio del producto");
        Float precio = scan.nextFloat();
        mapaProducto.replace(producto, precio);
        }
    }

    
    //metodo para eliminar un producto
    public void eliminarProducto(){
        System.out.println("Ingrese el producto a eliminar: ");
        String auxprod= scan.next();
        if (mapaProducto.containsKey(auxprod)) {
            mapaProducto.remove(auxprod);
        }else{
        System.out.println("El producto no se encuentra en la lista");
        }
    }
}
