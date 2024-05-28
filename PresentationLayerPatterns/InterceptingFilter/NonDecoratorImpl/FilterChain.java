package PresentationLayerPatterns.InterceptingFilter.NonDecoratorImpl;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<IFilter> filters = new ArrayList<>();

    public void addFilter(IFilter iFilter) {
        filters.add(iFilter);
    }

    public void processFilter() {
        for(IFilter filter : filters) {
            filter.execute();
        }
        System.out.println();
    }
}
