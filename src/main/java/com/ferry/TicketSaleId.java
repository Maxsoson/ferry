package com.ferry;

import java.io.Serializable;
import java.util.Objects;

public class TicketSaleId implements Serializable {
    private Integer flightNumber;
    private String ticketCategory;

    public TicketSaleId() {}

    public TicketSaleId(Integer flightNumber, String ticketCategory) {
        this.flightNumber = flightNumber;
        this.ticketCategory = ticketCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicketSaleId that = (TicketSaleId) o;
        return Objects.equals(flightNumber, that.flightNumber) &&
               Objects.equals(ticketCategory, that.ticketCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber, ticketCategory);
    }
}