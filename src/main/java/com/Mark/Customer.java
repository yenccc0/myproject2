package com.Mark;

public class Customer {
    String id;
    int amount;
    float off=0.1f;
    public Customer(String id, int amount ){
        this.id = id;
        this.amount=amount;
    }
    public void print(){
        float gone=(amount/1000)*off*1000;
        float money=amount-gone;
        System.out.println(id+"\t"+amount+"\t"+money);
    }
}
