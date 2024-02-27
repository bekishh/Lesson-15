import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangle triangle = new Triangle();
        Quadrilateral quadrilateral = new Quadrilateral();
        Pentagon pentagon = new Pentagon();
        Hexagon hexagon = new Hexagon();

        while (true) {
            System.out.print("""
                    \nThe perimeter of what shape do you want to get?
                    Периметр какой формы вы хотите получить?
                                    
                    1) Triangle (Треугольник)
                    2) Quadrilateral (Четырехугольник)
                    3) Pentagon (Пятиугольник)
                    4) Hexagon (Шестиугольник)
                                    
                    Your command:\s""");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    System.out.println("Triangle perimeter: " + triangle.getPerimeter());
                    break;
                case 2:
                    System.out.println("Quadrilateral perimeter: " + quadrilateral.getPerimeter());
                    break;
                case 3:
                    System.out.println("Pentagon perimeter: " + pentagon.getPerimeter());
                    break;
                case 4:
                    System.out.println("Hexagon perimeter: " + hexagon.getPerimeter());
                    break;
                default:
                    System.out.println("There is no such command!");
            }
        }

    }
}