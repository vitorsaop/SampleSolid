package br.com.solid.model;

import java.math.BigDecimal;

public class Outsourced  {

	private String empresa;
	private PersonalData personalData;
	
	public Outsourced(String nome, String cpf, Office office, BigDecimal salario, String empresa) {
		this.personalData = new PersonalData(nome, cpf, office, salario);
		this.empresa = empresa;
	}
	
	public String getEmpresa() {
		return empresa;
	}
	
	public String cpf() {
		return this.personalData.getCpf();
	}

	public Office getCargo() {
		return this.personalData.getCargo();
	}

	public BigDecimal salario() {
		return this.personalData.getSalario();
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
