public class FilterTotal implements Filter{
	
	public Order filter(Order order){
		
		double total = 0;
		
		for(OrderTotal orderTotal : order.getOrderTotals()){
			total += orderTotal.getTotal();
		}
		
		OrderTotal orderTotal = new OrderTotal("total", total);
		
		order.addTotal(orderTotal);
		
		return order;
	}
	
}