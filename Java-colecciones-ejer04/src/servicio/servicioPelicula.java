/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class servicioPelicula {
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas = new ArrayList();
    
    //Metodo para crear las peliculas
    public void crearPelicula(){
         char opc;
    do {
        System.out.println("Ingrese el titulo de la pelicula: ");
        String nombre = scan.next();
        System.out.println("Ingrese el nombre del director: ");
        String titulo = scan.next();
        System.out.println("Ingrese la duracion en horas: ");
        int duracion = scan.nextInt();
        peliculas.add(new Pelicula(nombre, titulo, duracion));
        
        System.out.println("Desea crea otro alumno? s/n ");
        opc = scan.next().charAt(0);
        } while(opc !='n');
    }
    //• Mostrar en pantalla todas las películas.
    public void mostrarPeliculas(){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo());
        }
    }
    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void masDeUnaHora(){
        System.out.println("Las peliculas mayores a 1 hora son: ");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion()> 1) {
                System.out.println( pelicula.getTitulo());
            }
        }
    }
    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
    public void ordenadasPorDuracionMayor(){
        peliculas.sort(Pelicula.compararDuracionmayor);
        System.out.println("Películas ordenadas por duración de mayor a menor:");
        for (Pelicula pelicula : this.peliculas) {
            System.out.println(pelicula);
        }
    }
    
    //• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
    public void ordenadasPorDuracionMenor(){
        peliculas.sort(Pelicula.compararDuracionmenor);
        System.out.println("Películas ordenadas por duración de mayor a menor:");
        for (Pelicula pelicula : this.peliculas) {
            System.out.println(pelicula);
        }
    }
    //• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
    public void ordenadasPorTitulo(){
        peliculas.sort(Pelicula.compararTitulo);
        System.out.println("Películas ordenadas por título alfabéticamente");
       for (Pelicula pelicula : this.peliculas) {
            System.out.println(pelicula);
        }
    }
    //• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public void ordenadasPorDirector(){
        peliculas.sort(Pelicula.compararDirector);
        System.out.println("Películas ordenadas por director alfabéticamente:");
        for (Pelicula pelicula : this.peliculas) {
            System.out.println(pelicula);
        }
    }
}
