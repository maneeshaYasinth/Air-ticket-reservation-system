import java.util.Random;

class ReservationNumberGenerator {
    public static String generateReservationNumber() {
        // Generate a random reservation number
        Random random = new Random();
        int randomInt = random.nextInt(1000000);
        return "R" + String.format("%06d", randomInt);
    }
}
