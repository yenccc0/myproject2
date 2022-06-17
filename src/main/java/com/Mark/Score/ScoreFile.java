package com.Mark.Score;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScoreFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("scores.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line !=null){
                //System.out.println(line);
                //Jack,25,88
                String[] token = line.split(",");
                String name = token[0];
                int english = Integer.parseInt(token[1]);
                int math = Integer.parseInt(token[2]);
                Student stu = new Student(name, english, math);
                stu.print();
                line = reader.readLine();
            }

/*            int data = fileReader.read();
            while (data != -1) {
                System.out.println((char) data);
                data = fileReader.read();
            }*/
        } catch(FileNotFoundException ex){
                System.out.println("Loading fail");
        } catch(IOException e){
                System.out.println("Loading fail");
        }
        System.out.println("Continuing");
    }
}

