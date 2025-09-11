package first;

import java.util.Scanner;

public class Program_if_else {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int candidate1 = 0, candidate2 = 0, candidate3 = 0;

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            System.out.println("Choose your candidate:");
            System.out.println("1. Candidate A");
            System.out.println("2. Candidate B");
            System.out.println("3. Candidate C");

            int vote = sc.nextInt();

            if (vote == 1) {
                candidate1++;
            } else if (vote == 2) {
                candidate2++;
            } else if (vote == 3) {
                candidate3++;
            } else {
                System.out.println("Invalid choice.");
            }

            // Display vote counts
            System.out.println("Vote count:");
            System.out.println("Candidate A: " + candidate1);
            System.out.println("Candidate B: " + candidate2);
            System.out.println("Candidate C: " + candidate3);

        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
     }

   }