/**
 * Created by shyandsy on 2017/12/30.
 */
public class ShippingFeeDecretor extends OrderTotalDecretor {

    private final double SHIPPING_FEE = 12;

    public ShippingFeeDecretor(IOrderTotal ordertotal) {
        super(ordertotal);
    }

    @Override
    public void createOrderTotal() {
        super.createOrderTotal();

        Order order = this.getOrder();
        double subtotal = order.getTotal();
        OrderTotal orderTotal = new OrderTotal("Shipping Fee", SHIPPING_FEE);
        order.addTotal(orderTotal);
    }

}
