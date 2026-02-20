//Problem 1

// public class LibraryBook {
//     private String bookTitle;
//     private String author;
//     private int pages;

//     public LibraryBook() {
//         this.bookTitle = "Unknown";
//         this.author = "Unknown";
//         this.pages = 1;
//     }


//     public LibraryBook(String bookTitle, String author, int pages) {
//         this.bookTitle = bookTitle;
//         this.author = author;
//         this.pages = pages;
//     }


//     public String getBookTitle() {
//         return bookTitle;
//     }


//     public void setBookTitle(String bookTitle) {
//         this.bookTitle = bookTitle;
//     }


//     public String getAuthor() {
//         return author;
//     }


//     public void setAuthor(String author) {
//         this.author = author;
//     }


//     public int getPages() {
//         return pages;
//     }


//     public void setPages(int pages) {
//         if (pages > 0) {
//             this.pages = pages;
//         }
//     }


//     public boolean isThick() {
//         return pages > 500;
//     }


//     public String toString() {
//         return "Title: " + bookTitle + ", Author: " + author + ", Pages: " + pages;
//     }
// }

//Problem 2

// class Sensor {
//     private String location;
//     private double reading;

//     public Sensor(String location, double reading) {
//         this.location = location;
//         if (reading < -50.0 || reading > 50.0) {
//             this.reading = 0.0;
//         } else {
//             this.reading = reading;
//         }
//     }

//     public String getLocation() {
//         return location;
//     }

//     public void setLocation(String location) {
//         this.location = location;
//     }

//     public double getReading() {
//         return reading;
//     }

//     public void setReading(double reading) {
//         if (reading < -50.0 || reading > 50.0) {
//             this.reading = 0.0;
//         } else {
//             this.reading = reading;
//         }
//     }

//     public String toString() {
//         return "Location: " + location + ", Reading: " + reading + "°C";
//     }
// }

// public class TemperatureSensorTest {
//     public static void main(String[] args) {
//         Sensor[] sensors = new Sensor[5];

//         String[] locations = {"Room A", "Room B", "Room C", "Room D", "Room E"};

//         for (int i = 0; i < 5; i++) {
//             double randomReading = Math.random() * 100 - 50;
//             sensors[i] = new Sensor(locations[i], randomReading);
//         }

//         System.out.println("Sensor Readings:");
//         for (int i = 0; i < 5; i++) {
//             System.out.println(sensors[i]);
//         }

//         double sum = 0;
//         for (int i = 0; i < 5; i++) {
//             sum += sensors[i].getReading();
//         }
//         double average = sum / 5;

//         System.out.println("\nAverage Temperature: " + average + "°C");
//     }
// }

// //Problem 3
// class StepCounter {
//     private static int totalStepsAllUsers = 0;
//     private int individualSteps;

//     public void walk(int steps) {
//         this.individualSteps += steps;
//         this.totalStepsAllUsers += steps;
//     }

//     public int getIndividualSteps() {
//         return individualSteps;
//     }

//     public static int getTotalStepsAllUsers() {
//         return totalStepsAllUsers;
//     }

//     public static void resetGlobalSteps() {
//         totalStepsAllUsers = 0;
//     }
// }

// public class StepCounterTest {
//     public static void main(String[] args) {
//         StepCounter userA = new StepCounter();
//         StepCounter userB = new StepCounter();

//         userA.walk(150);
//         System.out.println("User A steps: " + userA.getIndividualSteps());
//         System.out.println("Global total: " + StepCounter.getTotalStepsAllUsers());
//         System.out.println();

//         userB.walk(200);
//         System.out.println("User B steps: " + userB.getIndividualSteps());
//         System.out.println("Global total: " + StepCounter.getTotalStepsAllUsers());
//         System.out.println();

//         userA.walk(75);
//         System.out.println("User A steps: " + userA.getIndividualSteps());
//         System.out.println("Global total: " + StepCounter.getTotalStepsAllUsers());
//         System.out.println();

//         userB.walk(100);
//         System.out.println("User B steps: " + userB.getIndividualSteps());
//         System.out.println("Global total: " + StepCounter.getTotalStepsAllUsers());
//         System.out.println();
//         StepCounter.resetGlobalSteps();
//         System.out.println("User A steps: " + userA.getIndividualSteps());
//         System.out.println("User B steps: " + userB.getIndividualSteps());
//         System.out.println("Global total: " + StepCounter.getTotalStepsAllUsers());
//     }
// }

//Problem 4

class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

class MathTool {
    public static long factorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class Week4_Lab2 {
    public static void main(String[] args) {
        int iterations = 1000000;
        int n = 20;


        StopWatch stopWatchRecursive = new StopWatch();
        stopWatchRecursive.start();
        for (int i = 0; i < iterations; i++) {
            MathTool.factorialRecursive(n);
        }
        stopWatchRecursive.stop();
        long recursiveTime = stopWatchRecursive.getElapsedTime();


        StopWatch stopWatchIterative = new StopWatch();
        stopWatchIterative.start();
        for (int i = 0; i < iterations; i++) {
            MathTool.factorialIterative(n);
        }
        stopWatchIterative.stop();
        long iterativeTime = stopWatchIterative.getElapsedTime();


        System.out.println("Calculating factorial of " + n + " " + iterations + " times:");
        System.out.println("Recursive Method: " + recursiveTime + " ms");
        System.out.println("Iterative Method: " + iterativeTime + " ms");
        System.out.println("Difference: " + Math.abs(recursiveTime - iterativeTime) + " ms");
    }
}





