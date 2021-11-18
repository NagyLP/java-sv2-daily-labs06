package day04.hangman;

import java.util.Scanner;

public class HangmanMain {

    private String wordToFind = "alma";
    private String wordFound = "_".repeat(wordToFind.length());
    private int chances = 8;

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Itt tartasz: " + wordFound);
            System.out.println("Ennyi tipp: " + chances);
            System.out.println("Mi a következő tipped?");

            String guess = scanner.next();

            if (wordToFind.contains(guess)) {
                wordFound = updateWordFound(wordToFind, wordFound, guess);
            } else {
                chances--;
            }

        } while (!wordToFind.equals(wordFound) && (chances > 0));

        if (wordFound.equals((wordToFind))) {
            System.out.println("Ügyes!");
        } else {
            System.out.println("Vesztettél.");
        }

//        String guess =
//            do {
//            System.out.println("Itt tartasz: " +wordFound);
//            System.out.println("Ennyi tipp: " +chances);
//            System.out.println("Mi a következő tipped?");
//
//
//
//        }

    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }
}
