package br.com.solid.service.tributacao;

import java.math.BigDecimal;

public interface TaxableReadjustment extends Readjustment {
	BigDecimal valorImpostoDeRenda();
}
