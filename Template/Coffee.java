package Template;

public class Coffee extends Beverage {
	@Override
	void brew() {
		System.out.println("Add suger milk");
		
	}
	@Override
	void addCondiments() {
		System.out.println("Stripping coffie though filter");
	}
}
