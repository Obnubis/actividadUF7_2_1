/**
 * 
 */
package daw.ej2;

import java.util.*;

/**
 * EJERCICIO 2
 * http://www.programmr.com/list-letters​
 * 
 * Escribe un programa que lea una línea de texto introducida por el usuario.
 * Convierte las letras a mayúscula, y luego imprime una lista de las diferentes
 * letras que aparecen, en orden ascendente (de la A a la Z). Después, imprime
 * cuántas letras diferentes hay.
 * 
 * Entrada: hola holita
 * Salida:
 * A
 * H
 * I
 * L
 * O
 * T
 * Hay 6 letras diferentes
 * 
 * 
 * @author Sara V.
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		char letra;
		
		System.out.print("Introduce una línea de texto: ");
		String texto = sc.nextLine().toUpperCase();
		
		PriorityQueue<Character> cola = new PriorityQueue<Character>();
		
		for (int i=0; i< texto.length(); i++) {
			cola.add(texto.charAt(i));
		}	
		
			/*
			 * introduce aquí tu código.
			 * No puedes cambiar nada del código que ya existe
			 * 
			 * */
			while(!cola.isEmpty()) {
				letra = cola.poll();
				if(!cola.contains(letra) && letra !=' ') {
					System.out.println(letra);
					contador++;
				}
			}
		
		System.out.println("En el texto hay "+ contador+" letras diferentes");
		


	}

}
