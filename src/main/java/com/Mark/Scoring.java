package com.Mark;

public class Scoring {
    public static void main(String[] args) {
        Student Ryan =new Student("Ryan",89,60);
/*      Ryan.name="Ryan";
        Ryan.english=89;
        Ryan.math=60;*/
        Ryan.print();
        Student Mark =new Student("Mark",90,85);
/*        Mark.name="Mark";
        Mark.english=90;
        Mark.math=85;*/
        Mark.print();
        GraduateStudent Jane=
                new GraduateStudent("Jane");
        Jane.print();
    }
}
