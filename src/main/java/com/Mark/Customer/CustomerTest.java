package com.Mark.Customer;

public class CustomerTest {

    public class Customer {
        String id;
        int cost;
        public Customer(String id, int amount) {
            this.id = id;
            this.cost = cost;
        }
        public int getDiscount(){
            return cost-(cost/1000)*100;
        }
        public void print() {
            System.out.print(id+"\t"+cost+"\t"+getDiscount());
        }
    }
}
