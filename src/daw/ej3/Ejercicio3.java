/**
 * 
 */
package daw.ej3;

import java.io.*;
import java.util.*;

/**
 * EJERCICIO 3
 * http://www.programmr.com/left2​
 * 
 * Escribe un programa que lea un String del usuario, y que devuelva ese String
 * rotado en dos posiciones (los dos primeros caracteres se mueven al final). La
 * longitud del string debe ser por lo menos de 2 (versión pro: captura y trata
 * la excepción que aparece si la longitud es menor, pidiendo al usuario que
 * introduzca un String más largo)
 * 
 * Entrada: Manzana
 * Salida: nzanaMa
 * 
 * 
 * @author Sara V.
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		char caracter1, caracter2;
		String cadenaRotada ="";
		
		System.out.print("Introduce una cadena de caracteres: ");
		String cadena = br.readLine();
		
		ArrayDeque<Character> dobleCola = new ArrayDeque<Character>();
		for (int i=0; i< cadena.length(); i++) {
			dobleCola.add(cadena.charAt(i));
		}	
		
		/*
		 * introduce aquí tu código.
		 * No puedes cambiar nada del código que ya existe
		 * 
		 * */
		if(dobleCola.size()>=2) {
		caracter1 = dobleCola.pollFirst();
		caracter2 = dobleCola.pollFirst();
		dobleCola.addLast(caracter1);
		dobleCola.addLast(caracter2);
		
		for(Character c : dobleCola) {
			cadenaRotada += c;
		}
		
		}
		else {
			System.out.println("La cadena introducida es demasiado corta. Introduce una cadena mas larga");
		}
	
		
		System.out.println("La cadena rotada 2 veces es: "+cadenaRotada);
		
	}

}
