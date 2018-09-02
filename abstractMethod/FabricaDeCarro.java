package br.padroes.abstractFactory;

//Interface de criação das fábricas
public interface FabricaDeCarro {
	CarroSedan criarCarroSedan();
	CarroPopular criarCarroPopular();
}