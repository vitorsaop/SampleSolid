package br.com.solid.model;

import java.math.BigDecimal;

public class PersonalData {

	private String nome;
	private String cpf;
	private Office office;
	private BigDecimal salario;

	public PersonalData(String nome, String cpf, Office office, BigDecimal salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.office = office;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Office getCargo() {
		return office;
	}
	public void setCargo(Office office) {
		this.office = office;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
