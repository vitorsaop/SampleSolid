package br.com.solid.service.reajuste;

import java.math.BigDecimal;

import br.com.solid.model.Employee;

public interface ValidationAdjustment {
	void validation(Employee employee, BigDecimal aumento);
}
