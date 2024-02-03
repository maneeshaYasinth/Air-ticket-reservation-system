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
