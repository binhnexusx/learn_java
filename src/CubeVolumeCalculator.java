import java.util.Scanner;
public class CubeVolumeCalculator {
    public static void main(String[] args) {
        Scanner binhdev = new Scanner(System.in);
        System.out.print("Enter the size of the cube: ");
        double size = binhdev.nextDouble();
        double CubeVolume = Math.pow(size, 3);
        System.out.println("The cube volume is " + CubeVolume);
    }
}
