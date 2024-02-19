import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        double meter, miles, feet, inches;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter the measurement in meters: ");
            meter = in.nextDouble();
        }while(meter <= 0);

        miles = meter * 0.00062137;
        System.out.println(meter + " meter is " + miles + " mile");

        feet = meter * 3.28084;
        System.out.println(meter + " meter is " + feet + " feet");

        inches = meter * 39.26;
        System.out.println(meter + " meter is " + inches + " inches");
    }
}
