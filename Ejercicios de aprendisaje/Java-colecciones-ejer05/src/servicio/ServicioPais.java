/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package servicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPais {
    
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public HashSet<String> paises = new HashSet();
    
    //creo el metodo de servicio
    public void crearpais(){
        char opc;
    do {
        System.out.println("Ingrese un pais: ");
        String pais = scan.next();
        paises.add(pais);
        System.out.println("Desea crear otro pais? s/n ");
        opc = scan.next().charAt(0); 
        } while (opc != 'n');
        //muestro lista de paises
        System.out.println("conjunto de paises creados:");
        for (String paise : paises) {
            System.out.println(paise);
        }
    }
    
    
    
    // ordenar conjunto
    public void ordenarConjunto(){
        ArrayList<String> arraypaises = new ArrayList(paises);
        Collections.sort(arraypaises);
        System.out.println("Lista ordenada de paises");
        for (String arraypaise : arraypaises) {
            System.out.println(arraypaise);
        }
    }
    
    /*
    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
    buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
    usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
    al usuario.
    */
    public void eliminarPais(){
        System.out.println("Ingrese el pais que desea eliminar: ");
        String buscar = scan.next();
        Iterator <String> it= paises.iterator();
        int cont= 0; 
        int largo= paises.size();
        while (it.hasNext()) {
            if (it.next().equals(paises)) { //borro el pais elegido
                it.remove();    
            }else{ 
                cont++;
            }
        }
        if (cont == largo) {
            System.out.println("El pais no se encuentra en el conjunto");
        }
        //muestro la lista de paises
        System.out.println("El conjunto de paises queda de la siguiente forma: ");
        for (String paise : paises) {
            System.out.println(paise);
        }
    }
}
