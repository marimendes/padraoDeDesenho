public class ConcreteFabri2 implements AbstractFactory {
	@Override
	public ProdutoA criaProdutoA(){
		return new A2;
	}

	@Override
	public ProdutoB criaProdutoB(){
		return new B2;
	}
}