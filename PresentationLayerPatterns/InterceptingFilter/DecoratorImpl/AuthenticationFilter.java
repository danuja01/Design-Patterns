package PresentationLayerPatterns.InterceptingFilter.DecoratorImpl;

public class AuthenticationFilter implements IFilter {

    private IFilter iFilter;

    public AuthenticationFilter() {}

    public AuthenticationFilter(IFilter iFilter) {
        this.iFilter = iFilter;
    }

    @Override
    public void execute() {
        System.out.println("Authentication Filter");
        if (iFilter != null) {
            iFilter.execute();
        }
    }
}
