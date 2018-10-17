public class Adapter extends Target implements Adaptee {
	//nova interface adptada
	@Override
	public void fazAlgumaCoisa(String nome){
		fazAlgumaCoisaX(nome);

	}
}