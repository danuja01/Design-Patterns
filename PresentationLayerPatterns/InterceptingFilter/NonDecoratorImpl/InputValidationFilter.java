package PresentationLayerPatterns.InterceptingFilter.NonDecoratorImpl;

public class InputValidationFilter implements IFilter {
    @Override
    public void execute() {
        System.out.println("Input Validation Filter");
    }
}
