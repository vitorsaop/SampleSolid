package br.com.solid.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee  {

	private PersonalData personalData;
	private LocalDate dataUltimoReajuste;

	public Employee(String nome, String cpf, Office office, BigDecimal salario) {
		this.personalData = new PersonalData(nome, cpf, office, salario);
	}

	public String cpf() {
		return this.personalData.getCpf();
	}

	public Office getCargo() {
		return this.personalData.getCargo();
	}

	public BigDecimal getSalario() {
		return this.personalData.getSalario();
	}

	
	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal novoSalario) {
		// TODO Auto-generated method stub
		this.personalData.setSalario(novoSalario);
		this.dataUltimoReajuste = LocalDate.now();
	}

	public void promover(Office novoCargo) {
		this.personalData.setCargo(novoCargo);
	}

}
