package PresentationLayerPatterns.InterceptingFilter.DecoratorImpl;

public class Main {
    public static void main(String[] args) {
        IFilter iFilter = new AuthenticationFilter(new DebuggingFilter(new InputValidationFilter()));
        iFilter.execute();

        System.out.println();
        new AuthenticationFilter(new DebuggingFilter()).execute();

        System.out.println();
        new AuthenticationFilter().execute();

        System.out.println();
        new InputValidationFilter(new DebuggingFilter(new AuthenticationFilter())).execute();
    }
}
