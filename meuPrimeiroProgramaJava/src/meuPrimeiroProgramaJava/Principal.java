/**
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;
/**
 * @author ferre
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Olá ssssss!\nQual é o seu nome?"); 
		// exemplo de comentario
		
		Scanner oi = new Scanner(System.in);
		String nome = oi.nextLine();
		System.out.printf("Teste");
		System.out.printf("Olá %s!\n", nome);
		System.out.printf("Exemplo de merge quem sabe");
		
		System.out.printf("Exemplo de merge");
	}

}
