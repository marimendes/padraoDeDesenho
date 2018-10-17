public static void main(String[] args) {
    AbstractFactory fabrica = new ConcreteFabric1();
    AbstractProdutoA a = fabrica.criaProdutoA();
    AbstractProdutoB b = fabrica.criaProdutoB();
    a.exibirProdutoA();
    System.out.println();
    b.exibirProdutoB();
    System.out.println();
 
    fabrica = new ConcreteFabric2();
    a = fabrica.criaProdutoA();
    b = fabrica.criaProdutoB();
    a.exibirProdutoA();
    System.out.println();
    b.exibirProdutoB();
}