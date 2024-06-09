package rp.sec05.assignment;

import courseUtil.Util;

public class PurchaseOrder {

    private String item ;
    private double price ;
    private String category ;
    private int quantity ;

    public PurchaseOrder()
    {
        this.item= Util.faker().commerce().productName() ;
        this.price= Double.parseDouble(Util.faker().commerce().price()) ;
        this.category= Util.faker().commerce().department() ;
        this.quantity= Util.faker().random().nextInt(1,14);
    }

    public String getItem()
    {
        return this.item ;
    }

    public double getPrice()
    {
        return this.price ;
    }

    public String getCategory()
    {
        return this.category ;
    }

    public int getQuantity()
    {
        return this.quantity ;
    }
}
