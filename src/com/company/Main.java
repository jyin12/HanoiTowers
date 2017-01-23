package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner num = new Scanner(System.in);
        String ss;
        do
        {
            System.out.println("Enter number of disks");
            int ans = num.nextInt();
            TowersOfHanoi ab = new TowersOfHanoi();
            ab.inst(ans, "Start", "Middle", "End");
            System.out.println("\nDo you want to enter another one?");
            ss = num.next();
        }while(ss.equalsIgnoreCase("yes"));
    }
}
