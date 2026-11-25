package com.ferry;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/* 
  Колекція, в якій зберігатися документ баз даних MongoDB, що представляє сутність рядку з таблиці з розкладом коледжу.
*/
@Document(collection = "ferry-tickets")
public class FerryFlight {
    @Id
    private String id;
    private String flightNumber;
    private String flightDate;
    private String ferry;
    private String passengerSeats;
    private String parkingSpaces;
    private String adultPassenger;
    private String childPassenger;
    private String bicycle;
    private String passengerCar;

    public FerryFlight(String flightNumber, String flightDate, String ferry,    String passengerSeats, String parkingSpaces, String adultPassenger, String childPassenger, String bicycle, String passengerCar) {
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.ferry = ferry;
        this.passengerSeats = passengerSeats;
        this.parkingSpaces = parkingSpaces;
        this.adultPassenger = adultPassenger;
        this.childPassenger = childPassenger;
        this.bicycle = bicycle;
        this.passengerCar = passengerCar;
    }

    @Override
    public String toString() {
        return "FerryFlight {" +
                " id=\"" + id + "\"\n" +
                " flightNumber=\"" + flightNumber + "\"\n" +
                " flightDate=\"" + flightDate + "\"\n" +
                " ferry=\"" + ferry + "\"\n" +
                " passengerSeats=\"" + passengerSeats + "\"\n" +
                " parkingSpaces=\"" + parkingSpaces + "\"\n" +
                " adultPassenger=\"" + adultPassenger + "\"\n" +
                " childPassenger=\"" + childPassenger + "\"\n" +
                " bicycle=\"" + bicycle + "\"\n" +
                " passengerCar=\"" + passengerCar + "\"\n" +
                "}";
    }
}