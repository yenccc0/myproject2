package com.Mark.Score;

public class ScoringNG {
    public static void main(String[] args) {
        String[]name ={"Ryan","Dylan","Kevin","Mark","Zoe"};
        int english[]={89,75,99,62,94};
        int math[]={60,72,88,94,100};
        for (int i = 0; i < 4; i++) {
            System.out.println(name[i]+"\t"+english[i]+"\t"+math[i]+"\t"+(english[i]+math[i])/2);
        }
    }
}
