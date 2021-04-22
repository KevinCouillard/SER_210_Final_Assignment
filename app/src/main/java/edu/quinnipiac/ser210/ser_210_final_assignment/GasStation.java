package edu.quinnipiac.ser210.ser_210_final_assignment;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class GasStation {
    private long id;
    private String name;
    private String location;
    private String timing;
    private String gasType;
    private double rating;
    private String image;

    public long getGasId() {return id;}

    public void setGasId(long id) {this.id = id;}

    public String getGasName() {return name;}

    public void setGasName(String name) {this.name = name;}

    public String getGasLocation() {return location;}

    public void setGasLocation(String location) {this.location = location;}

    public String getGasTiming() {return timing;}

    public void setGasTiming(String timing) {this.timing = timing;}

    public String getGasType() {return gasType;}

    public void setGasType(String gasType) {this.gasType = gasType;}

    public Double getGasRating() {return rating;}

    public void setGasRating(Double rating) {this.rating = rating;}

    public String getGasImage() {return image;}

    public void setGasImage(String image) {this.image = image;}

}
