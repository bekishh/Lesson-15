import java.util.Scanner;

public class Pentagon extends Shape {
    Scanner scanner = new Scanner(System.in);

    @Override
    public double getPerimeter() {
        int perimeter = 0;

        System.out.print("Write the length of side A: ");
        perimeter += scanner.nextInt();

        System.out.print("Write the length of side B: ");
        perimeter += scanner.nextInt();

        System.out.print("Write the length of side C: ");
        perimeter += scanner.nextInt();

        System.out.print("Write the length of side D: ");
        perimeter += scanner.nextInt();

        System.out.print("Write the length of side E: ");
        perimeter += scanner.nextInt();


        return perimeter;
    }
}
