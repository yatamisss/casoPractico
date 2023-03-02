package com.generation.casopractico;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.generation.casopractico.models.Persona;
import com.generation.casopractico.models.Profesor;
import com.generation.casopractico.models.Alumno;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


@SpringBootApplication
public class CasopracticoApplication {

/*Se debe crear una función que permita al profesor ingresar notas por estudiante y que
luego permita obtener el promedio de cada estudiante.*/

// esto me quedo mal, no logre que me mostrara el promedio por estudiante 
	public static Double promedioAlumno(ArrayList <Double> libroClases){
		double suma= 0.0;
		for(int i = 0; i < libroClases.size(); i++){
			suma =+ libroClases.get(i);
		}
		return suma/libroClases.size();
	}


	public static void main(String[] args) {

		

		Scanner teclado = new Scanner(System.in); 
		HashMap <String, ArrayList<Double>> libroClase = new HashMap<String, ArrayList<Double>>();
		String nombreAlum = "";
		int cantidadAlumnos; 
		int cantidadNotas;
		ArrayList <Integer> nomArrayInt = new ArrayList<Integer>();
		do{
			System.out.print("Ingrese la cantidad de alumnos: ");
		    cantidadAlumnos= teclado.nextInt();
		if (cantidadAlumnos < 0){
			System.out.println("La cantidad de alumnos no puede ser menor a cero, intente nuevamente");
		}
	    }while (cantidadAlumnos <= 0);


		do{
			System.out.print("Ingrese la cantidad de notas por alumno: ");
			cantidadNotas= teclado.nextInt();
			if (cantidadNotas < 0){
				System.out.println("La cantidad de notas no puede ser menor a cero, intente nuevamente");
			}
		}while (cantidadNotas <= 0);

		
		for(int i = 1; i <= cantidadAlumnos; i++){
			teclado.nextLine();
			ArrayList <Double> notasAlumnos = new ArrayList<Double>();
			System.out.print("Ingresa el nombre del alumno: ");
			nombreAlum= teclado.nextLine();
			for(int x = 1; x <= cantidadNotas; x++){
				System.out.print("Ingresa nota " + x + " del alumno " + nombreAlum + ": ");
				Double nota = teclado.nextDouble();
				notasAlumnos.add(nota);
		}
	   
		libroClase.put(nombreAlum, notasAlumnos);
	}

// pregunta para mostrar el promedio por alumno 
	int opcion1 = 1;
       
	while(opcion1 != 0){
	do{
		System.out.println("Seleccione 1 si quiere obtener el promedio de las notas por alumno.");
		opcion1 = teclado.nextInt();
	}while (opcion1 < 0 && opcion1 >2);

	if(opcion1 ==1){
	// intento de mostrar el promedio
	for(String i : libroClase.keySet()){
		Double promAlum = promedioAlumno(libroClase.get(i));
		System.out.println("El promedio del alumno "+ i +" es de: " + promAlum);
	}
 


/*Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
alumnos por curso y que luego los muestre.
*/

// se que esto no es una funcion, pero de igual forma me permite guardar varios datos en un array de alumnos por curso
//y mostrarlos en pantalla cuando el usuario decida no ingresar mas estudiantes
// lo hice con los atributos de mi clase hijo (Alumno)
// ingresando su curso, letra del curso y nombre, solo que el usuario es el que debe especificar que todos los alumnos estan en el mismo curso

System.out.println("***************Inicio de ingreso datos de alumnos por curso********************");
	teclado.nextLine();
	ArrayList <Alumno> nuevoAlumno = new ArrayList <Alumno>();
	boolean seguirIngresando = true; 

	while(seguirIngresando){
	    Alumno alumnoVacio = new Alumno();
	
		System.out.println("Ingrese el nombre completo del alumno: ");
		alumnoVacio.setNombreCompleto(teclado.nextLine());

		System.out.println("Ingrese el nivel que cursa o curso:");
		alumnoVacio.setNivelCurso(teclado.nextLine());

		System.out.println("Ingrese la letra de su curso ('A', 'B', 'C'..): ");
		alumnoVacio.setLetraCurso(teclado.next().charAt(0));

		teclado.nextLine();

		nuevoAlumno.add(alumnoVacio);    

		System.out.println("¿Quiere ingresar a otro alumno? (S/N)");
		String opcion = teclado.nextLine();
		// con esta pregunta de aqui dependiendo de su respuesta, el bucle while se repetira nuevamente
		seguirIngresando = opcion.equalsIgnoreCase("S");
	}

	System.out.println("Los alumnos ingresados son:");
	for (Alumno alumno : nuevoAlumno) {
		System.out.println(alumno.getNombreCompleto() + ", " + alumno.getNivelCurso() + "-" + alumno.getLetraCurso());

	}


/*Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor
nota y el promedio de notas.
 */
// me ayude demasiado de internet para lograr hacer esto la verdad 

System.out.println("*******resultados del arreglo de notas -- mejor y peor nota, promedio**********");

Double [] notasAlumnos = {2.3, 5.6, 6.7, 5.0, 3.3};
Double mejorNota = notasAlumnos[0]; 
double peorNota = notasAlumnos[0]; 
double sumaNotas = 0.0;

for (Double nota : notasAlumnos) {
	if (nota > mejorNota) {
		mejorNota = nota; 
		// si la nota actual es mayor que la mejor nota, actualizamos la mejor nota
	}
	
	if (nota < peorNota) {
		peorNota = nota; 
		// si la nota actual es menor que la peor nota, actualizamos la peor nota
	}
	
	sumaNotas += nota; 
	// sumamos la nota actual a la suma de notas
}
Double promedioNotas = sumaNotas / notasAlumnos.length; // calculamos el promedio de notas

System.out.println("La mejor nota es: " + mejorNota);
System.out.println("La peor nota es: " + peorNota);
System.out.println("El promedio de notas es: " + promedioNotas);
}

}
	}
}
	