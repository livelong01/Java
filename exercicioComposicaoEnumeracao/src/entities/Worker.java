package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// COMPOSICAO DOS OBJS
	private Department departmente; // O trabalhador esta associado ao departamento tambem
	private List<HourContrat> contracts = new ArrayList<>(); // Como um trabalhador pode ter varios contratos, se cria uma lista associada a HourContrat
	// lista de contratos iniciada aqi
	
	public Worker () {
		
	}

	// O construtor nao instancia a lista, nesse caso voce instancia diretamente acima
	public Worker(String name, WorkerLevel level, Double baseSalary, Department departmente) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departmente = departmente;
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

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartmente() {
		return departmente;
	}

	public void setDepartmente(Department departmente) {
		this.departmente = departmente;
	}

	public List<HourContrat> getContracts() {
		return contracts;
	}
	
	
//
	//public void setContracts(List<HourContrat> contracts) {
		//this.contracts = contracts;
	//}
	//REMOVER O SET CONTRACT, para apenas a funcao add/remove contract possa alterar a lista.
	
	
// adc um contratato ao trabalhador é a msm coisa que add o contrato a lista.
	public void addContrat(HourContrat contrat) {
		contracts.add(contrat);
	}
	
	public void removeContrat(HourContrat contrat) {
		contracts.remove(contrat);
	} 
	
	public double income(int year, int month) {
		 double sum = baseSalary;
		 for (HourContrat c : contracts) {
			int c_year = c.getDate().getYear();
			int c_month = c.getDate().getMonthValue();; //acrescentar +1, pq o mes do calendar começa com zero.
			if (year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		 }
			return sum;
	}
	
	
	


	
	
}
