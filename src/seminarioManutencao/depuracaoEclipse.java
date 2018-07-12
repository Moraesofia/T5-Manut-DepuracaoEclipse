package seminarioManutencao;

/**
 * Demonstração de Java Exeptions para testar a função de depuração da IDE
 * Eclipse.
 * 
 * @author Sofia Moraes e Nelson William
 *
 */
public class DepuracaoEclipse {

	public static void main(String[] args) {

		// Causando ArrayIndexOutOfBoundsException
		// Acessando uma posiçao do array que não existe.
		int[] numeros = new int[5];
		int i = 0;

		try {
			for (i = 0; i <= 5; i++) {
				numeros[i] = i;
				System.out.println(numeros[i]);
			}
		} catch (Exception a) {
			// Note que que o numero de repetições foi maior que o tamanho do vetor.
			System.out.println("Algo deu errado: " + a.getMessage());
		}
		System.out.println();

		// Causando ArithmeticException
		// Divisao por zero.
		float divisao = 0;
		int j = 0;

		try {
			for (j = 3; j >= 0; j--) {
				divisao = 6 / j;
				System.out.println("Divisao de 6 por " + j + " e igual a " + divisao);
			}
		} catch (Exception b) {
			// Note que houve uma divisão por zero.
			System.out.println("Algo deu errado: " + b.getMessage());
		}

		System.out.println();

		// Causando NullPointerException
		// Acessando array nulo.
		int[] vetorUm = new int[3];
		int[] vetorDois = new int[3];
		int[] vetorTres = new int[3];
		try {
			// dixando null
			vetorUm = null;

			System.out.println("primeiro item dos vetores respectivamente: " + vetorUm[0] + " " + vetorDois[0] + " "
					+ vetorTres[0]);
		} catch (Exception c) {
			// Note que dentre os três vetores, um deles causou a exceção.
			System.out.println("Algo deu errado: " + c.getMessage());
		}

		// Explorando um método
		// Trocando o escopo
		int x = 1;
		System.out.println("Valor inicial de x: " + x);
		x = somaDez(x);
		System.out.println("Valor final de x: " + x);

	}

	/**
	 * Método separado do main - Acrescenta uma dezena a um numero n.
	 * 
	 * @param n numero que será somado.
	 * @return o parâmetro após a soma.
	 */
	public static int somaDez(int n) {

		for (int i = 0; i < 10; i++) {
			n += i;
		}
		return n;
	}

}
