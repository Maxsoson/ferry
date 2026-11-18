package com.ferry;

import javax.persistence.*;

@Entity
@Table(name = "ticket_sale")
@IdClass(TicketSaleId.class)
public class TicketSale {
    @Id
    @Column(name = "flight_number")
    private Integer flightNumber;

    @Id
    @Column(name = "ticket_category")
    private String ticketCategory;

    @ManyToOne
    @JoinColumn(name = "flight_number", insertable = false, updatable = false)
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "ticket_category", insertable = false, updatable = false)
    private TicketCategory category;

    @Column(name = "tickets_sold")
    private Integer ticketsSold;

    @Column(name = "ticket_price_uah")
    private Integer ticketPriceUah;

    public TicketSale() {}

    public TicketSale(Flight flight, TicketCategory category, Integer ticketsSold, Integer ticketPriceUah) {
        this.flightNumber = flight.getFlightNumber();
        this.ticketCategory = category.getTicketCategory();
        this.flight = flight;
        this.category = category;
        this.ticketsSold = ticketsSold;
        this.ticketPriceUah = ticketPriceUah;
    }

    public Integer getFlightNumber() { return flightNumber; }
    public String getTicketCategory() { return ticketCategory; }
    public Flight getFlight() { return flight; }
    public TicketCategory getCategory() { return category; }
    public Integer getTicketsSold() { return ticketsSold; }
    public Integer getTicketPriceUah() { return ticketPriceUah; }
}