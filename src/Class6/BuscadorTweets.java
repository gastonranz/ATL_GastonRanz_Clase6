package Class6;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BuscadorTweets {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        System.out.println("Let's find you favorite celebrity on their Tweeter account!\nType their celebrity name like this (KimWilde):");
        String celebrityName = buffer.readLine();

        BuscadorTweets.celebrity(celebrityName);
    }

    private static void celebrity(String celebrityName) {
        System.out.println("Here's your celebrity Tweeter!\nhttps://twitter.com/search?q=" + celebrityName);
    }
}