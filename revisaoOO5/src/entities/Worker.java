package entities;

import java.util.ArrayList;
import java.util.List;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private List<HourContract> contracts = new ArrayList<>();
	private Department department;
	
	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		double sum = baseSalary; // vai iniciar com o salario base.
		for (HourContract c : contracts) {
			int c_year = c.getDate().getYear(); // pega o ano do contrato atual, que esta analisado.
			int c_month = c.getDate().getMonthValue(); // mes
			if (c_year == year && c_month == month) { // ve se sao iguais ao digitado
				sum += c.totalValue(); // soma os totais dos contratos, que foram de mes e ano igual
			}
		}
		return sum; // retorna a soma total.
	}
	
	
	
}
