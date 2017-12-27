import java.util.*;

public class Order{
	private ArrayList<Product> products;
	public double total;
	private ArrayList<OrderTotal> orderTotals;
	
	public Order(){
		this.products = new ArrayList<Product>();
		this.total = 0;
		orderTotals = new ArrayList<OrderTotal>();
	}
	
	public void addProduct(Product product){
		this.products.add(product);
		this.total += product.getQuantity() * product.getPrice();
	}
	
	public ArrayList<Product> getProducts(){
		return this.products;
	}
	
	public double getTotal(){
		String output = "";
		//output += "order total " + this.total + "\n";
		//output += "==================================\n";
		for(OrderTotal orderTotal : orderTotals){
			output += orderTotal.toString() + "\n";
		}
		return this.total;
	}
	
	/*
	add a OrderTotal item to the order
	*/
	public void addTotal(OrderTotal orderTotal){
		this.orderTotals.add(orderTotal);
	}
	
	/*
	add a OrderTotal item to the order
	*/
	public ArrayList<OrderTotal> getOrderTotals(){
		return this.orderTotals;
	}
	
	public String toString(){
		String output = "total = " + Double.toString(this.total) + "\n";
		output = "====================================\n";
		for(OrderTotal orderTotal : this.orderTotals){
			output += orderTotal.toString() + "\n";
		}
		return output;
		
	}
}