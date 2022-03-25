package com.Mark.Customer;

import com.Mark.Customer.Customer;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    public int getReturnMoney() {
        return (int)(amount*0.1f);
    }

    @Override
    public void print() {
        System.out.println(id + "\t" + amount + " \t" + (amount-getOffMoney())+"("+getReturnMoney()+")");
    }
}
