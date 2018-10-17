public class ConcrectCreator implements Creator{
	// cria o produto
	// pode mais de um produto
	@Override
	Produto criaProduto(){
		return new Produtinho();
	}
}