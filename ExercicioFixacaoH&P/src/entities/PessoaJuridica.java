package entities;

public class PessoaJuridica extends Contribuinte{

	private Integer nFuncionarios;

	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer nFuncionarios2) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios2;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public Double calculoImposto() {
		
		if (nFuncionarios > 10) {
			return super.getRendaAnual() * .14;
		}
		else {
			return super.getRendaAnual() * .16;
		}
	}
	
}
