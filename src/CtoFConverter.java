import java.util.Scanner;
public class CtoFConverter
{
    public static void main(String[] args)
    {
        double tempC;
        double tempF;
        String trash;
        boolean done = false;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Enter the Temp in C");

            if(in.hasNextDouble()){
                tempC = in.nextInt();
                in.nextLine();
                tempF = tempC*9/5 + 32;
                System.out.print(tempC + " in degree farenhiet is " + tempF);
                done = true;
            }
            else {
                trash = in.nextLine();
                System.out.println(trash + " is an invalid input!");
                System.out.println("Please Try again!");
            }
        }while(!done);
    }
}