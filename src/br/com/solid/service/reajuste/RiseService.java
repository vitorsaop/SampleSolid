package br.com.solid.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.solid.model.Employee;

public class RiseService {
	
	private List<ValidationAdjustment> validacoes;

	public RiseService(List<ValidationAdjustment> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustarSalarioDoFuncionario(Employee employee, BigDecimal aumento) {
		this.validacoes.forEach(v -> v.validation(employee, aumento));
		BigDecimal salarioReajustado = employee.getSalario().add(aumento);
		employee.atualizarSalario(salarioReajustado);
	}
	
}
