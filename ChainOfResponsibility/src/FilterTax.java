public class FilterTax implements Filter{
	private final double TAX_RATE = 0.13;
	
	public void filter(Order order){
		
		double total = order.getTotal();
		
		OrderTotal orderTotal = new OrderTotal("tax", total * TAX_RATE);
		
		order.addTotal(orderTotal);

	}
	
}