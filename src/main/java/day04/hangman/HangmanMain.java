package day04.hangman;

import java.util.Scanner;

    public class HangmanMain {

        private String wordToFind = "alma";
        private String wordFound = "_".repeat(wordToFind.length());
        private int chances = wordToFind.length();

        public static void main(String[] args) {
            new HangmanMain().run();
        }

        private void run() {


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
