package br.com.solid.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.solid.ValidationException;
import br.com.solid.model.Employee;

public class ValidationPeriodicityBetweenReadjustment implements ValidationAdjustment {

	public void validation(Employee employee, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = employee.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDesdeUltimoReajuste < 6) {
			throw new ValidationException("Intervalo entre reajuste menor do que 6 meses.");
		}
	}
	
}
