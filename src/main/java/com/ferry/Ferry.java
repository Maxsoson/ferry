package com.ferry;

import javax.persistence.*;

@Entity
@Table(name = "ferry")
public class Ferry {
    @Id
    @Column(name = "ferry")
    private String ferry;

    @Column(name = "passenger_seats")
    private Integer passengerSeats;

    @Column(name = "parking_spaces")
    private Integer parkingSpaces;

    public Ferry() {}

    public Ferry(String ferry, Integer passengerSeats, Integer parkingSpaces) {
        this.ferry = ferry;
        this.passengerSeats = passengerSeats;
        this.parkingSpaces = parkingSpaces;
    }

    public String getFerry() { return ferry; }
    public void setFerry(String ferry) { this.ferry = ferry; }
    public Integer getPassengerSeats() { return passengerSeats; }
    public void setPassengerSeats(Integer passengerSeats) { this.passengerSeats = passengerSeats; }
    public Integer getParkingSpaces() { return parkingSpaces; }
    public void setParkingSpaces(Integer parkingSpaces) { this.parkingSpaces = parkingSpaces; }
}