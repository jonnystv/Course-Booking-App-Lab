package com.codeclan.example.course_booking.models;

import java.util.List;

public class Customer {

    private Long id;
    private String name;
    private String town;
    private int age;
    private List<Booking> bookings;

    public Customer(String name, String town, int age) {
        this.name = name;
        this.town = town;
        this.age = age;
    }

    public Long getCustomerId() {
        return id;
    }

    public void setCustomerId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return name;
    }

    public void setCustomerName(String name) {
        this.name = name;
    }

    public String getCustomerTown() {
        return town;
    }

    public void setCustomerTown(String town) {
        this.town = town;
    }

    public int getCustomerAge() {
        return age;
    }

    public void setCustomerAge(int age) {
        this.age = age;
    }

    public List<Booking> getCustomerBookings() {
        return bookings;
    }

    public void setCustomerBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }
}
