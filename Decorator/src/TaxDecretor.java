/**
 * Created by shyandsy on 2017/12/30.
 */
public class TaxDecretor extends OrderTotalDecretor {

    private final double TAX_RATE = 0.13;

    public TaxDecretor(IOrderTotal ordertotal) {
        super(ordertotal);
    }

    @Override
    public void createOrderTotal() {
        super.createOrderTotal();

        Order order = this.getOrder();
        double subtotal = order.getTotal();
        OrderTotal orderTotal = new OrderTotal("Tax", subtotal * TAX_RATE);
        order.addTotal(orderTotal);
    }

}
