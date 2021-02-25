package com.codeclan.example.course_booking.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="bookings")
public class Booking {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "date")
    private String date;

    @ManyToOne
    @JoinColumn (name = "customer_id", nullable = false)
    @JsonIgnoreProperties ({"bookings"})
    private Customer customer;

    @ManyToOne
    @JoinColumn (name = "course_id", nullable = false)
    @JsonIgnoreProperties ({"bookings"})
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
