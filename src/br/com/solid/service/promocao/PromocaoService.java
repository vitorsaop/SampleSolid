package br.com.solid.service.promocao;

import br.com.solid.ValidationException;
import br.com.solid.model.Employee;
import br.com.solid.model.Office;

public class PromocaoService {

	public void promover(Employee employee, boolean metaBatiada) {
		Office cargoAtual = employee.getCargo();
		if (Office.MANAGER == cargoAtual) {
			throw new ValidationException("Gerente não podem ser promovidos");
		}
		
		if (metaBatiada) {
			Office novoCargo = cargoAtual.getNextOffice();
			employee.promover(novoCargo);
		} else {
			throw new ValidationException("Funcionário não bateu a meta!");
		}
	}
	
}
