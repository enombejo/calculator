package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        String str = scan.nextLine();
        System.out.println("Output:");
        Parser parser = new Parser(str);
        System.out.println(parser.getResult().getOutput());
    }
}
