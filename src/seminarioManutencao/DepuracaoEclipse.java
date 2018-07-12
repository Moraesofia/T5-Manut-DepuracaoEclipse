package seminarioManutencao;

/**
 * Demonstra��o de Java Exeptions para testar a fun��o de depura��o da IDE
 * Eclipse.
 * 
 * @author Sofia Moraes e Nelson William
 *
 */
public class DepuracaoEclipse {

	public static void main(String[] args) {

		// Causando ArrayIndexOutOfBoundsException
		// Acessando uma posi�ao do array que n�o existe.
		int[] numeros = new int[5];
		int i = 0;

		try {
			for (i = 0; i <= 5; i++) {
				numeros[i] = i;
				System.out.println(numeros[i]);
			}
		} catch (Exception a) {
			// Note que que o numero de repeti��es foi maior que o tamanho do vetor.
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
			// Note que houve uma divis�o por zero.
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
			// Note que dentre os tr�s vetores, um deles causou a exce��o.
			System.out.println("Algo deu errado: " + c.getMessage());
		}

		// Explorando um m�todo
		// Trocando o escopo
		int x = 1;
		System.out.println("Valor inicial de x: " + x);
		x = somaDez(x);
		System.out.println("Valor final de x: " + x);

	}

	/**
	 * M�todo separado do main - Acrescenta uma dezena a um numero n.
	 * 
	 * @param n numero que ser� somado.
	 * @return o par�metro ap�s a soma.
	 */
	public static int somaDez(int n) {

		for (int i = 0; i < 10; i++) {
			n += i;
		}
		return n;
	}

}
