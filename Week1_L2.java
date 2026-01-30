import java.util.Scanner;
public class Week1_L2 {

    //Problem 3
//    public static void main(String[] args) {
//        double width = 4.5;
//        double height = 7.9;
//
//        double area = width * height;
//        double perimeter = 2 * (width + height);
//
//        System.out.println("Width: " + width);
//        System.out.println("Height: " + height);
//        System.out.println("Area: " + area);
//        System.out.println("Perimeter: " + perimeter);
//
//    }

    //Problem 4
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.print("Enter the radius and length of a cylinder: ");
//    double radius = scanner.nextDouble();
//    double length = scanner.nextDouble();
//
//    double area = radius * radius * Math.PI;
//    double volume = area * length;
//
//    System.out.println("The area is " + area);
//    System.out.println("The volume is " + volume);
//
//    scanner.close();
//}

    //Problem 5
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
//        double side = scanner.nextDouble();
//        double height = scanner.nextDouble();
//
//        double area = (Math.sqrt(3) / 4) * side * side;
//        double volume = area * height;
//
//        System.out.println("The area is " + String.format("%.2f", area));
//        System.out.println("The volume of the Triangular prism is " + String.format("%.2f", volume));
//
//        scanner.close();
//    }

    //Problem 6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost of the meal: $");
        double mealCost = scanner.nextDouble();

        double taxRate = 0.085; // 8.5% local tax rate
        double tipRate = 0.18;  // 18% tip

        double taxAmount = mealCost * taxRate;
        double tipAmount = mealCost * tipRate;
        double grandTotal = mealCost + taxAmount + tipAmount;

        System.out.println("Meal Cost: $" + String.format("%.2f", mealCost));
        System.out.println("Tax Amount: $" + String.format("%.2f", taxAmount));
        System.out.println("Tip Amount: $" + String.format("%.2f", tipAmount));
        System.out.println("Grand Total: $" + String.format("%.2f", grandTotal));

        scanner.close();
    }

}