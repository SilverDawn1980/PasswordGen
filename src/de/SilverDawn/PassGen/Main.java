package de.SilverDawn.PassGen;

public class Main {

    public static void main(String[] args) {

        String myPassword = Generator.getNewPassword();
        System.out.println("Ihr Passwort ist " + myPassword);

    }

}
