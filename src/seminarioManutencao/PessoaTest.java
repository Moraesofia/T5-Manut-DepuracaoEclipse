package seminarioManutencao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PessoaTest {

	@Test
	void testIMC() {
		Pessoa pessoa = new Pessoa(1.75f, 90f);
		float imc = pessoa.calcularIMC();
		assertEquals(imc, 29.387755102f, 0.01f);
	}
	
	@Test
	void testFaoxaIMC_Magreza() {
		Pessoa pessoa = new Pessoa(1.75f, 56.6f);
		FaixaIMC faixa = pessoa.calcularFaixaIMC();
		assertEquals(faixa, FaixaIMC.Magreza);		
	}

	@Test
	void testFaixaIMC_Saudavel() {
		Pessoa pessoa = new Pessoa(1.75f, 76.5f);
		FaixaIMC faixa = pessoa.calcularFaixaIMC();
		assertEquals(faixa, FaixaIMC.Saudavel);		
	}

	@Test
	void testFaixaIMC_Sobrepeso() {
		Pessoa pessoa = new Pessoa(1.75f, 91.874f);
		FaixaIMC faixa = pessoa.calcularFaixaIMC();
		assertEquals(faixa, FaixaIMC.Sobrepeso);		
	}

	@Test
	void testFaixaIMC_Obesidade() {
		Pessoa pessoa = new Pessoa(1.75f, 91.875f);
		FaixaIMC faixa = pessoa.calcularFaixaIMC();
		assertEquals(faixa, FaixaIMC.Obesidade);		
	}
}
