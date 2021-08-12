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
		// TODO Auto-generated method stub
		// exemplo de comentario
		System.out.println("Olá amigo!\nQual é o seu nome?");
		Scanner oi = new Scanner(System.in);
		
	
		String nome = oi.nextLine();
		System.out.printf("Teste");
		System.out.printf("Olá %s!\n", nome);
		System.out.printf("Exemplo de merge errado");
	}

}
