/**
 * Created by shyandsy on 2017/12/30.
 */
public class ConcreteOrderTotal implements IOrderTotal {

    protected Order order;

    public ConcreteOrderTotal(Order order){
        this.order = order;
    }

    @Override
    public Order getOrder(){
        return this.order;
    }

    @Override
    public void createOrderTotal() {
        return;
    }

}
