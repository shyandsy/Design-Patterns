/**
 * Created by shyandsy on 2017/12/30.
 */
public class CreditDecretor extends OrderTotalDecretor {

    private final double ACCOUNT_BALANCE = 10;

    public CreditDecretor(IOrderTotal ordertotal) {
        super(ordertotal);
    }

    @Override
    public void createOrderTotal() {
        super.createOrderTotal();

        Order order = this.getOrder();
        double subtotal = order.getTotal();
        OrderTotal orderTotal = new OrderTotal("Credit", (-1) * ACCOUNT_BALANCE);
        order.addTotal(orderTotal);
    }

}
