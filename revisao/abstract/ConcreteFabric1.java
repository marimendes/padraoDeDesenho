public class ConcreteFabri1 implements AbstractFactory {
	// Cria a familia de objetos: A + 1
	@Override
	public ProdutoA criaProdutoA(){
		return new A1;
	}

	@Override
	public ProdutoB criaProdutoB(){
		return new B1;
	}
}