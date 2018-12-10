import java.util.Scanner;
public class Slope {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("x1: ");
        double x1 = in.nextDouble();
        System.out.print("y1: ");
        double y1 = in.nextDouble();
        System.out.print("x2: ");
        double x2 = in.nextDouble();
        System.out.print("y2: ");
        double y2 = in.nextDouble();

        double slope = (y2 - y1)/(x2 - x1);

        System.out.println("Slope is: " + slope);
    }
}