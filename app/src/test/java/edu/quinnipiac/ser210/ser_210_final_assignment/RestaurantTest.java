package edu.quinnipiac.ser210.ser_210_final_assignment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Kevin Couillard & Hephzibah Rajan
 * SER210 Final Assignment
 * Hamden Places Restaurant Class Test
 * 4/29/21
 */
public class RestaurantTest {

    private Restaurant example_restaurant;

    @Before
    public void setUp() throws Exception {
        example_restaurant = new Restaurant();
    }

    @Test
    public void getRestaurantId() {
        example_restaurant.setRestaurantId(0423);
        assertEquals(0423, example_restaurant.getRestaurantId(), 0);
    }

    @Test
    public void getRestaurantName() {
        example_restaurant.setRestaurantName("Mikro");
        assertEquals("Mikro", example_restaurant.getRestaurantName());
    }

    @Test
    public void getRestaurantLocation() {
        example_restaurant.setRestaurantLocation("275 Mount Carmel");
        assertEquals("275 Mount Carmel", example_restaurant.getRestaurantLocation());
    }

    @Test
    public void getRestaurantTiming() {
        example_restaurant.setRestaurantTiming("9:30 - 4:30");
        assertEquals("9:30 - 4:30", example_restaurant.getRestaurantTiming());
    }

    @Test
    public void getCuisineType() {
        example_restaurant.setCuisineType("Chinese");
        assertEquals("Chinese", example_restaurant.getCuisineType());
    }

    @Test
    public void getRestaurantRating() {
        example_restaurant.setRestaurantRating(4.5);
        assertEquals(4.5, example_restaurant.getRestaurantRating(), 0);
    }

    @Test
    public void getRestaurantImage() {

    }
}