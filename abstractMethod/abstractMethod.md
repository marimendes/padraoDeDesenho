## Abstract Method

O padrão Abstract Method possui a seguinte intenção:

Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
	
### Exemplo:
 - Você precisa de uma fábrica de sedan e um fabrica de carros populares. Dentro de cada fábrica você tem um carro fiat e um ford.

*OBS*: Todos os produtos devem ter uma interface em comum. 

### Prós: 
 - Segue o principio de aberto/fechado.
 - Permite construit familias de objetos de produto e garante sua compatibilidade.
 - Evita o acoplamento rígido entre produtos e o código.
 - Divide a responsabilidade entre várias classes.

### Contras: 
 - Requer subclasses extras.