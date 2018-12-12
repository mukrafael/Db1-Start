package br.com.db1start.calculadoraapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.db1start.calculadoraapi.model.Calculadora;

public interface CalculadoraRepository extends JpaRepository<Calculadora, Long> {
}