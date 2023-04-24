public class Coordinates {
    String name;
    private double lon;
    private double lat;
    
    public Coordinates(String name, double lon, double lat) {
        this.name = name;
        this.lon = lon;
        this.lat = lat;
    }

    public Coordinates() {
        this.name = "Default";
        this.lon = 0;
        this.lat = 0;
    }

    public double getLon() {
        return lon;
    }
    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + " Longitude: " + lon + " Latitude: " + lat;
    }



}
