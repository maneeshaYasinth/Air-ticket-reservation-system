import java.util.Random;

class ReservationNumberGenerator extends Reservation {
    public ReservationNumberGenerator(String passName, String passNumber) {
        super(passName, passNumber);
    }

    public static String generateReservationNumber() {
        // Generate a random reservation number
        Random random = new Random();
        int randomInt = random.nextInt(1000000);
        return "R" + String.format("%06d", randomInt);
    }
}
