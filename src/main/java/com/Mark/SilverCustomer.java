package com.Mark;

public class SilverCustomer extends Customer {
    int returnmoney;
    SilverCustomer(String id, int cost) {
        super(id,cost);
        this.returnmoney=returnmoney;
    }
    public int getreturnmoney(){
        return (int)(cost*0.1f);
    }

    @Override
    public void print(){
        System.out.print(id+"\t"+ cost +"\t"+getreturnmoney());
    }
}
