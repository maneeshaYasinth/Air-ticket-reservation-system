import java.util.Scanner;

class Inputs {
    String answer;
    String passenger;
    String hono1;

    void nameInput() {
        Scanner nameScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        passenger = nameScanner.nextLine();
    }

    void honoInput() {
        Scanner honorificScanner = new Scanner(System.in);
        System.out.print("What is your honorifics (Mr/Mrs/Ms):");
        hono1 = honorificScanner.nextLine();
    }

    void bookingStatus() {
        Scanner choice = new Scanner(System.in);
        System.out.print("Have you booked your flight(yes or No): ");
        answer = choice.nextLine();
    }
}
