public class Week5_Lab2 {
    //Problem 1
    // static class BoardingPass {
    //     private String seatNumber;
    //     private String gate;

    //     public BoardingPass(String seatNumber, String gate) {
    //         this.seatNumber = seatNumber;
    //         this.gate = gate;
    //     }

    //     @Override
    //     public String toString() {
    //         return "BoardingPass{" +
    //                 "seatNumber='" + seatNumber + '\'' +
    //                 ", gate='" + gate + '\'' +
    //                 '}';
    //     }

    //     public String getSeatNumber() {
    //         return seatNumber;
    //     }

    //     public String getGate() {
    //         return gate;
    //     }
    // }

    // static class Flight{
    //     private String flightId;
    //     private String destination;
    //     private BoardingPass boardingpass;

    //     public Flight(String flightId, String destination, String SeatNumber, String getGate){
    //         this.flightId = flightId;
    //         this.destination = destination;
    //         this.boardingpass = new BoardingPass(SeatNumber, getGate);
    //     }

    //     @Override
    //     public String toString() {
    //         return "Flight{" +
    //                 "flightId='" + flightId + '\'' +
    //                 ", destination='" + destination + '\'' +
    //                 ", boardingpass=" + boardingpass +
    //                 '}';
    //     }
    // }


    // // public static void main(String[] args) {
    // //     Flight flight1 = new Flight("AA123", "New York", "12A", "B5");
    // //     System.out.println(flight1);

    // //     Flight flight2 = new Flight("UA456", "Los Angeles", "5C", "A3");
    // //     System.out.println(flight2);
    // // }

    //Problem 2
//    static class SmartDevice{
//        private String brand;
//        private boolean isPowerOn;
//
//        public SmartDevice(String brand, boolean isPowerOn){
//            this.brand = brand;
//            this.isPowerOn = isPowerOn;
//        }
//
//        @Override
//        public String toString() {
//            return "SmartDevice{" +
//                "brand='" + brand + '\'' +
//                        ", isPowerOn=" + isPowerOn +
//                        '}';
//        }
//
//        public String getBrand(){
//            return brand;
//        }
//
//        public boolean getIsPowerOn(){
//            return isPowerOn;
//        }
//
//    }
//
//    static class Hub<T> {
//        private T device;
//
//        public void storeDevice(T item) {
//            this.device = item;
//        }
//
//        public T getDevice() {
//            return device;
//        }
//
//        public void statusReport() {
//            if (device != null) {
//                System.out.println("Hub contains: " + device);
//            } else {
//                System.out.println("Hub is empty");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SmartDevice device1 = new SmartDevice("Samsung", true);
//        SmartDevice device2 = new SmartDevice("LG", false);
//
//        Hub<SmartDevice> hub1 = new Hub<>();
//        hub1.storeDevice(device1);
//        hub1.statusReport();
//
//        Hub<SmartDevice> hub2 = new Hub<>();
//        hub2.storeDevice(device2);
//        hub2.statusReport();
//    }


    // Problem 3
    static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }

    static class Professor {
        private String name;

        public Professor(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Professor{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class LibrarySystem {
        public void checkout(Professor p, Book b) {
            System.out.println(p.getName() + " has checked out " + b.getTitle() + " for research.");
        }
    }

    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Smith");
        Book book1 = new Book("Java Programming", "John Doe");

        LibrarySystem library = new LibrarySystem();
        library.checkout(prof1, book1);

        Professor prof2 = new Professor("Dr. Johnson");
        Book book2 = new Book("Data Structures", "Jane Smith");
        library.checkout(prof2, book2);
    }

}