package com.ferry;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @Column(name = "flight_number")
    private Integer flightNumber;

    @Column(name = "flight_date")
    private LocalDate flightDate;

    @ManyToOne
    @JoinColumn(name = "ferry", referencedColumnName = "ferry")
    private Ferry ferry;

    public Flight() {}

    public Flight(Integer flightNumber, LocalDate flightDate, Ferry ferry) {
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.ferry = ferry;
    }

    public Integer getFlightNumber() { return flightNumber; }
    public void setFlightNumber(Integer flightNumber) { this.flightNumber = flightNumber; }
    public LocalDate getFlightDate() { return flightDate; }
    public void setFlightDate(LocalDate flightDate) { this.flightDate = flightDate; }
    public Ferry getFerry() { return ferry; }
    public void setFerry(Ferry ferry) { this.ferry = ferry; }
}