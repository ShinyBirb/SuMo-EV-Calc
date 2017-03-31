package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner EV1 = new Scanner(System.in);
        Scanner EV2 = new Scanner(System.in);

        System.out.println("What is the first stat you would like to max? ");
        String firstStat = EV1.nextLine();

        System.out.println("What is the second stat you would like to max? ");
        String secondStat = EV2.nextLine();

        System.out.println(firstStat + ", " + secondStat);
    }
}
