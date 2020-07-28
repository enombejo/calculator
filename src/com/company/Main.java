package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input:");
        String str = scan.nextLine();
        System.out.println("Output:");
        Parser parser = new Parser(str);
        //System.out.println(parser.getResult().getOutputArabic());
        System.out.println(parser.getResult().getOutput());
//        String regex = "[IVX]{1,4}\\s*[\\+\\-\\*/]{1}\\s*[IVX]{1,4}";
//        Pattern pattern = Pattern.compile("[0-9]{1,2}\\s*[\\+\\-\\*/]{1}\\s*[0-9]{1,2}");
//        Matcher matcher = pattern.matcher(str.trim());
//        System.out.println(matcher.matches());
//        System.out.println(Pattern.matches(regex, str));
    }
}
