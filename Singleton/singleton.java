public class Singleton()

	private static Singleton uniqueInstance;

	private Singleton(){

	}

	publica static synchronized Singleton getInstance(){
		if (uniqueInstance == null){
			uniqueInstance = new singleton();
		}

		return uniqueInstance;
	}