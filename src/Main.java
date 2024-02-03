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



import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Entrence et1 = new Entrence();
        et1.displayEntry();
        Inputs inputs = new Inputs();
        //inputs.displayEntry();

        // Get user inputs
        inputs.nameInput();
        inputs.honoInput();
        inputs.bookingStatus();

        // Now you can use the input values
        String answer = inputs.answer;
        String passenger = inputs.passenger;
        String hono1 = inputs.hono1;


        // calling passenger class
        String reservationNumber = Passenger.checkBook(answer);
        Passenger passenger1 = new Passenger(passenger, reservationNumber, hono1);
        passenger1.nameOut();
        // calling flight class
        Flight flight = new Flight("ABC123", "CMB: Sri Lanka", "changi: Singapore");

        // calling reservation class
        Reservation reserv1 = new Reservation(passenger, reservationNumber);

        flight.myDestination();
        flight.myDeparture();

        System.out.println("Your reservation number is: " + reserv1.getReservationNumber());
    }
}
