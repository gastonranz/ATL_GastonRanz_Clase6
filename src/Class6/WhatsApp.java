package Class6;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WhatsApp {
    public static void main(String[] args) throws IOException {
        InputStreamReader keyboardCapture = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(keyboardCapture);
        System.out.println("Let's contact someone on WhatsApp!\nYou just have to type the phone number you want to contact" +
                " without any symbols and space, just the complete number with its local code:");
        WhatsApp.calling(buffer.readLine());
    }

    private static void calling(String phoneNumber) {
        System.out.println("Great! now click on the link bellow:\nhttps://api.whatsapp.com/send?phone=" + phoneNumber);
    }
}
