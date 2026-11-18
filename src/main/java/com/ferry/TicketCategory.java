package com.ferry;

import javax.persistence.*;

@Entity
@Table(name = "ticket_category")
public class TicketCategory {
    @Id
    @Column(name = "ticket_category")
    private String ticketCategory;

    @Column(name = "accounting_unit")
    private String accountingUnit;

    public TicketCategory() {}

    public TicketCategory(String ticketCategory, String accountingUnit) {
        this.ticketCategory = ticketCategory;
        this.accountingUnit = accountingUnit;
    }

    public String getTicketCategory() { return ticketCategory; }
    public void setTicketCategory(String ticketCategory) { this.ticketCategory = ticketCategory; }
    public String getAccountingUnit() { return accountingUnit; }
    public void setAccountingUnit(String accountingUnit) { this.accountingUnit = accountingUnit; }
}