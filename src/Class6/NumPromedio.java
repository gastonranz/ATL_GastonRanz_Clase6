package Class6;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class NumPromedio {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);

        System.out.println("Let's calculate the Average number!\nPlease, type your 1st number:");
        String strNum = buffer.readLine();
        Double num = Double.parseDouble(strNum);
        Double result = NumPromedio.validation(num);

        System.out.println("Please, type your 2nd number:");
        strNum = buffer.readLine();
        Double num2 = Double.parseDouble(strNum);
        Double result2 = NumPromedio.validation(num2);

        System.out.println("Please, type your 3rd number:");
        strNum = buffer.readLine();
        Double num3 = Double.parseDouble(strNum);
        Double result3 = NumPromedio.validation(num3);

        NumPromedio.calculoPromedio(result, result2, result3);
    }

    private static Double validation(Double num) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);

        while(num <= 0) {
            if(num == 0) {
                System.out.println("Please, type a number bigger than \"0\"!");
                String strNum = buffer.readLine();
                num = Double.parseDouble(strNum);
            } else {
                System.out.println("Please, type a positive number!");
                String strNum = buffer.readLine();
                num = Double.parseDouble(strNum);
            }
        }
        Double result = num;
        return result;
    }

    private static void calculoPromedio(Double num, Double num2, Double num3) {
        System.out.println("Your Average number is: " + ((num + num2 + num3) / 3) + "\nThank you!");
    }
}
