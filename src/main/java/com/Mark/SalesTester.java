package com.Mark;

public class SalesTester {
    public static void main(String[] args) {
        Customer c1= new Customer("0001",1200);
        SilverCustomer c2= new SilverCustomer("0002",800);
        GoldenCustomer c3= new GoldenCustomer("0003",2000);
        c1.print();
        //0001 1200 1100
        c2.print();
        c3.print();
    }
}
