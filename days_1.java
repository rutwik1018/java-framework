package com.company;
import java.util.*;
public class days_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int days, months,years,weeks;
        double hours,minute;

        System.out.println("eneter a days to covert int moths,years and hours: ");
        days=sc.nextInt();
        System.out.println("you entered days:  "+days);

        //convert
        years=days/365;
        months=days/30;
        weeks=days/7;
        hours=days*24;
        minute=days*1440;

        System.out.println(" i) years-> "+years+"\nii) months-> "+months+ "\niii) weeks-> "+weeks+"\niv) hours-> "+hours+"\nv) minutes-> "+minute );





    }
}
