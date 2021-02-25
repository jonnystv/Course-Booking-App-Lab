package com.codeclan.example.course_booking.models;

public class Booking {

    private Long id;
    private String date;
    private Customer customer;
    private Course course;

    public Booking(String date, Customer customer, Course course) {
        this.date = date;
        this.customer = customer;
        this.course = course;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookingDate() {
        return date;
    }

    public void setBookingDate(String date) {
        this.date = date;
    }

    public Customer getBookingCustomer() {
        return customer;
    }

    public void setBookingCustomer(Customer customer) {
        this.customer = customer;
    }

    public Course getBookingCourse() {
        return course;
    }

    public void setBookingCourse(Course course) {
        this.course = course;
    }
}
