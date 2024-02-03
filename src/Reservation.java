class Reservation {
    final String reservationNumber;
    final String reserveName;

    public Reservation(String passName, String passNumber) {
        this.reserveName = passName;
        this.reservationNumber = passNumber;
    }

    public String getReservationNumber() {
        return reservationNumber;
    }
}
