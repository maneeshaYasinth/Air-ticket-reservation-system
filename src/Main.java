import java.util.Scanner;
import java.lang.String;

//       Classes:
//AirTicketReservationSystem:
//
//This class serves as the entry point for your application.
//Contains the main method where the program execution starts.
//        Flight:
//
//Represents a flight in the air ticket reservation system.


//        Attributes:
//flightNumber (String): The unique identifier for the flight.
//destination (String): The destination of the flight.
//        Constructor:
//Flight(String flightNumber, String destination): Initializes the flight with the provided flight number and destination.
//Passenger:
//
//Represents a passenger in the air ticket reservation system.
//        Attributes:
//name (String): The name of the passenger.
//passportNumber (String): The passport number of the passenger.
//Constructor:
//Passenger(String name, String passportNumber): Initializes the passenger with the provided name and passport number.
//Reservation:
//
//Represents a reservation in the air ticket reservation system.
//        Attributes:
//flight (Flight): The flight being reserved.
//passenger (Passenger): The passenger making the reservation.
//        Constructor:
//Reservation(Flight flight, Passenger passenger): Initializes the reservation with the provided flight and passenger.



//        Methods:
//book(): Simulates the booking logic and prints a message.
//Methods:
//AirTicketReservationSystem:
//
//main(String[] args): Entry point of the application.
//        Flight:
//
//Flight(String flightNumber, String destination): Constructor method.
//Passenger:
//
//Passenger(String name, String passportNumber): Constructor method.
//Reservation:
//
//Reservation(Flight flight, Passenger passenger): Constructor method.
//book(): Method simulating booking logic.
//Attributes:
//Flight:
//
//flightNumber (String): Attribute representing the flight number.
//destination (String): Attribute representing the destination.
//Passenger:
//
//name (String): Attribute representing the name of the passenger.
//passportNumber (String): Attribute representing the passport number of the passenger.
//Reservation:
//
//flight (Flight): Attribute representing the flight being reserved.
//passenger (Passenger): Attribute representing the passenger making the reservation.


// also can add ticket prices if needed



public class Main {
    public static void main(String[] args) {

        System.out.println("WELCOME! TO THE \"X\" AIR LINE");

        Scanner name = new Scanner(System.in);
        System.out.print("Enter your name:");
        String passenger = name.nextLine();

        Scanner honorific = new Scanner(System.in);
        System.out.println("What is your honorofics(Mr/Mrs/Ms):");
        String hono1 = honorific.nextLine();

        if(hono1.equals("Mrs")){
            System.out.println("WELCOME! TO THE \"X\" AIR LINE Mrs."+passenger);
        } else if (hono1.equals("Mr") ) {
            System.out.println("WELCOME! TO THE \"X\" AIR LINE Mr."+passenger);
        } else if (hono1.equals("Ms")) {
            System.out.println("WELCOME! TO THE \"X\" AIR LINE Ms."+passenger);
        }else {
            System.out.println("INVALID INPUT!!");
        }

    }
}

