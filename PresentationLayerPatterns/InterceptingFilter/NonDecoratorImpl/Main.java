package PresentationLayerPatterns.InterceptingFilter.NonDecoratorImpl;

public class Main {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new DebuggingFilter());
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new InputValidationFilter());
        filterChain.processFilter();

        System.out.println();
        filterChain = new FilterChain();
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new DebuggingFilter());
        filterChain.processFilter();
    }
}
