package edu.quinnipiac.ser210.ser_210_final_assignment;
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Restaurant Class
 * 4/29/21
 */
public class Restaurant {
    //Simple class for Restaurant object including getters & setters for column values
    private long id;
    private String name;
    private String location;
    private String timing;
    private String cuisineType;
    private double rating;
    private String image;

    public long getRestaurantId() {return id;}

    public void setRestaurantId(long id) {this.id = id;}

    public String getRestaurantName() {return name;}

    public void setRestaurantName(String name) {this.name = name;}

    public String getRestaurantLocation() {return location;}

    public void setRestaurantLocation(String location) {this.location = location;}

    public String getRestaurantTiming() {return timing;}

    public void setRestaurantTiming(String timing) {this.timing = timing;}

    public String getCuisineType() {return cuisineType;}

    public void setCuisineType(String cuisineType) {this.cuisineType = cuisineType;}

    public Double getRestaurantRating() {return rating;}

    public void setRestaurantRating(Double rating) {this.rating = rating;}

    public String getRestaurantImage() {return image;}

    public void setRestaurantImage(String image) {this.image = image;}

}