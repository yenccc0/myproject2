package com.Mark;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;
public class Scoring {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
            list.add(new Student("Ryan",89,60));
            list.add(new Student("Mark",90,85));
            list.add(new GraduateStudent("Jane",100,80,80));

    }
}
