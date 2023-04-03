package JavaPrograms;

import java.util.Scanner;

public class MathDemo01 {
    public static void main(String[] args) {
        Scanner S01 = new Scanner(System.in);
        double x, y , z;
        double result = 0;
        System.out.println("Please enter x, y , z values");
        x = S01.nextDouble();
        y = S01.nextDouble();
        z = S01.nextDouble();
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);
        S01.close();
    }
}
