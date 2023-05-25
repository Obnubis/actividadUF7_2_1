/**
 * 
 */
package daw.ej4;

import java.util.*;

/**
 * EJERCICIO 4
 * http://www.programmr.com/reverse-number-2​
 * 
 * Escribe un programa que lea un número que el usuario introduzca por teclado,
 * y le dé la vuelta.
 * 
 * Entrada: 12345
 * Salida: 54321
 * 
 * 
 * @author Sara V.
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rotatedNum=0;

		
		System.out.print("Introduce el número: ");
		int num = sc.nextInt();
		
		String miString = Integer.toString(num);
		
		Stack<Character> pila = new Stack<Character>();
		
		for (int i=0; i< miString.length(); i++) {
			pila.push(miString.charAt(i));
		}	
		
			/*
			 * introduce aquí tu código.
			 * No puedes cambiar nada del código que ya existe
			 * 
			 * */
			
			miString="";
		
			while(!pila.isEmpty()){
				miString = miString +pila.pop();
					
			}
			rotatedNum = Integer.parseInt(miString);
		
		System.out.println("Número invertido: "+ rotatedNum);

	}

}
