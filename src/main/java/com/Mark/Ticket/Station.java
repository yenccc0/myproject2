package com.Mark.Ticket;

public class Station {
    public static final Station TAIPEI_CITY=
            new Station(100,"Taipei");
    public static final Station TAICHUNG_CITY=
            new Station(200,"TAICHUNG");
    public static final Station KAOSIUNG_CITY=
            new Station(300,"KAOSIUNG");
    int id;
    String name;
    public Station(int id, String name){
        this.id = id;
        this.name = name;
    }
}
