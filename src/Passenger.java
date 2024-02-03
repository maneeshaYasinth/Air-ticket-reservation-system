import java.util.Scanner;

class Passenger {
    final String name;
    final String passportNumber;
    final String honorof;

    public Passenger(String passengerName, String passengerPassportNumber, String honoro) {
        this.name = passengerName;
        this.passportNumber = passengerPassportNumber;
        this.honorof = honoro;
    }

    static String checkBook(String userResponse) {
        if (userResponse.equalsIgnoreCase("yes")) {
            Scanner input = new Scanner(System.in);
            System.out.println("Can you enter your reservation number: ");
            return input.nextLine();
        } else {
            return ReservationNumberGenerator.generateReservationNumber();
        }
    }

    void nameOut() {
        switch (honorof) {
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
