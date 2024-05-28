package PresentationLayerPatterns.InterceptingFilter.NonDecoratorImpl;

public class DebuggingFilter implements IFilter {
    @Override
    public void execute() {
        System.out.println("Debugging Filter");
    } 
}
