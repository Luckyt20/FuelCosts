import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    boolean b = true;
    do {
    Scanner scanner = new Scanner(System.in);
    System.out.println("amount of gas in the tank (in gallons): ");
    double gasInTank = scanner.nextDouble();
    System.out.println("fuel efficiency (in miles per gallon): ");
    double fuelEfficiency = scanner.nextDouble();
    System.out.println("price of gas (in dollars per gallon): ");
    double priceOfGas = scanner.nextDouble();

    double milesPerGallon = gasInTank * fuelEfficiency;
    double costPerMile = priceOfGas / fuelEfficiency;
        System.out.println("miles per gallon: " + milesPerGallon);
        System.out.println("cost per mile: " + costPerMile);
        System.out.println("Do you want to continue? (yes/no): ");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("no")) {
            b = false;
}


}while (b);
}
