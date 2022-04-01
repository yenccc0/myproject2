package com.Mark.Customer;

import com.Mark.Customer.Customer;

public class GoldenCustomer extends SilverCustomer {
    public GoldenCustomer(String id,int cost){
        super(id, cost);
    }
    public int getReturnMoney(){
        return  (int)(amount*0.1f);
    }

    @Override
    public float getOffMoney() {
        return (int)(amount*0.1f);
    }
    /*public void print(){
        System.out.println(id + "\t" + amount + "\t" + (amount-getReturnMoney())+"("+getReturnMoney()+")");
    }*/
}
