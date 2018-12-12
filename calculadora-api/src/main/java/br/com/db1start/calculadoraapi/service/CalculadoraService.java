package br.com.db1start.calculadoraapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.db1start.calculadoraapi.model.Calculadora;
import br.com.db1start.calculadoraapi.model.Operacao;
import br.com.db1start.calculadoraapi.repository.CalculadoraRepository;

@Service
public class CalculadoraService {
	
	@Autowired
	private CalculadoraRepository calculadoraRepository;
	
	public Calculadora salvaResultado(Double numeroUm, Double numeroDois, Operacao operacao) {
		Calculadora calculadora = new Calculadora(numeroUm, numeroDois, operacao);
		calculadoraRepository.save(calculadora);
		return calculadora;
	}
}