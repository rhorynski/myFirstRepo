import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        double temp = input.nextDouble();
        System.out.print("Is it raining? yes(1) or no(0): ");
        double rain = input.nextDouble();
        System.out.print("Do you have umbrellas? yes(1) or (0): ");
        double umbrella = input.nextDouble();

        if ((temp > 40) || (temp < -20)) {
            System.out.println("Zostajemy w domu, zimno lub zbyt gorąco");
        }
        else if ((temp > -10 && temp < 10) && (rain == 1 && umbrella == 1)) {
            System.out.println("Temperatura miedzy -10 a 10, pada i ma parasolke to moze isc");
        }
        else if (rain == 0 && temp > 12) {
            System.out.println("Nie pada, temperatura powyzej 12 to moze isc");
        } else {
            System.out.println("Zostan w domu");
        }
    }
}