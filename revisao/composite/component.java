public abstract class Component{	
	// Aquilo que todos são
	// exemplo: trecho

	public void fazAlgumaCoisa(String algo) {
		// faz alguma coisa aqui
	}

	public abstract void adiciona(Component);

	public abstract void remove(Component);

	public abstract void getComponent(Component);
}