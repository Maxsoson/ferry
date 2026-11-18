package com.ferry;

import java.time.LocalDate;

public class FerryReportDTO {
    private Integer flightNumber;
    private LocalDate flightDate;
    private String ferryName;
    private Integer passengerSeats;
    private Integer parkingSpaces;
    private String ticketCategory;
    private String accountingUnit;
    private Integer ticketsSold;
    private Integer ticketPriceUah;

    public FerryReportDTO(Integer flightNumber, LocalDate flightDate, String ferryName,
                          Integer passengerSeats, Integer parkingSpaces, String ticketCategory,
                          String accountingUnit, Integer ticketsSold, Integer ticketPriceUah) {
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.ferryName = ferryName;
        this.passengerSeats = passengerSeats;
        this.parkingSpaces = parkingSpaces;
        this.ticketCategory = ticketCategory;
        this.accountingUnit = accountingUnit;
        this.ticketsSold = ticketsSold;
        this.ticketPriceUah = ticketPriceUah;
    }

    public Integer getFlightNumber() { return flightNumber; }
    public LocalDate getFlightDate() { return flightDate; }
    public String getFerryName() { return ferryName; }
    public Integer getPassengerSeats() { return passengerSeats; }
    public Integer getParkingSpaces() { return parkingSpaces; }
    public String getTicketCategory() { return ticketCategory; }
    public String getAccountingUnit() { return accountingUnit; }
    public Integer getTicketsSold() { return ticketsSold; }
    public Integer getTicketPriceUah() { return ticketPriceUah; }
}