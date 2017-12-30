/**
 * Created by shyandsy on 2017/12/30.
 */
public class SubTotalDecretor extends OrderTotalDecretor {

    public SubTotalDecretor(IOrderTotal ordertotal) {
        super(ordertotal);
    }

    @Override
    public void createOrderTotal() {
        super.createOrderTotal();

        Order order = this.getOrder();
        double subtotal = order.getTotal();
        OrderTotal orderTotal = new OrderTotal("Sub-Total", subtotal);
        order.addTotal(orderTotal);
    }
}
