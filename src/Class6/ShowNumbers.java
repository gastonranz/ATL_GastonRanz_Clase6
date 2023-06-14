package Class6;

import java.util.Scanner;

public class ShowNumbers {
    public static void main(String[] args) {
        System.out.println("Let's show you the numbers from 1 to 100.");
        System.out.println("Pres 1 to go ahead, 0 to quit:");
        Integer num = new Scanner(System.in).nextInt();

        num = ShowNumbers.validation(num);
        ShowNumbers.numbers(num);
    }

    private static Integer validation(Integer num) {
        while(num < 0 || num > 1) {
            if(num > 1) {
                System.out.println("Please, type 1 to go ahead, 0 to quit:");
                num = new Scanner(System.in).nextInt();
            } else {
                System.out.println("Please, type a positive number!");
                num = new Scanner(System.in).nextInt();
            }
        }
        Integer result = num;
        return result;
    }

    private static void numbers(Integer num) {
        Integer i = 0;
        Integer recorrido = 0;
        Integer[] numbers = new Integer[100];
        if(num == 1) {
            System.out.println("Your number form 1 to 100 are:");
            while(i < numbers.length) {
                System.out.println(numbers[i] = recorrido + i);
                i++;
            }
        } else {
            System.out.println("Thank you!");
        }
    }
}
