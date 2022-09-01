/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
*/
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class servicioAlumno {

    
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> alumnos = new ArrayList();
    
    //metodo para crea un alumno
    public void crearAlumno(){
    char opc;
    do {
        System.out.println("Ingrese el nombre de alumno: ");
        String nombre = scan.next();
        Integer notas[] = new Integer[3]; // creo el vector de notas
        System.out.println("Ingrese la primer nota del alumno: ");
        notas[0] = scan.nextInt();
        System.out.println("Ingrese la segunda nota del alumno: ");
        notas[1] = scan.nextInt();
        System.out.println("Ingrese la tercer nota del alumno: ");
        notas[2] = scan.nextInt();
        alumnos.add(new Alumno(nombre, notas));
        
        System.out.println("Desea crea otro alumno? s/n ");
        opc = scan.next().charAt(0);
        } while(opc !='n');
    }
    /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    promedio final, devuelto por el método y mostrado en el main.
    */
    public void notaFinal(){
        char opc;
        int cont = 0;
        do {
            System.out.println("Ingrese el nobra del alumno para saber su nota final: ");
            String alu=scan.next();
            
            for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equals(alu)) {
                System.out.println("La nota final de alumno es: "+ calculoNotaFinal(alumno));
                }else{
                cont = cont +1;
            }
            }
            if (cont == alumnos.size()){
                System.out.println("El alumno no se encuentra en la lista");
            }
            System.out.println("Desea saber la nota final de otro alumno? s/n ");
            opc = scan.next().charAt(0);
        } while (opc !='n');
    }
    
    //metodo de calculo de nota
    public float calculoNotaFinal(Alumno alumno){
        float suma= 0;
        for(Integer nota: alumno.getNotas()){
            suma= suma + nota;
        }
        return suma/3;
    }
}
