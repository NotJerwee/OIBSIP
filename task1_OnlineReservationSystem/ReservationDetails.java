public class ReservationDetails{

    private String passengerName;
    private String origin;
    private String destination;
    private String pnrNumber;
    private int userId;

    public ReservationDetails(String passengerName, String origin, String destination, String pnrNumber, int userId) {
        this.passengerName = passengerName;
        this.origin = origin;
        this.destination = destination;
        this.pnrNumber = pnrNumber;
        this.userId = userId;   
    }
    public String getPassengerName() {
        return passengerName;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public int userId() {
        return userId;
    }

    public void setPassengarName() {
        this.passengerName = passengerName;
    }

    public void setOrigin() {
        this.origin = origin;
    }

    public void setDestination() {
        this.destination = destination;
    }

    public void setPnrNumber() {
        this.pnrNumber = pnrNumber;
    }
}
