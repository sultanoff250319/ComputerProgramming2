import java.util.Scanner;

public class Week2_Lab2 {
    //Problem 1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double CAPPUCCINO_PRICE = 4.50;
//        double MUFFIN_PRICE = 3.00;
//        double TAX_RATE = 0.08;
//        double TIP = 5.00;
//
//        System.out.print("Enter quantity of cappuccinos:");
//        int cappuccinoQty = scanner.nextInt();
//
//        System.out.print("Enter quantity of muffins:");
//        int muffinquantity = scanner.nextInt();
//
//        double subtotal = (cappuccinoQty * CAPPUCCINO_PRICE) + (muffinquantity * MUFFIN_PRICE);
//        double tax = subtotal * TAX_RATE;
//        double GrandTotal = subtotal + tax + TIP;
//
//        System.out.printf("Grand Total: $%.2f%n", GrandTotal);
//
//        scanner.close();
//    }

    //Problem 2
//    public static void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the amount of distance in km: ");
//        double distance = scanner.nextDouble();
//
//        System.out.print("Enter the amount of fuel consumption per 100km: ");
//        double FuelConsumption = scanner.nextDouble();
//
//        System.out.print("Enter the price of fuel for litre: ");
//        double price = scanner.nextDouble();
//
//        double totalLiters = (distance / 100) * FuelConsumption;
//        double totalCost = totalLiters * price;
//
//        System.out.println("Distance: " + distance + "km");
//        System.out.printf("FuelNeeded: %.2f Liters%n", totalLiters);
//        System.out.printf("TotalCost: %.2f UZS%n", totalCost);
//
//        scanner.close();
//    }

    //Problem 3
//    public static void main(String[] args){
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter total seconds: ");
//        int totalSeconds = scanner.nextInt();
//
//        int hours = totalSeconds / 3600;
//        int minutes = (totalSeconds % 3600) / 60;
//        int seconds = totalSeconds % 60;
//
//        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
//
//        scanner.close();
//    }

    //Problem 4
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        int TicketPrice;
//
//        if (age >= 0 && age <= 12){
//            TicketPrice = 7;
//        } else if (age >= 13 && age <= 17){
//            TicketPrice = 10;
//        } else if (age >= 18 && age <= 64) {
//            TicketPrice = 15;
//        } else {
//            TicketPrice = 10;
//        }
//
//        System.out.println("Ticket Price: " + TicketPrice);
//
//        scanner.close();
//    }

    //Problem 5
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a year: ");
//        int year = scanner.nextInt();
//
//        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//
//        if (isLeapYear) {
//            System.out.println("LeapYear");
//        } else {
//            System.out.println("NotaLeapYear");
//        }
//
//        scanner.close();
//    }

    //Problem 6
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter package weight: ");
//        double weight = scanner.nextDouble();
//        double shipping = 0;
//        if (weight <= 2){
//            shipping = 5;
//        } else if (weight > 2 && weight<= 10){
//            shipping = 10;
//        } else if (weight>10){
//            shipping = 10 + (2*(weight-10));
//        }
//
//        System.out.printf("Shipping Cost : $%.2f%n", shipping);
//        scanner.close();
//    }

    //Problem 7
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the correct PIN: ");
//        int Correct = scanner.nextInt();
//        int attempts = 0;
//        int maxAttempts = 3;
//        boolean accessGranted = false;
//
//        while (attempts < maxAttempts){
//            System.out.print("Enter your PIN: ");
//            int userPIN = scanner.nextInt();
//
//            if (userPIN == Correct){
//                accessGranted = true;
//                System.out.println("Access Granted!");
//                break;
//            } else {
//                attempts ++;
//                if (attempts == maxAttempts){
//                    System.out.println("Access Locked!");
//                    break;
//                }
//                System.out.println("Incorrect PIN. Try again.");
//            }
//        }
//
//        scanner.close();
//    }

    //Problem 8
//    public static void main(String[] args){
//        int population = 100000;
//        int year = 0;
//
//        while (population < 200000) {
//            year++;
//            population = (int)(population * 1.05);
//            System.out.println("Year " + year + ": " + population);
//        }
//
//        System.out.println("It will take " + year + " years to double.");
//    }

    //Problem 9
//    public static void main (String[] args){
//        for (int i = 1; i <= 50; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.print("FizzBuzz, ");
//            } else if (i % 3 == 0) {
//                System.out.print("Fizz, ");
//            } else if (i % 5 == 0) {
//                System.out.print("Buzz, ");
//            } else {
//                System.out.print(i + ", ");
//            }
//        }
//    }

    //Problem 10
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int year = scanner.nextInt();
        double deposit = 1000;
        double interest = 0.05;
        double balance = deposit;
        for (int i = 1; i <= year; i++){
            balance = balance + (balance * interest);
            System.out.printf("Year%d: $%.2f%n", i, balance);
        }
        scanner.close();
    }
}
