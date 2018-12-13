package br.com.db1start.calculadoraapi.repository;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.db1start.calculadoraapi.model.Calculadora;
import br.com.db1start.calculadoraapi.model.Operacao;
import br.com.db1start.calculadoraapi.repository.CalculadoraRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculadoraTest {
	
	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	@After
	public void after() {
		calculadoraRepository.deleteAll();
	}
	
	@Test
	public void deveRetornarSoma() {
		Calculadora calculadora = new Calculadora(4, 2, Operacao.SOMA);
		
		double operacaoSoma = calculadora.getResultado();
		
		Assert.assertEquals(6, operacaoSoma, 0.001);
	}
	
	@Test
	public void deveRetornaqrSubtracao() {
		Calculadora calculadora = new Calculadora(4, 2, Operacao.SUBTRACAO);
		
		Double operacaoSubtrai = calculadora.getResultado();
		
		Assert.assertEquals(2, operacaoSubtrai, 0.001);
	}
	
	@Test
	public void deveRetornarMultiplicacao() {
		Calculadora calculadora = new Calculadora(4.0, 2.0, Operacao.MULTIPLICACAO);
		
		Double operacaoMultiplica= calculadora.getResultado();
		
		Assert.assertEquals(8.0, operacaoMultiplica, 0.001);
	}
	
	@Test
	public void deveRetornarDivisao() {
Calculadora calculadora = new Calculadora(4.0, 2.0, Operacao.DIVISAO);
		
		Double operacaoDivisao = calculadora.getResultado();
		
		Assert.assertEquals(2.0, operacaoDivisao, 0.001);
	}
}