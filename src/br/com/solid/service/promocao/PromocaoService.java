package br.com.solid.service.promocao;

import br.com.solid.ValidationException;
import br.com.solid.model.Employee;
import br.com.solid.model.Office;

public class PromocaoService {

	public void promover(Employee employee, boolean metaBatiada) {
		Office cargoAtual = employee.getCargo();
		if (Office.MANAGER == cargoAtual) {
			throw new ValidationException("Gerente n�o podem ser promovidos");
		}
		
		if (metaBatiada) {
			Office novoCargo = cargoAtual.getNextOffice();
			employee.promover(novoCargo);
		} else {
			throw new ValidationException("Funcion�rio n�o bateu a meta!");
		}
	}
	
}
