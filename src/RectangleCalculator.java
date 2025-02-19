import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height of the rectangle: ");
        int height = input.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = input.nextInt();

        input.close();

        int area = calculateArea(height, width);
        int perimeter = calculatePerimeter(height, width);
        int minSide = findSmallestSide(height, width);

        System.out.println("\n=== Rectangle Information ===");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Smallest side: " + minSide);

        if (height == width) {
            System.out.println("This is a square!");
        }
    }
//@Make method
    public static int calculateArea(int height, int width) {
        return height * width;
    }

    public static int calculatePerimeter(int height, int width) {
        return 2 * (height + width);
    }

    public static int findSmallestSide(int height, int width) {
        return Math.min(height, width);
    }
}
