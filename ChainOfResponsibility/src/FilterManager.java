import java.util.*;

public class FilterManager{

	public ArrayList<Filter> filters;
	
	public FilterManager(){
		filters = new ArrayList<Filter>();
	}

	public void addFilter(Filter filter){
		this.filters.add(filter);
	}
	
	public void process(Order order){
		
		for(Filter filter : this.filters){
			
			filter.filter(order);
		
		}

	}
}