public static void main(String[] args) {
    Creator fabrica = new ConcreteCreator();
    Produto a = fabrica.criaProduto();
    a.exibirProduto();
    System.out.println();


}