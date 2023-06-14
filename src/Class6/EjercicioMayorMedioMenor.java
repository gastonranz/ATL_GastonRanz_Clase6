package Class6;

import java.util.Scanner;

public class EjercicioMayorMedioMenor {
    public static void main(String[] args) {
        Integer num2 = 0;
        Integer num3 = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Let's calculate the biggest number among 3 numbers!");
        System.out.println("Type your first number:");
        Integer num1 = num.nextInt();
        Integer result = EjercicioMayorMedioMenor.validation(num1);

        if (result > 0) {
            System.out.println("Type your second number:");
            num2 = num.nextInt();
            result = EjercicioMayorMedioMenor.validation(num2);

            if (result > 0) {
                System.out.println("Type your third number:");
                num3 = num.nextInt();
                result = EjercicioMayorMedioMenor.validation(num3);
            }
        }

        if (result > 0) {
            EjercicioMayorMedioMenor.numOrden(num1, num2, num3);
            System.out.println("\n");
            EjercicioMayorMedioMenor.numOrden2(num1, num2, num3);
        }
    }

    private static Integer validation(Integer num) {
        Integer result = 0;
        if (num > 0) {
            result = num;
        } else if (num == 0) {
            System.out.println("Please, type a number bigger than \"0\"!");
        } else {
            System.out.println("Please, type a positive number!");
        }
        return result;
    }

    private static void numOrden(Integer num1, Integer num2, Integer num3) {
        Integer numMayor = num1;
        Integer numMedio = num1;
        Integer numMenor = num1;

        if (num2 > numMayor) {
            numMayor = num2;
        }
        if (num3 > numMayor) {
            numMayor = num3;
        }

        if (num2 < numMenor) {
            numMenor = num2;
        }
        if (num3 < numMenor) {
            numMenor = num3;
        }

        if (num2 > numMenor && num2 < numMayor) {
            numMedio = num2;
        }
        if (num3 > numMenor && num3 < numMayor) {
            numMedio = num3;
        }

        System.out.println("---- Your Biggest number is: " + numMayor + " ----\nYour Intermediate number is: " + numMedio + " ----\n---- Your Smaller number is: " + numMenor + " ----");
    }

    private static void numOrden2(Integer num1, Integer num2, Integer num3) {
        Integer input = 0;

        if (num3 < num2) {
            input = num3;
            num3 = num2;
            num2 = input;
        }
        if (num2 < num1) {
            input = num2;
            num2 = num1;
            num1 = input;
        }
        if (num3 < num2) {
            input = num3;
            num3 = num2;
            num2 = input;
        }

        System.out.println("\"Method 2\"\n---- Your Biggest number is: " + num3 + " ----\nYour Intermediate number is: " + num2 + " ----\n---- Your Smaller number is: " + num1 + " ----");
    }
}