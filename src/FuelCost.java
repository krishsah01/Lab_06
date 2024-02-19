import java.util.Scanner;
public class FuelCost {
    public static void main(String[] args)
    {
        double availableGas, gasPrice, mileage;
        Scanner in = new Scanner(System.in);
        boolean done = false;
        String trash = "";

        do {
            System.out.print("Enter the gas left in your tank (in Gallon): ");
            availableGas = in.nextFloat();
            in.nextLine();
        }while(availableGas<=0);
        do{
            System.out.print("What is your vehicles fuel efficiency per gallon? ");
                mileage = in.nextFloat();
                in.nextLine();
        }while(mileage<=0);
        do {
            System.out.print("Price of gas per gallon: ");
                gasPrice = in.nextFloat();
                in.nextLine();
        }while(gasPrice<=0);

        double costPer100miles = 100/mileage*gasPrice;
        System.out.println("Cost per 100 miles is " + costPer100miles);

        double distance = availableGas * mileage;
        System.out.println("Your car can go " + distance + " miles with the gas left in your tank.");

    }
}
