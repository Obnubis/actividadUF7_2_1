/**
 * 
 */
package daw.ej5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * EJERCICIO 5
 * http://www.programmr.com/challenges/statement-reverse-1​
 * 
 * Escribe un programa que lea una frase por teclado y la imprima al revés de la
 * siguiente forma:
 *  
 * Entrada: Mi nombre es Sara 
 * Salida: Sara es nombre Mi
 * 
 * 
 * @author Sara V.
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] arrayStrings;
	
		System.out.print("Introduce una cadena de caracteres: ");
		String texto = br.readLine();
		
		System.out.println("El reverso es: ");
		
		arrayStrings = texto.split(" ");
		
		ArrayList <String> lista = new ArrayList<String>();
		
		/*
		 * introduce aquí tu código.
		 * No puedes cambiar nada del código que ya existe
		 * 
		 * */
		
		for(int i=0;i<arrayStrings.length;i++) {
			lista.add(arrayStrings[i]);
		}
		Collections.reverse(lista);
		
		texto="";
		
		for(String s : lista) {
			texto = texto+" "+s;
		}
		

		System.out.println(texto);

	}

}
