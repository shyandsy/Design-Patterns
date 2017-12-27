public class FilterSubTotal implements Filter{
	
	public void filter(Order order){
		
		double total = order.getTotal();
		
		OrderTotal orderTotal = new OrderTotal("sub-total", total);

		order.addTotal(orderTotal);

	}
	
}