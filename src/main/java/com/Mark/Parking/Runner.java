package com.Mark.Parking;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String entertime = "8:27";
        String exitTime = "12:56";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date d = null;
        try {
            d=sdf.parse(entertime);
        }catch (Exception e){
            System.out.println("Wrong format");
        }
        System.out.println(d);
        System.out.println(d.getTime());
        long a = 3 * 60 * 60 * 1000;
        //Exception  vs Error
        //Exception handling
        try{
            Date d2= sdf.parse(exitTime);
            System.out.println(d2);
            System.out.println(d2.getTime());
            long ms=d2.getTime()-d.getTime();
            int minutes=(int)(ms/(1000*60));
     https://github.com/yenccc0/myproject2.git       int minutes= (int)(ms/(1000*60));
            System.out.println(minutes);
            int hours = (minutes+30)/60;
            System.out.println(30*hours);
        }catch (Exception e){
            System.out.println("Exit Wrong format");
        }
//       d2.setTime(d.getTime()+a);
    }
}


