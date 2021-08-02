package br.com.solid.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Readjustment {

	BigDecimal valor();
	LocalDate data();
	
}
