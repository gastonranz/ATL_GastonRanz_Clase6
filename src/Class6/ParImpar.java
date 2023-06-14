package Class6;

import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        System.out.println("Let's calculate if a number is odd or even?\nPlease, type a number:");
        Double num = new Scanner(System.in).nextDouble();

        ParImpar.access(num);
    }

    private static void access(Double num) {
        Double result = (double)0;
        Double modulo = num % 2;

        while(num < 0 || num == 0) {
            if(num < 0) {
                System.out.println("Try to type a positive number!");
                num = new Scanner(System.in).nextDouble();
            } else {
                System.out.println("Try to type a bigger number than \"0\"!");
                num = new Scanner(System.in).nextDouble();
            }
        }

        if(modulo == 0) {
            System.out.println("---- Your number is ODD! Congratulations! ----");
        } else if(modulo != 0) {
            System.out.println("---- Your number is EVEN! Congratulations! ----");
        }
    }
}
