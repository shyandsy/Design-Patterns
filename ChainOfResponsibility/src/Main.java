public class Main{
	public static void main(String[] args){
		
		// create a order
		Order order = createOrder();

		// create filter manager
		FilterManager filterManager = new FilterManager();
		filterManager.addFilter(new FilterSubTotal());
		filterManager.addFilter(new FilterTax());
		filterManager.addFilter(new FilterShippingFee());
		filterManager.addFilter(new FilterCredit());
		filterManager.addFilter(new FilterTotal());
		
		// process the order
		filterManager.process(order);
		
		System.out.print(order);
	}
	
	public static Order createOrder(){
		Order order = new Order();
		
		Product apples = new Product("Apple", 10, 3);
		Product cakes = new Product("Cake", 5, 10);
		Product juice = new Product("Juice", 4, 5);
		
		order.addProduct(apples);
		order.addProduct(cakes);
		order.addProduct(juice);
		
		return order;
	}
}