package com.Mark.Score;

import com.Mark.Score.Student;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name,int english,
                           int math, int thesis){
        super(name, english, math);
        this.thesis = thesis;
    }
    public GraduateStudent(String name){
        super(name);
//        this.name=name;
    }
    @Override
    public void print(){
        System.out.println(name+"\t"+english+"\t"+math+"\t"+thesis);
    }
    public void test(){

    }
}
