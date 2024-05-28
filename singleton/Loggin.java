package singleton;

public class Loggin {
	
	private static Loggin ob;

	private Loggin() {
	}
	
	public static Loggin getOb() {
		if (ob == null) {
			// doble check lock
			synchronized (Loggin.class) {
				if(ob == null) {
					ob = new Loggin();
				}
			}
		}
		return ob;
	}
}
//  thread safty without doble cheking lock
class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}

class Client {
	public static void main(String[] args) {
		Loggin ob1 = Loggin.getOb();
		Loggin ob2 = Loggin.getOb();
		System.out.println(ob1 == ob2);
	}
}



