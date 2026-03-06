
    //Project 1
//    static class Person {
//        private String name;
//        private String ID;
//        private int age;
//
//        public Person(String name, String ID, int age) {
//            this.name = name;
//            this.ID = ID;
//            this.age = age;
//        }
//
//        public void displayInfo() {
//            System.out.println("Name: " + name + ", ID: " + ID + ", Age: " + age);
//        }
//
//        public String getName() { return name; }
//        public String getID() { return ID; }
//        public int getAge() { return age; }
//    }
//
//    static class Librarian extends Person {
//        public Librarian(String name, String ID, int age) {
//            super(name, ID, age);
//        }
//
//        public void addBook(String bookTitle) {
//            System.out.println(getName() + " added book: " + bookTitle);
//        }
//
//        public void removeBook(String bookTitle) {
//            System.out.println(getName() + " removed book: " + bookTitle);
//        }
//
//        public void issueBook(String memberName, String bookTitle) {
//            System.out.println(getName() + " issued '" + bookTitle + "' to " + memberName);
//        }
//    }
//
//    static class Member extends Person {
//        private int borrowedBooksCount = 0;
//
//        public Member(String name, String ID, int age) {
//            super(name, ID, age);
//        }
//
//        public void borrowBook(String bookTitle) {
//            borrowedBooksCount++;
//            System.out.println(getName() + " borrowed: " + bookTitle);
//        }
//
//        public void returnBook(String bookTitle) {
//            if (borrowedBooksCount > 0) {
//                borrowedBooksCount--;
//                System.out.println(getName() + " returned: " + bookTitle);
//            }
//        }
//
//        public void viewBorrowedBooks() {
//            System.out.println(getName() + " has " + borrowedBooksCount + " borrowed book(s)");
//        }
//    }
//
//    static class Guest extends Person {
//        public Guest(String name, String ID, int age) {
//            super(name, ID, age);
//        }
//
//        public void viewCatalog() {
//            System.out.println(getName() + " is browsing the catalog");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("=== Library Management System ===\n");
//
//        Librarian librarian = new Librarian("Anvar", "LIB001", 35);
//        Member member = new Member("Sarvar", "MEM001", 28);
//        Guest guest = new Guest("Akbar", "GUEST001", 22);
//
//        System.out.println("--- Librarian ---");
//        librarian.displayInfo();
//        librarian.addBook("Java Programming");
//        librarian.issueBook("Sarvar", "Java Programming");
//        System.out.println();
//
//        System.out.println("--- Member ---");
//        member.displayInfo();
//        member.borrowBook("Java Programming");
//        member.viewBorrowedBooks();
//        member.returnBook("Java Programming");
//        member.viewBorrowedBooks();
//        System.out.println();
//
//        System.out.println("--- Guest ---");
//        guest.displayInfo();
//        guest.viewCatalog();
//    }

    //Project 2
//    static class Employee {
//        private String name;
//        private String employeeID;
//        private double salary;
//
//        public Employee(String name, String employeeID, double salary) {
//            this.name = name;
//            this.employeeID = employeeID;
//            this.salary = salary;
//        }
//
//        public void displayInfo() {
//            System.out.println("Name: " + name + ", Employee ID: " + employeeID + ", Salary: $" + salary);
//        }
//
//        public String getName() { return name; }
//        public String getEmployeeID() { return employeeID; }
//        public double getSalary() { return salary; }
//    }
//
//    static class Manager extends Employee {
//        public Manager(String name, String employeeID, double salary) {
//            super(name, employeeID, salary);
//        }
//
//        public void assignTask(String taskName, String assignee) {
//            System.out.println(getName() + " assigned task '" + taskName + "' to " + assignee);
//        }
//
//        public void approveLeave(String employeeName, int days) {
//            System.out.println(getName() + " approved " + days + " days leave for " + employeeName);
//        }
//    }
//
//    static class Developer extends Employee {
//        public Developer(String name, String employeeID, double salary) {
//            super(name, employeeID, salary);
//        }
//
//        public void writeCode(String projectName) {
//            System.out.println(getName() + " is writing code for " + projectName);
//        }
//
//        public void fixBug(String bugID) {
//            System.out.println(getName() + " fixed bug #" + bugID);
//        }
//    }
//
//    static class Intern extends Employee {
//        public Intern(String name, String employeeID, double salary) {
//            super(name, employeeID, salary);
//        }
//
//        public void attendTraining(String trainingName) {
//            System.out.println(getName() + " is attending " + trainingName);
//        }
//
//        public void submitReport(String reportName) {
//            System.out.println(getName() + " submitted report: " + reportName);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("=== Employee Management System ===\n");
//
//        Manager manager = new Manager("Anvar", "EMP001", 75000);
//        Developer developer = new Developer("Sarvar", "EMP002", 65000);
//        Intern intern = new Intern("Akbar", "EMP003", 25000);
//
//        System.out.println("--- Manager ---");
//        manager.displayInfo();
//        manager.assignTask("Database Design", "Sarvar");
//        manager.approveLeave("Sarvar", 5);
//        System.out.println();
//
//        System.out.println("--- Developer ---");
//        developer.displayInfo();
//        developer.writeCode("E-Commerce Platform");
//        developer.fixBug("BUG-2024-001");
//        System.out.println();
//
//        System.out.println("--- Intern ---");
//        intern.displayInfo();
//        intern.attendTraining("Java Fundamentals");
//        intern.submitReport("Weekly Progress Report");
//    }

    //Project 3

    class Product {
        protected String productID;
        protected String name;
        protected double price;

        public Product(String productID, String name, double price) {
            this.productID = productID;
            this.name = name;
            this.price = price;
        }

        public void displayProductDetails() {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + name);
            System.out.println("Price: $" + price);
        }
    }


    class Electronics extends Product {
        private String warranty;
        private String brand;

        public Electronics(String productID, String name, double price, String warranty, String brand) {
            super(productID, name, price);
            this.warranty = warranty;
            this.brand = brand;
        }

        public void getWarrantyDetails() {
            System.out.println("Warranty: " + warranty);
            System.out.println("Brand: " + brand);
        }

        @Override
        public void displayProductDetails() {
            super.displayProductDetails();
            getWarrantyDetails();
        }
    }


    class Clothing extends Product {
        private String size;
        private String color;

        public Clothing(String productID, String name, double price, String size, String color) {
            super(productID, name, price);
            this.size = size;
            this.color = color;
        }

        public void checkSizeAvailability() {
            System.out.println("Size: " + size);
            System.out.println("Color: " + color);
        }

        @Override
        public void displayProductDetails() {
            super.displayProductDetails();
            checkSizeAvailability();
        }
    }


    class Book extends Product {
        private String author;
        private String ISBN;

        public Book(String productID, String name, double price, String author, String ISBN) {
            super(productID, name, price);
            this.author = author;
            this.ISBN = ISBN;
        }

        public void getAuthorInfo() {
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }

        @Override
        public void displayProductDetails() {
            super.displayProductDetails();
            getAuthorInfo();
        }
    }


    public class week6_Lab1 {
        public static void main(String[] args) {
            Electronics laptop = new Electronics("E001", "Laptop", 999.99, "2 years", "Dell");
            Clothing shirt = new Clothing("C001", "T-Shirt", 29.99, "Large", "Blue");
            Book book = new Book("B001", "Java Programming", 49.99, "John Doe", "978-3-16-148410-0");

            System.out.println("=== Electronics ===");
            laptop.displayProductDetails();

            System.out.println("\n=== Clothing ===");
            shirt.displayProductDetails();

            System.out.println("\n=== Book ===");
            book.displayProductDetails();
        }
    }

