package edu.quinnipiac.ser210.ser_210_final_assignment;
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Park Class
 * 4/29/21
 */
public class Park {
    //Simple class for Park object including getters & setters for column values
    private long id;
    private String name;
    private String location;
    private String timing;
    private String attractions;
    private double rating;
    private String image;

    public long getParkId() {return id;}

    public void setParkId(long id) {this.id = id;}

    public String getParkName() {return name;}

    public void setParkName(String name) {this.name = name;}

    public String getParkLocation() {return location;}

    public void setParkLocation(String location) {this.location = location;}

    public String getParkTiming() {return timing;}

    public void setParkTiming(String timing) {this.timing = timing;}

    public String getAttractions() {return attractions;}

    public void setAttractions(String attraction) {this.attractions = attraction;}

    public Double getParkRating() {return rating;}

    public void setParkRating(Double rating) {this.rating = rating;}

    public String getParkImage() {return image;}

    public void setParkImage(String image) {this.image = image;}

}
