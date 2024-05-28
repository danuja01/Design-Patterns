package DesignPatterns.Template;

public class Tea extends Beverage{
	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addCondiments() {
		System.out.println("Sdding Lemon");
	}
}
