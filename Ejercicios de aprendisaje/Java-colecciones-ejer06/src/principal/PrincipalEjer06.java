/*
 Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package principal;

import java.util.Scanner;
import servicio.ServicioProducto;

/**
 *
 * @author gusta
 */
public class PrincipalEjer06 {

    public static void main(String[] args) {
        ServicioProducto sp = new ServicioProducto();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bienvenido al menu: ");
        int opcion= 20;
    do {
        do {
             System.out.println("Ingrese la operacion a realizar:\n1. crear un producto\n2. "
            + "Mostrar la lista de productos\n3. Modificar el precio de un producto\n4. Eliminar un producto\n0. Salir");
             
            try {
                opcion = 20; // se reinicia con una opcion diferente a una valida
                opcion=Integer.parseInt(scan.next());
                break;
                }catch(Exception ex) {
                    System.out.println("Error, ingrese un numero ");
            }
            
            
        } while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=0 );
        
       
            switch(opcion)
            {
                case 1:                     
                    sp.crearProducto();
                break;
                case 2:                    
                    sp.mostrarProducto();
                break;
                case 3: 
                    sp.modificarPrecio();
                break;
                case 4:
                    sp.eliminarProducto();
                break;
                case 0: break;
            }
        } while (opcion != 0);
        
    }
    
}
