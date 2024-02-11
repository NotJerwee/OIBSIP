public class ReservationDetails{

    private String passengerName;
    private String source;
    private String destination;
    private String pnrNumber;
    private int userId;

    public ReservationDetails(String passengerName, String source, String destination, String pnrNumber, int userId) {
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.pnrNumber = pnrNumber;
        this.userId = userId;   
    }
    public String getPassengerName() {
        return passengerName;
    }

    public String getSource() {
        return source;
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

    public void setSource() {
        this.source = source;
    }

    public void setDestination() {
        this.destination = destination;
    }

    public void setPnrNumber() {
        this.pnrNumber = pnrNumber;
    }
}
