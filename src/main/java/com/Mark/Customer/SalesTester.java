package com.Mark.Customer;

import com.Mark.Customer.Customer;
import com.Mark.Customer.GoldenCustomer;
import com.Mark.Customer.SilverCustomer;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("0001",1200));
        customers.add(new Customer("0002",800));
        customers.add(new SilverCustomer("0003",1200));
        customers.add(new Customer("0004",2000));
        customers.add(new GoldenCustomer("0005",1800));
        customers.add(new PlatinumCustomer("0006",2300));
        for (int i = 0; i < 6; i++) {
            customers.get(i).print();
        }
        for(Customer c :customers){
            c.print();
        }








        /*Customer c1= new Customer("0001",1200);
        SilverCustomer c2= new SilverCustomer("0002",1200);
        GoldenCustomer c3= new GoldenCustomer("0003",2300);
        PlatinumCustomer c4 = new PlatinumCustomer("0005",2100);
        c1.print();
        //0001 1200 1100
        c2.print();
        c3.print();
        c4.print();*/
    }
}
