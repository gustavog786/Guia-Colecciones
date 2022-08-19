/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo 
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará 
en la lista y después se le preguntará al usuario si quiere guardar otro perro 
o si quiere salir. Si decide salir, se mostrará todos los perros guardados
en el ArrayList.
*/
package principal;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> razasPerro = new ArrayList();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        char opc;
        do {  
            System.out.println("Ingrese una raza de perro");
            String raza = scan.next();
            razasPerro.add(raza);
            System.out.println("Desea ingresar otro perro ? s/n");
            opc = scan.next().charAt(0);
            
        } while (opc != 'n');
        System.out.println("La lista de razas de perros es: ");
        for (String string : razasPerro) {
            System.out.println(string);
        }
    }
    
}
