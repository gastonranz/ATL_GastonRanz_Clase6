package Class6;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BuscadorPaises {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);

        BuscadorPaises.countries();
        String strNum = buffer.readLine();
        Integer num = Integer.parseInt(strNum);

        num = BuscadorPaises.countrySelection(num);

        while(num == 1) {
            BuscadorPaises.countries();
            strNum = buffer.readLine();
            num = Integer.parseInt(strNum);
            num = BuscadorPaises.countrySelection(num);
        }
    }

    private static void countries() {
        System.out.println("We're gonna find a map of a country around the world! Are your ready?\n" +
                "Let's choose your country:\nPress 1 to select Argentina\nPress 2 to select United States\n" +
                "Press 3 to select Brazil\nPress 4 to select Mexico\nPress 5 to select Chile\n" +
                "Press 6 to select Spain\nPress 7 to select Italy\nPress 8 to select Sweden\n" +
                "Press 9 to select Canada\nPress 10 to select France");
    }
    private static Integer countrySelection(Integer num) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);

        while (num > 10 || num == 0 || num < 0) {
            if (num > 10) {
                System.out.println("Please, type a number between 1 & 10!");
                String strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            } else if (num == 0) {
                System.out.println("Please, type a number bigger than \"0\"!");
                String strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            } else {
                System.out.println("Please, type a positive number!");
                String strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            }
        }

        if (num == 1)
            System.out.println("Here's your country \"Argentina\" on Google Maps! https://www.google.com/maps/search/Argentina");
        if (num == 2)
            System.out.println("Here's your country \"United States\" on Google Maps! https://www.google.com/maps/search/UnitedStates");
        if (num == 3)
            System.out.println("Here's your country \"Brazil\" on Google Maps! https://www.google.com/maps/search/Brazil");
        if (num == 4)
            System.out.println("Here's your country \"Mexico\" on Google Maps! https://www.google.com/maps/search/Mexico");
        if (num == 5)
            System.out.println("Here's your country \"Chile\" on Google Maps! https://www.google.com/maps/search/Chile");
        if (num == 6)
            System.out.println("Here's your country \"Spain\" on Google Maps! https://www.google.com/maps/search/Spain");
        if (num == 7)
            System.out.println("Here's your country \"Italy\" on Google Maps! https://www.google.com/maps/search/Italy");
        if (num == 8)
            System.out.println("Here's your country \"Sweden\" on Google Maps! https://www.google.com/maps/search/Sweden");
        if (num == 9)
            System.out.println("Here's your country \"Canada\" on Google Maps! https://www.google.com/maps/search/Canada");
        if (num == 10)
            System.out.println("Here's your country \"France\" on Google Maps! https://www.google.com/maps/search/France");

        System.out.println("Type 1 to get another country, 0 to quit:");
        String strNum = buffer.readLine();
        num = Integer.parseInt(strNum);

        while (num != 1 && num != 0) {
            if(num == 10) {
                System.out.println("C'mon! Don't type a number 10, type 1 to get another country, 0 to quit:");
                strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            } else {
                System.out.println("Please, type 1 to get another country, 0 to quit:");
                strNum = buffer.readLine();
                num = Integer.parseInt(strNum);
            }
        }
        return num;
    }
}
