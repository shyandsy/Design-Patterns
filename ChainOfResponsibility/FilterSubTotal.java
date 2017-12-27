public class FilterSubTotal implements Filter{
	
	public Order filter(Order order){
		
		double total = order.getTotal();
		
		OrderTotal orderTotal = new OrderTotal("sub-total", total);

		order.addTotal(orderTotal);
		
		return order;
	}
	
}