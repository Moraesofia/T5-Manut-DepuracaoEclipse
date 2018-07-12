package seminarioManutencao;

public class Pessoa {

	/**
	 * Altura em metros.
	 */
	private float altura;
	
	/**
	 * Massa em kg.
	 */
	private float massa;
	
	public Pessoa(float altura, float massa) {
		this.altura = altura;
		this.massa = massa;
	}
	
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getMassa() {
		return massa;
	}

	public void setMassa(float massa) {
		this.massa = massa;
	}
	
	public float calcularIMC() {
		return massa / (altura * altura);
	}
	
	public FaixaIMC calcularFaixaIMC() {
		float imc = calcularIMC();
		if (imc <= 18.5f) {
			return FaixaIMC.Magreza;
		} else if (imc <= 25f) {
			return FaixaIMC.Saudavel;
		} else if (imc <= 30) {
			return FaixaIMC.Sobrepeso;
		} else {
			return FaixaIMC.Obesidade;
		}
	}
	
}
