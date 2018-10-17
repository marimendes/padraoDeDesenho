public class Director{
	protected Builder monta;

	public Director (Builder monta){
		this.monta = monta;
	}

	public void montaProduto(){
		monta.buildPeca1();
		monta.buildPeca2();
	}

	public Produto get.Produto(){
		return monta.getProduto();
	}
}