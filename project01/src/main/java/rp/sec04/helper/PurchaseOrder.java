package rp.sec04.helper;

import courseUtil.Util;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class PurchaseOrder {

    private String item ;
    private String  price ;
    private int userId ;

    public PurchaseOrder(int userId)
    {
        this.userId = userId ;
        this.item= Util.faker().commerce().productName();
        this.price=Util.faker().commerce().price()  ;
    }
}
