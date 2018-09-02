package br.padroes.factoryMethod;

//Classes fabricas
public class FabricaFiat implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Palio();
	}

}