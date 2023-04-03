package JavaPrograms;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String [] args){

        Scanner S01 = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = S01.nextLine();
        System.out.println("Name is " + name);
        //String args value can be taken by edit cofig
        System.out.println(args[0]);
        S01.close();

    }
}