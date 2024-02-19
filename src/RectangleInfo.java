import java.math.MathContext;
import java.util.Scanner;
import java.lang.Math;
public class RectangleInfo {
    public static void main(String[] args) {
        double width, height, area, perimeter, diagonal;

        Scanner in = new Scanner(System.in);


        do {
            System.out.println("enter the height of rectangle: ");
            height = in.nextDouble();
        }while(height <=0);

        do {
            System.out.println("enter the width of rectangle: ");
            width = in.nextDouble();
        }while(width <=0);

        area = height * width;
        System.out.println("Area of the rectangle is " + area);

        perimeter = 2*(height + width);
        System.out.println("Perimeter of the rectangle is " + perimeter);

        diagonal = Math.sqrt(Math.pow(height,2) + Math.pow(width,2));
        System.out.println("The lenght of diagonal is " + diagonal);
    }
}
