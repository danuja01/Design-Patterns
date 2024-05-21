package singleton;

public class Loggin {
	
	private static Loggin ob;

	private Loggin() {
	}
	
	public static Loggin getOb() {
		if (ob == null) {
			synchronized (Loggin.class) {
				if(ob == null) {
					ob = new Loggin();
				}
			}
		}
		return ob;
	}
	

}


