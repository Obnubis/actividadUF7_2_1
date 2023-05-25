/**
 * 
 */
package daw.ej1;

import java.util.*;

/**
 * EJERCICIO 1 
 * http://www.programmr.com/remove-vowels-word​
 * 
 * 
 * Usando una LinkedList, vamos a quitar las vocales de una palabra: El usuario
 * introduce una palabra por teclado, y nuestro programa imprimirá esa palabra
 * sin vocales.
 * 
 * Entrada: Hola Salida: Hl
 * 
 * 
 * @author Sara V.
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sinVocales = "";
		char caracter;

		System.out.print("Introduce la palabra: ");
		String palabra = sc.nextLine();
		LinkedList<Character> lista = new LinkedList<Character>();

		for (int i = 0; i < palabra.length(); i++) {
			lista.add(palabra.charAt(i));
		}

		/*
		 * introduce aquí tu código. No puedes cambiar nada del código que ya existe
		 * 
		 */
		caracter= 'a';
		sinVocales=quitarvocales(lista, caracter);
		
		
		
		System.out.println("Resultado: " + sinVocales);
		

	}
	
	public static String quitarvocales (LinkedList<Character> lista,char c){
		String res="";
		for(int i = 0; i<lista.size();i++) {
			c = Character.toUpperCase(lista.get(i).charValue());
			if(c=='A'|| c=='E'|| c=='I'|| c== 'O'|| c=='U') {
				lista.remove(i);
			}
			
		}
		for ( int i =0; i<lista.size();i++) {
			res = res +lista.get(i);
		}
		return res;
	}
	
	

}
