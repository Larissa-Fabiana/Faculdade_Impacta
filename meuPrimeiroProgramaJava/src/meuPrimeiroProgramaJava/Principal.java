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
		// exemplo de coment�rio
		System.out.println("Ol� amigo!\nQual � o seu nome?");
		Scanner oi = new Scanner(System.in);
		String nome = oi.nextLine();
		System.out.printf("Ol� %s!\n", nome);
	}

}
