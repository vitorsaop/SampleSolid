package br.com.solid.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.solid.ValidationException;
import br.com.solid.model.Employee;

public class ValidationPercentageAdjustment implements ValidationAdjustment {

	public void validation(Employee employee, BigDecimal aumento) {
		BigDecimal salarioAtual = employee.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidationException("Reajuste nao pode ser superior a 40% do salario!");
		}
		
		BigDecimal salarioReajustado = salarioAtual.add(aumento);
		employee.atualizarSalario(salarioReajustado);
	}

}
