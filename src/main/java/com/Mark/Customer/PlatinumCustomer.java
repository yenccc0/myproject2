package com.Mark.Customer;

import com.Mark.Customer.Customer;

public class PlatinumCustomer extends GoldenCustomer{
    public PlatinumCustomer(String id, int amount) {super(id, amount);}

    @Override
    public int getReturnMoney() {
        return (int) (amount*0.2f);
    }

    @Override
    public float getOffMoney() {
        return  (int)(amount*0.3f);
    }
/*    public void print() {
        System.out.print(id + "\t" + amount + "\t" + (amount-getOffMoney())+"("+getReturnMoney()+")");
    }*/
}
