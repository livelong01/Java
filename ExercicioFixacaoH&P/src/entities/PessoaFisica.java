package entities;

public class PessoaFisica extends Contribuinte{

	private Double gastoSaude;


	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double calculoImposto() {
		if (super.getRendaAnual()  < 20000) {
			return super.getRendaAnual() * .15 - gastoSaude * .5; 
		}
		else {
			return super.getRendaAnual() * .25 - gastoSaude * .5;
		}
	}
	
}
