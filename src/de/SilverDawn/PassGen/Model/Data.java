package de.SilverDawn.PassGen.Model;

public class Data {

    private char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private char[] special = "-_+*~#/()&%$§\"!".toCharArray();
    private char[] numbers = "0123456789".toCharArray();

    private char[][] data = {letters,capitals,special,numbers};

    // hier drüber nichts verändern !


}
