/**
 * 
 */
package codigo;


/**
 * @author ferre
 *
 */
public class Arranjo {

	/**
	 * @param args
	 */

	public Object menor(int[] arranjo) {
		int menor = arranjo[0];
		for (int i = 0; i < arranjo.length; i++) {
			if(arranjo[i] < menor) {
				menor = arranjo[i];
			}
		}
		return menor;
	}

	public Object maior(int[] arranjo) {
		int maior = arranjo[0];
		for (int i = 0; i < arranjo.length; i++) {
			if(arranjo[i] > maior) {
				maior = arranjo[i];
			}
		}
		return maior;
	}

	public Object soma(int[] arranjo) {
		int soma = 0;
		for (int i = 0; i < arranjo.length; i++) {
			soma += arranjo[i];
		}
		return soma;
	}

	public Object repeticoes(int[] arranjo, int valor) {
		int repeticoes = 0;
		for (int i = 0; i < arranjo.length; i++) {
			if(arranjo[i] == valor) {
				repeticoes += 1;
			}		
		}
		return repeticoes;
	}

}
