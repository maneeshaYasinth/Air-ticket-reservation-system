import java.util.Random;
import java.util.Scanner;

/*
 AirTicketReservationSystem Class:
 - Entry point for the application.
 - Contains the main method where program execution starts.

 Flight Class:
 - Represents a flight in the air ticket reservation system.

 Attributes:
 - flightNumber (String): Unique identifier for the flight.
 - destination (String): Destination of the flight.

 Constructor:
 - Flight(String flightNumber, String destination): Initializes the flight.

 Passenger Class:
 - Represents a passenger in the air ticket reservation system.

 Attributes:
 - name (String): Name of the passenger.
 - passportNumber (String): Passport number of the passenger.

 Constructor:
 - Passenger(String name, String passportNumber): Initializes the passenger.

 Reservation Class:
 - Represents a reservation in the air ticket reservation system.

 Attributes:
 - flight (Flight): Flight being reserved.
 - passenger (Passenger): Passenger making the reservation.

 Constructor:
 - Reservation(Flight flight, Passenger passenger): Initializes the reservation.

 Methods:
 - book(): Simulates the booking logic and prints a message.

 Methods:
 AirTicketReservationSystem Class:
 - main(String[] args): Entry point of the application.

 Flight Class:
 - Constructor method: Flight(String flightNumber, String destination).

 Passenger Class:
 - Constructor method: Passenger(String name, String passportNumber).

 Reservation Class:-
 Constructor method: Reservation(Flight flight, Passenger passenger).
 - book(): Method simulating booking logic.

 Attributes:
 Flight Class:
 - flightNumber (String): Attribute representing the flight number.
 - destination (String): Attribute representing the destination.

 Passenger Class:
 - name (String): Attribute representing the name of the passenger.
 - passportNumber (String): Attribute representing the passport number.

 Reservation Class:
 - flight (Flight): Attribute representing the flight being reserved.
 - passenger (Passenger): Attribute representing the passenger making the reservation.*/



// also can add ticket prices if needed



class Flight {
    final String flightNumber;
    final String destination;
    final String departure;

    public Flight(String flightNumber, String destination, String departure) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;

        System.out.println("Your flight number is: " + this.flightNumber);
    }

    void myDestination() {
        System.out.println("Your flight destination is : " + this.destination);
    }

    void myDeparture() {
        System.out.println("Your departure is : " + this.departure);
    }
}

class Passenger {
    final String name;
    final String passportNumber;
    final String honorof;

    public Passenger(String passengerName, String passengerPassportNumber, String honoro) {
        this.name = passengerName;
        this.passportNumber = passengerPassportNumber;
        this.honorof = honoro;
    }

    static String  checkBook(){
        Scanner passportNumberScanner = new Scanner(System.in);
        System.out.print("Enter your passport Number: ");
        String passengerPassport = passportNumberScanner.nextLine();

       return  passengerPassport;
    }

    void nameOut(String reservationNumber) {


        switch (honorof){
            case "Mr":
                System.out.println("WELCOME! TO THE \"X\" AIR LINE Mr." + this.name);
                break;
            case "Mrs":
                System.out.println("WELCOME! TO THE \"X\" AIR LINE Mrs." + this.name);
                break;
            case "Ms":
                System.out.println("WELCOME! TO THE \"X\" AIR LINE Ms." + this.name);
                break;
            default:
                System.out.println("INVALID INPUT!!");
                break;
        }

    }
}

class ReservationNumberGenerator {
    public static String generateReservationNumber() {
        // Generate a random reservation number
        Random random = new Random();
        int randomInt = random.nextInt(1000000);
        return "R" + String.format("%06d", randomInt);
    }
}

class Reservation {
    final String reservationNumber;
    final String reserveName;
    private String reserveNumber;

    public Reservation(String passName, String passNumber) {
        this.reserveName = passName;
        this.reservationNumber =ReservationNumberGenerator.generateReservationNumber();
    }
    public String getReservationNumber() {
        return reservationNumber;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t   ***             ***");
        System.out.println("\t\t\t     ***         ***");
        System.out.println("\t\t\t       ***     ***");
        System.out.println("\t\t\t          ** ** ");
        System.out.println("\t\t\t       ***     ***");
        System.out.println("\t\t\t     ***         ***");
        System.out.println("\t\t\t   ***             ***");

        System.out.println();
        System.out.println();

        System.out.println("WELCOME! TO THE \"X\" AIR LINE");

        try (Scanner nameScanner = new Scanner(System.in);
             Scanner honorificScanner = new Scanner(System.in))
              {

            System.out.print("Enter your name: ");
            String passenger = nameScanner.nextLine();

            System.out.print("What is your honorifics (Mr/Mrs/Ms):");
            String hono1 = honorificScanner.nextLine();




            Scanner choice = new Scanner(System.in);
            System.out.print("Have you booked your flight(yes or No): ");
            String answer = choice.nextLine();




            //calling passenger class
            Passenger passenger1 = new Passenger(passenger, Passenger.checkBook(), hono1);

            //calling flight class
            Flight flight = new Flight("ABC123", "CMB: Sri Lanka", "changi: Singapore");

            //calling reservation class
            Reservation reserv1 = new Reservation(passenger, Passenger.checkBook());

            if (answer.equals("yes") || answer.equals("YES")){
                passenger1.checkBook();
            }else {

                Scanner input = new Scanner(System.in);
                System.out.println("Can you enter your reservation number: ");
                String inputReserveNumb = input.nextLine();
                passenger1.nameOut(inputReserveNumb);
            }




            flight.myDestination();
            flight.myDeparture();



            System.out.println("Your reservation number is: " + reserv1.getReservationNumber());
        }
    }
}