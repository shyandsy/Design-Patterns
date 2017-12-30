/**
 * Created by shyandsy on 2017/12/30.
 */
import java.util.*;

public abstract class OrderTotalDecretor implements IOrderTotal {

    protected IOrderTotal ordertotal;

    public OrderTotalDecretor(IOrderTotal ordertotal){
        this.ordertotal = ordertotal;
    }

    @Override
    public Order getOrder(){
        return this.ordertotal.getOrder();
    }

    @Override
    public void createOrderTotal() {
        this.ordertotal.createOrderTotal();
    }

}
