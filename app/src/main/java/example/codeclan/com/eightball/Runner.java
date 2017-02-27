package example.codeclan.com.eightball;

import java.util.Scanner;

/**
 * Created by user on 23/02/2017.
 */

public class Runner {

    public static void main(String[] args) {
        Answer response = new Answer();
        System.out.println("Enter in a question: ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        System.out.println();
        System.out.println(response.getAnswer());


    }

}
