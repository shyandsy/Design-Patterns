import java.util.*;

public class FilterManager{

	public ArrayList<Filter> filters;
	
	public FilterManager(){
		filters = new ArrayList<Filter>();
	}

	public void addFilter(Filter filter){
		this.filters.add(filter);
	}
	
	public Order process(Order order){
		
		for(Filter filter : this.filters){
			
			order = filter.filter(order);
		
		}
		
		return order;
	}
}