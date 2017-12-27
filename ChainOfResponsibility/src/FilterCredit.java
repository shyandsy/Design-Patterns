public class FilterCredit implements Filter{
	
	private final double ACCOUNT_BALANCE = 10;
	
	public Order filter(Order order){
		double total = order.getTotal();
		
		OrderTotal orderTotal = new OrderTotal("credit", (-1) * ACCOUNT_BALANCE);
		
		order.addTotal(orderTotal);
		
		return order;
	}
	
}