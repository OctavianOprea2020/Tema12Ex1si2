import java.util.Scanner;

import static java.lang.Math.abs;

public class BirthYear {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BirthYearCalculator bYC = new BirthYearCalculator();
        int age = 0;
        boolean ask = false;
        int birthYear = 0;

        do {
            try {
                ask = false;
                System.out.print("Please input your age: ");
                age = scanner.nextInt();
                birthYear = bYC.getBirthYear(age);
                System.out.println("Your birth year is " + (birthYear < 0 ? abs(birthYear) + " B.C." : birthYear));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                ask = true;
            }
        } while (ask);
    }
}
