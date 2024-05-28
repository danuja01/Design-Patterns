package PresentationLayerPatterns.InterceptingFilter.DecoratorImpl;

public class DebuggingFilter implements IFilter {

    private IFilter iFilter;

    public DebuggingFilter() {}

    public DebuggingFilter(IFilter iFilter) {
        this.iFilter = iFilter;
    }

    @Override
    public void execute() {
        System.out.println("Debugging Filter");
        if(iFilter != null) {
            iFilter.execute();
        }
    } 
}
