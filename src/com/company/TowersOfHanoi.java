package com.company;

/**
 * Created by Yin on 1/22/2017.
 */
public class TowersOfHanoi {
    public void inst(int n, String s, String support, String e)
    {
        if (n == 1)
        {
            System.out.println("Move disk from " + s + " to " + e);
        }
        else
        {
            inst(n -1, s, e, support);
            System.out.println("Move disk from " + s + " to " + e);
            inst(n-1, support, s, e);
        }
    }
}
