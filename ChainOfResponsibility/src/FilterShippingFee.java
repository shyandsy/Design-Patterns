public class FilterShippingFee implements Filter{
	
	private final double SHIPPING_FEE = 12;
	
	public Order filter(Order order){
		
		OrderTotal orderTotal = new OrderTotal("tax", SHIPPING_FEE);
		
		order.addTotal(orderTotal);
		
		return order;
	
	}
	
}