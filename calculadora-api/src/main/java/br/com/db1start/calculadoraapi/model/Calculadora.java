package br.com.db1start.calculadoraapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calculadora")
public class Calculadora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="numeroUm ", nullable = false, length = 14)
	private Double numeroUm;
	
	@Column(name="numeroDois", nullable = false, length = 14)
	private Double numeroDois;
	
	@Column(name = "resultado", length = 14)
	private Double resultado;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "operacao", nullable = false, length = 50)
	private Operacao operacoes;
	
	@Column(name = "data", length = 20)
	private LocalDateTime data;

	
	protected Calculadora() {
	}
	
	public Calculadora(double numeroUM, double numeroDois, Operacao operacao) {
		this.numeroUm = numeroUM;
		this.numeroDois = numeroDois;
		this.operacoes = operacao;
		this.resultado = operacao.executaOperacao(numeroUM, numeroDois);
		this.data = LocalDateTime.now();
	}
	
	public Calculadora(Double numeroUm, Double numeroDois) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
	}
	
	public Long getId() {
		return id;
	}
	
	public Double getNumeroUm() {
		return this.numeroUm;
	}
	
	public Double getNumeroDois() {
		return this.numeroDois;
	}
	
	public Double getResultado() {
		return resultado;
	}
	
	public Operacao getOperacoes() {
		return operacoes;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	

}