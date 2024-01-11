import java.util.Scanner;
import java.lang.String;

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
    private String flightNumber;
    private String destination;
    private String departure;

    public Flight(String flightNumber, String destination, String departure) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;

        System.out.println("Your flight number is: " + this.flightNumber);
    }

     void myDestination (){
        System.out.println("Your flight destinatiion is : "+this.destination);
    }

    void myDeparture(){
        System.out.println("My departure is : "+this.departure);
    }
}

class Passenger{
    private  String name;
    private  String passportNumber;
    private String honorof;

    public Passenger(String passengerName, String passengerPassportNumber,String honoro) {
        this.name = passengerName;
        this.passportNumber = passengerPassportNumber;
        this.honorof=honoro;
            }

        void nameOut(){
            if (this.honorof.equals("Mr")) {
                System.out.println("WELCOME! TO THE \"X\" AIR LINE Mr." + this.name);
            } else if (this.honorof.equals("Mrs")) {
                System.out.println("WELCOME! TO THE \"X\" AIR LINE Mrs." + this.name);
            } else if (this.honorof.equals("Ms")) {
                System.out.println("WELCOME! TO THE \"X\" AIR LINE Ms." + this.name);
            } else {
                System.out.println("INVALID INPUT!!");
            }
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

        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name:");
        String passenger = name.nextLine();

        Scanner honorific = new Scanner(System.in);
        System.out.println("What is your honorifics (Mr/Mrs/Ms):");
        String hono1 = honorific.nextLine();

        Scanner passportNumber = new Scanner(System.in);
        System.out.print("Enter your passport Number:");
        String passengerPassport = name.nextLine();



        Passenger passenger1 = new Passenger(passenger, passengerPassport,hono1);
        passenger1.nameOut();

        Flight flight = new Flight("ABC123", "CMB: Sri Lanka", "changi: Singapore");
        flight.myDestination();
        flight.myDeparture();


    }
}

