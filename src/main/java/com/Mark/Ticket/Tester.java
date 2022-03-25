package com.Mark.Ticket;

import java.util.Scanner;

import static com.Mark.Ticket.Station.TAICHUNG_CITY;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(
                Station.TAIPEI_CITY,
                Station.KAOSIUNG_CITY
        );
//        System.out.println(ticket.start.name);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        int choice =Integer.parseInt(scanner.next());
        Station startStation = null;
        switch (choice){
            case 1:
                startStation = Station.TAIPEI_CITY;
            case 2:
                startStation = TAICHUNG_CITY;
            case 3:
                startStation = Station.KAOSIUNG_CITY;
                break;
        }
        System.out.println("Your end station? (Taipei: 1, Taichung: 2, Kaohsiung: 3)");
        choice =Integer.parseInt(scanner.next());
        Station endStation = null;
        switch (choice){
            case 1:
                endStation = Station.TAIPEI_CITY;
            case 2:
                endStation = Station.TAICHUNG_CITY;
            case 3:
                endStation = Station.KAOSIUNG_CITY;
                break;
        }
        System.out.println("Which type of tickets? (normal: n, student: s, elderly: e, Return: r )");
        choice =Integer.parseInt(scanner.next());




        System.out.println("How many tickets? ( one: 1 , two: 2 , three:3 ,)");




        //what type of ticket?
        //how many tickets?
        //loop?
    }
}
