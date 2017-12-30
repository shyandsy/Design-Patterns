/**
 * Created by shyandsy on 2017/12/30.
 */
public class Main {
    public static void main(String[] args){

        Order order = createOrder();

        IOrderTotal ordertotal1 = new ConcreteOrderTotal(order);
        IOrderTotal ordertotal2 = new SubTotalDecretor(ordertotal1);
        IOrderTotal ordertotal3 = new TaxDecretor(ordertotal2);
        IOrderTotal ordertotal4 = new ShippingFeeDecretor(ordertotal3);
        IOrderTotal ordertotal5 = new CreditDecretor(ordertotal4);
        IOrderTotal ordertotal6 = new TotalDecretor(ordertotal5);

        ordertotal6.createOrderTotal();

        System.out.println(ordertotal6.getOrder());
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
