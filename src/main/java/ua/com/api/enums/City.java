package ua.com.api.enums;

public enum City {
    KYIV("Kyiv", "UA");

    private final String city;
    private final String coutryCode;

    City(String city, String coutryCode) {

        this.city = city;
        this.coutryCode = coutryCode;
    }

    public String getCity() {
        return city;
    }

    public String getCoutryCode() {
        return coutryCode;
    }
}