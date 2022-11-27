package ZadaniaDlaPoczatkujacychDom;

import java.util.Scanner;

public class Excercise49 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Give me a number: ");
    Integer a = input.nextInt();

        if (a%2 == 0)
    {
        System.out.println(1);
    } else
            System.out.println(0);
    }
}
