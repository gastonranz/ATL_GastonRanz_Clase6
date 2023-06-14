package Class6;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) throws IOException {
        PiedraPapelTijera.game();
    }

    private static void game() throws IOException {
        System.out.println("Let's play rock, paper or scissor!\nType your number selection:\n" +
                "1. Rock 🥌\n2. Paper 📄\n3. Scissor ✂");
        Integer num = PiedraPapelTijera.playerScanner();
        PiedraPapelTijera.playerValidation(num);
    }

    private static Integer playerScanner() throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        String strNum = buffer.readLine();
        return Integer.parseInt(strNum);
    }

    private static void playerValidation(Integer num) throws IOException {
        while(num <= 0 || num > 3) {
            if(num == 0 || num > 3) {
                System.out.println("Please, type a number between \"1\" & \"3\":");
                num = PiedraPapelTijera.playerScanner();
            } else {
                System.out.println("Please, type a positive number!:");
                num = PiedraPapelTijera.playerScanner();
            }
        }

        if(num == 1) {
            System.out.println("You've chosen \"Rock\" 🥌");
        } else if(num == 2) {
            System.out.println("You've chosen \"Paper\" 📄");
        } else {
            System.out.println("You've chosen \"Scissor\" ✂");
        }

        Integer computer = PiedraPapelTijera.computerSelection();
        PiedraPapelTijera.match(num, computer);
    }

    private static Integer computerSelection() {
        Float min = 1f;
        Float max = 3f;
        Integer num = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if(num == 1) {
            System.out.println("Computer has chosen \"Rock\" 🥌");
        } else if(num == 2) {
            System.out.println("Computer has chosen \"Paper\" 📄");
        } else {
            System.out.println("Computer has chosen \"Scissor\" ✂");
        }
        return num;
    }

    private static void match(Integer player, Integer computer) throws IOException {
        Integer playerLife = 5;
        Integer computerLife = 5;
        Integer num = 0;
        System.out.println("\nYou have " + playerLife + " lives.\nComputer has " + computerLife + " lives.");

        while(playerLife > 0 || computerLife > 0) {
            if((player == 1 && computer == 3) || (player == 2 && computer == 1) || (player == 3 && computer == 2)) {
                computerLife--;
                System.out.println("You win this battle! Congratulations! 🎉🙌\nYou have " + playerLife + " lives.\nComputer has " + computerLife + " lives.");
                System.out.println("Type again your selection:\n1. Rock 🥌\n2. Paper 📄\n3. Scissor ✂");
                player = PiedraPapelTijera.playerScanner();
                PiedraPapelTijera.playerValidation(player);
                computer = PiedraPapelTijera.computerSelection();
            } else if(player == computer) {
                System.out.println("It's a tie!");
                System.out.println("You have " + playerLife + " lives.\nComputer has " + computerLife + " lives.");
                System.out.println("Type again your selection:\n1. Rock 🥌\n2. Paper 📄\n3. Scissor ✂");
                player = PiedraPapelTijera.playerScanner();
                PiedraPapelTijera.playerValidation(player);
                computer = PiedraPapelTijera.computerSelection();
            } else {
                playerLife--;
                System.out.println("You lose this battle! Try again! 😢💔\nYou have " + playerLife + " lives.\nComputer has " + computerLife + " lives.");
                System.out.println("Type again your selection:\n1. Rock 🥌\n2. Paper 📄\n3. Scissor ✂");
                player = PiedraPapelTijera.playerScanner();
                PiedraPapelTijera.playerValidation(player);
                computer = PiedraPapelTijera.computerSelection();
            }
        }

        if(computerLife == 0) {
            System.out.println("You win this game!! 🎉🍾🎆 Congratulations!\nPress 1 to play again, 0 to quit:");
            num = PiedraPapelTijera.playerScanner();
            num = PiedraPapelTijera.gameValidation(num);

            if(num == 1) {
                PiedraPapelTijera.game();
            } else {
                System.out.println("Thank you for playing it!");
            }
        } else if(playerLife == 0) {
            System.out.println("You lose this game! Try Again!\nPress 1 to play again, 0 to quit:");
            num = PiedraPapelTijera.playerScanner();
            num = PiedraPapelTijera.gameValidation(num);

            if(num == 1) {
                System.out.println("Good look this time!");
                PiedraPapelTijera.game();
            } else {
                System.out.println("Thank you for playing it!");
            }
        }
    }

    private static Integer gameValidation(Integer num) throws IOException {
        while(num < 0 || num > 1) {
            System.out.println("Please, type 1 to play again, 0 to quit!:");
            num = PiedraPapelTijera.playerScanner();
        }
        return num;
    }
}
