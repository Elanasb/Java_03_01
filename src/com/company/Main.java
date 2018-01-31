package com.company;

import Uzdaviniai.LyginisNelyginis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Iveskite Skaiciu");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        LyginisNelyginis objektas = new LyginisNelyginis();

        objektas.setA(a);

        System.out.println("Skaicius: " + objektas.getA());
        objektas.skaiciuok();
    }
}
