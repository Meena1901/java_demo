package com.example.salaryCalculationPagkage;

import java.util.*;

public class salaryCalculation
{
    Scanner get = new Scanner(System.in);
    float salary, base, hra, spal, net, gross ;
    //Calculate special allowance
    public float spalCalculation(float base)
    {
        spal = (float) ( 0.5*base);
        return spal;
    }
    public float hraCalculation(float base){
        hra =(float) (0.10*base);
        return hra;
    }
    public float gross(float base){
        gross = (base + spal + hra);
        return gross;
    }
    public float net(float base){
        net = gross;
        return net;
    }
}	
