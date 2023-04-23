public class Coordinates {
    String name;
    private double lang;
    private double lat;
    
    public Coordinates(String name, double lang, double lat) {
        this.name = name;
        this.lang = lang;
        this.lat = lat;
    }

    public Coordinates() {
        this.name = "Default";
        this.lang = 0;
        this.lat = 0;
    }

    public double getLang() {
        return lang;
    }
    public void setLang(double lang) {
        this.lang = lang;
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

}
