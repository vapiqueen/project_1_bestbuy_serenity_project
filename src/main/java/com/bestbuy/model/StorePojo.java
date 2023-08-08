package com.bestbuy.model;

public class StorePojo {


    private String name;
    private String type;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private Double lat;
    private Double lng;
    private String hours;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public static class Services {
        private Services services;

        public Services getServices() {
            return services;
        }

        public void setServices(Services services) {
            this.services = services;
        }
    }
}
 /*   public static StorePojo getStorePojo( String name, String type, String address, String address2, String city, String state, String zip,int lat, int lng, String hours ){
StorePojo storePojo = new StorePojo();

storePojo.setName(name);
storePojo.setType(type);
storePojo.setAddress(address);
storePojo.setAddress2(address2);
storePojo.setCity(city);
storePojo.setState(state);
storePojo.setZip(zip);
storePojo.setLat(lat);
storePojo.setLng(lng);
storePojo.setHours(hours);
return storePojo;
    }
}*/
