package seminarioManutencao;

/**
 * Demonstracao de Java Exeptions para testar a funcionalidades de depuracao da
 * IDE Eclipse.
 * <p>
 * Insira breakpoints nas linhas 16, 32, 49, 65 e 74, acompanhe o fluxo de
 * execução do codigo e resolva os defeitos que causam as excecoes.
 * 
 * @author Sofia Moraes e Nelson William
 *
 */
public class DepuracaoEclipse {

	public static void main(String[] args) {

		// Causando ArrayIndexOutOfBoundsException
		// Acessando uma posicao do array que nao existe.
		int[] numeros = new int[5];
		int i = 0;

		try {
			for (i = 0; i <= 5; i++) {
				numeros[i] = i;
				System.out.println(numeros[i]);
			}
		} catch (Exception a) {
			// Note que que o numero de repeticoees foi maior que o tamanho do vetor.
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
			// Note que houve uma divisao por zero.
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
			// Note que dentre os tres vetores, um deles causou a excecao.
			System.out.println("Algo deu errado: " + c.getMessage());
		}

		// Explorando um metodo
		// Trocando o escopo
		int x = -40;
		System.out.println("Valor inicial de x: " + x);
		x = soma(x);
		System.out.println("Valor final de x: " + x);

		// Operações lógicas
		// Explorando espressões
		// Troque o valor de x para diferentes fluxos de execucao
		boolean maior;
		if (x > 10) {
			maior = true;
			System.out.println("O valor final de x é maior que dez");
		} else {
			maior = false;
		}

		if (maior == false && x < 10) {
			System.out.println("O valor final de x é menor que dez");
		}

	}

	/**
	 * Método separado do main - Acrescenta 45 a um numero n em dez iterações.
	 * 
	 * @param n
	 * @return parametro apos a soma
	 */
	public static int soma(int n) {

		for (int i = 0; i < 10; i++) {
			n += i;
		}
		return n;
	}

}
