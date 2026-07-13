import vehicle.Car;

import java.util.Scanner;

import static java.lang.Integer.*;
import static java.lang.System.*;

public class Main {


    public static void Should_Calculate_Gap_TO_Preferred_Age(int age, int preferredAge) {

        int gap = preferredAge - age;

        if (age < preferredAge) {

            out.println("You have " + gap + " more years to DEATH💀 ");

        } else if (age > preferredAge) {

            out.println("You've been DEAD💀 for " + Math.abs(gap) + " years");

        } else {

            out.println("Wish you have a great LAST Year <3");
        }

    }

    public static void main(String... args) {

        for (int i = 0; i < args.length; i++) {

            out.println(args[i]);
        }


        String model = args[0];
        String engine = args[1];
        String gearBox = args[2];

        Car car = new Car(model, engine, gearBox);

        if (car.isItOn) {
            out.println(car.model + " is on");
        } else {
            out.println(car.model + " is off");
        }


        Scanner scanner = new Scanner(in);

        String confirmation = "No";

        String continuing = "Yes";

        while (continuing.equalsIgnoreCase("Yes")) {


            while (confirmation.equalsIgnoreCase("No")) {


                out.println("What's your name?");
                String name = scanner.nextLine();

                out.println("Hello " + name);

                out.println("Where are you from?");
                String country = scanner.nextLine();


                out.println("How old are you?");
                int age = parseInt(scanner.nextLine());

                out.println("How many years do you want to live?");
                int preferredAge = parseInt(scanner.nextLine());

                out.println("Damn Dude!");
                Should_Calculate_Gap_TO_Preferred_Age(age, preferredAge);


                out.println("So," + name + "!");
                out.println("You're " + age + " and you're from " + country);

                out.println("Do you confirm? [Yes/No]");
                confirmation = scanner.nextLine();

                int i = 1;

                while (!confirmation.equalsIgnoreCase("Yes") && !confirmation.equalsIgnoreCase("No")) {

                    out.println("Do you confirm? [Yes/No]");
                    out.print("(AutoBreak " + "(" + i + "/3))");
                    confirmation = scanner.nextLine();

                    i++;
                    if (i == 3)
                        break;
                }




            }

            out.println("Do you wanna continue?[Yes/No]");
            continuing = scanner.nextLine();



            int c = 1;

            while (!continuing.equalsIgnoreCase("Yes") && !continuing.equalsIgnoreCase("No")) {

                out.println("Do you wanna continue?");
                out.print("(AutoBreak " + "(" + c + "/3))");
                continuing = scanner.nextLine();


                c++;
                if (c == 3) {
                    out.println("You broke the limit");
                    break;
                }
            }

            if (continuing.equalsIgnoreCase("Yes")) {
                confirmation = "No";
            }


        }

        out.println("Finish");
    }
}
