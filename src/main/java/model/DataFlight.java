package model;

public class DataFlight {

    private String cityOrigin;
    private String cityDestination;
    private String typeFlight;
    private String dateOrigin;
    private String warningMessage;

    public String getWarningMessage() {
        return warningMessage;
    }

    public String getCityOrigin() {
        return cityOrigin;
    }

    public void setCityOrigin(String cityOrigin) {
        this.cityOrigin = cityOrigin;
    }

    public String getCityDestination() {
        return cityDestination;
    }

    public void setCityDestination(String cityDestination) {
        this.cityDestination = cityDestination;
    }

    public String getTypeFlight() {
        return typeFlight;
    }

    public void setTypeFlight(String typeFlight) {
        this.typeFlight = typeFlight;
    }

    public String getDateOrigin() {
        return dateOrigin;
    }

    public void setDateOrigin(String dateOrigin) {
        this.dateOrigin = dateOrigin;
    }
}
