package day02.numbers;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number) {
        int akkumlator = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                akkumlator += i;
            }
        }
        return akkumlator == number;
    }
}