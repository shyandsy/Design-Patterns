import java.util.*;

public class OrderTotal{
	private String name;
	public double total;
	
	public OrderTotal(String name, double total){
		this.name = name;
		this.total = total;
	}
	
	public double getTotal(){
		return this.total;
	}
	
	public String toString(){
		String output = "";
		output += String.format("%-20s", this.name);
		output += "\t" + this.total;
		return output;
	}
}