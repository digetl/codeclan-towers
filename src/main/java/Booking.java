public class Booking {

    private int nights;
    private Bedroom bedroom;

    public Booking(int nights, Bedroom bedroom) {
        this.nights = nights;
        this.bedroom = bedroom;
    }

    public int getNights() {
        return nights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

}
