package br.com.solid.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Rise implements TaxableReadjustment {

	private BigDecimal valor;
	private LocalDate data;

	public Rise(BigDecimal valor) {
		this.valor = valor;
		this.data = LocalDate.now();
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}
	
	@Override
	public BigDecimal valorImpostoDeRenda() {
		return valor.multiply(new BigDecimal("0.1"));
	}

}
