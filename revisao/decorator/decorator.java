public class Decorator extends Component{
	//decorador
	protected Component component;

	public Decorator(Component component){
		this.component = component;
	}

	@Override
	public void getNome(String nome){
		//pega o nome
	}
}
