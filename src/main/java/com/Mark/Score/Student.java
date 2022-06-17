package com.Mark.Score;

public class Student {
    String name;
        int english;
        int math;
        public Student (String name){//Constructor
                this.name=name;
        }
        public  Student(String name,int english,int math){//Default Construcotr
                this(name);
//              this.name =name;
                this.english=english;
                this.math=math;
        }
        public void print() {
                int average = (english+math)/2;
                System.out.println(name + "\t" + english +
                        "\t" + math + "\t" + (english+math)/2);
                if (average<60){
                        System.out.print("*");
                }
                System.out.println();
        }
}
