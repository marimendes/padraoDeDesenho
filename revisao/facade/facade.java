public class Facade{

	protected SistemaA sistemaA;
	protected SistemaB sistemaB;

	public void startSistema(){
		sistemaA = new SistemaA();
		sistemaA.configuraA();

		sistemaB = new SistemaB();
		sistemaB.configuraB();
	}
}