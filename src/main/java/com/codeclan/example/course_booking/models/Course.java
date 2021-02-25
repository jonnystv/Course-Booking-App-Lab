package com.codeclan.example.course_booking.models;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private Long id;
    private String name;
    private String town;
    private int rating;
    private List<Booking> bookings;

    public Course(String name, String town, int rating) {
        this.name = name;
        this.town = town;
        this.rating = rating;
        this.bookings = new ArrayList<Booking>;
    }

    public Long getCourseId() {
        return id;
    }

    public void setCourseId(Long id) {
        this.id = id;
    }

    public String getCourseName() {
        return name;
    }

    public void setCourseName(String name) {
        this.name = name;
    }

    public String getCourseTown() {
        return town;
    }

    public void setCourseTown(String town) {
        this.town = town;
    }

    public int getCourseRating() {
        return rating;
    }

    public void setCourseRating(int rating) {
        this.rating = rating;
    }

    public List<Booking> getCourseBookings() {
        return bookings;
    }

    public void setCourseBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }
}
