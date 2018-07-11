package seminarioManutencao;

/**
 * Demonstração de Java Exeptions para testar a função de depuração da IDE
 * Eclipse.
 * 
 * @author Sofia Moraes e Nelson William
 *
 */
public class depuracaoEclipse {

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
			System.out.println("Algo deu errado: " + c.getMessage());
		}
	}

}
