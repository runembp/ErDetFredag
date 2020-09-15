package com.example.erdetfredag.services;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ErDetFredag
{
    public ErDetFredag()
    {
    }

    public boolean fredag()
    {
        LocalDateTime currentDate = LocalDateTime.now();

        int q = currentDate.getDayOfMonth();
        int m = currentDate.getMonthValue();
        int j = currentDate.getYear() / 100;
        int k = currentDate.getYear() % 100;

        int h = (q + ((13/m+1)/5) + k + (k/4) + (j/4) - (2*j)) % 7;

        int d = ((h + 5)%7)+1;

        if(d == 5)
            return true;
        else
            return false;

    }

    public double hvilkenDag()
    {
        LocalDateTime currentDate = LocalDateTime.now();

        int q = currentDate.getDayOfMonth();
        int m = currentDate.getMonthValue();
        int j = currentDate.getYear() / 100;
        int k = currentDate.getYear() % 100;

        double floorM = Math.floor(13*(m+1))/5;
        double floorK = Math.floor(k/4);
        double floorJ = Math.floor(j/4);

        System.out.println("floorM: " + floorM);
        System.out.println("floorK: " + floorK);
        System.out.println("floorJ: " + floorJ);

        double h = (q + floorM + k + floorK + floorJ - (2*j) ) % 7;

        double d = ((h + 5)%7)+1;

        System.out.println("Day of month:" + q);
        System.out.println("Month: " + m);
        System.out.println("Century: " + j);
        System.out.println("Year of Century: " + k);


        return ((h + 5)%7)+1;

    }
}
