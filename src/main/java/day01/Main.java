package day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

        Scanner sc = new Scanner(System.in);
        double userNumber;

        while (((userNumber = sc.nextDouble()) > 0)) {
            positiveNumberContainer.addNumber(userNumber);
        }
        System.out.println(positiveNumberContainer.getNumbers());
    }
}

//        if (userNumber == 0) {
//            positiveNumberContainer.addNumber(userNumber);
//            userNumber = sc.nextDouble();
//        } else if (userNumber > 0) {
//            positiveNumberContainer.addNumber(userNumber);
//            userNumber = sc.nextDouble();
//        } else {
////        }
//    }
//}
