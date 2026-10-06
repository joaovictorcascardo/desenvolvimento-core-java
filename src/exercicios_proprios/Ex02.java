package exercicios_proprios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] emails = new String[2];
        String regex = "\\w+@foursys\\.com\\.br";
        ArrayList<String> emailsValidos = new ArrayList<>();

        for (int i = 0; i < emails.length; i++) {
            emails[i] = sc.nextLine();
        }

        for (int i = 0; i < emails.length; i++) {
            if(emails[i].matches(regex)){
                emailsValidos.add(emails[i]);
            }
        }

    for (String email : emailsValidos) {
            if (email != null) {
                System.out.println(email);
            }
        }
    }

}
