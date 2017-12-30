import java.util.ArrayList;

/**
 * Created by shyandsy on 2017/12/30.
 */
public class TotalDecretor extends OrderTotalDecretor {

    public TotalDecretor(IOrderTotal ordertotal) {
        super(ordertotal);
    }

    @Override
    public void createOrderTotal() {
        super.createOrderTotal();

        Order order = this.getOrder();
        ArrayList<OrderTotal> ordertotals = order.getOrderTotals();
        double total = 0;

        for(OrderTotal orderTotal : order.getOrderTotals()){
            total += orderTotal.getTotal();
        }

        OrderTotal orderTotal = new OrderTotal("total", total);

        order.addTotal(orderTotal);
    }

}
