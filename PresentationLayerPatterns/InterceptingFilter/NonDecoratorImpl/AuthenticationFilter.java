package PresentationLayerPatterns.InterceptingFilter.NonDecoratorImpl;

public class AuthenticationFilter implements IFilter {
    @Override
    public void execute() {
        System.out.println("Authentication Filter");
    }
}
