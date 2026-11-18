package com.ferry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        // 1. Збереження початкових даних у базу даних (як у прикладі викладача)
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();

            // Пороми
            Ferry dnipro = new Ferry("Дніпро", 100, 12);
            Ferry obriy = new Ferry("Обрій", 80, 8);
            session.save(dnipro);
            session.save(obriy);

            // Категорії квитків
            TicketCategory adult = new TicketCategory("Дорослий пасажир", "особа");
            TicketCategory child = new TicketCategory("Дитячий пасажир", "особа");
            TicketCategory bike = new TicketCategory("Велосипед", "одиниця");
            TicketCategory car = new TicketCategory("Легковий автомобіль", "одиниця");
            session.save(adult);
            session.save(child);
            session.save(bike);
            session.save(car);

            // 12 Рейсів
            Flight f2201 = new Flight(2201, LocalDate.of(2026, 9, 2), dnipro);
            Flight f2202 = new Flight(2202, LocalDate.of(2026, 9, 3), obriy);
            Flight f2203 = new Flight(2203, LocalDate.of(2026, 9, 4), dnipro);
            Flight f2204 = new Flight(2204, LocalDate.of(2026, 9, 5), obriy);
            Flight f2205 = new Flight(2205, LocalDate.of(2026, 9, 6), dnipro);
            Flight f2206 = new Flight(2206, LocalDate.of(2026, 9, 16), dnipro);
            Flight f2207 = new Flight(2207, LocalDate.of(2026, 9, 26), obriy);
            Flight f2208 = new Flight(2208, LocalDate.of(2026, 10, 6), dnipro);
            Flight f2209 = new Flight(2209, LocalDate.of(2026, 10, 16), obriy);
            Flight f2210 = new Flight(2210, LocalDate.of(2026, 10, 26), dnipro);
            Flight f2211 = new Flight(2211, LocalDate.of(2026, 11, 5), dnipro);
            Flight f2212 = new Flight(2212, LocalDate.of(2026, 11, 15), obriy);

            Flight[] flights = {f2201, f2202, f2203, f2204, f2205, f2206, f2207, f2208, f2209, f2210, f2211, f2212};
            for (Flight f : flights) {
                session.save(f);
            }

            // Продажі квитків (31 запис)
            TicketSale[] sales = {
                new TicketSale(f2201, adult, 25, 80), new TicketSale(f2201, child, 8, 40), new TicketSale(f2201, car, 6, 40),
                new TicketSale(f2202, child, 6, 40), new TicketSale(f2202, bike, 3, 50),
                new TicketSale(f2203, adult, 30, 85), new TicketSale(f2203, child, 3, 50), new TicketSale(f2203, car, 4, 250),
                new TicketSale(f2204, bike, 5, 50), new TicketSale(f2204, car, 6, 250),
                new TicketSale(f2205, adult, 20, 85), new TicketSale(f2205, child, 30, 85), new TicketSale(f2205, bike, 3, 55),
                new TicketSale(f2206, adult, 25, 80), new TicketSale(f2206, child, 8, 40), new TicketSale(f2206, car, 6, 40),
                new TicketSale(f2207, child, 6, 40), new TicketSale(f2207, bike, 3, 50),
                new TicketSale(f2208, adult, 30, 85), new TicketSale(f2208, child, 3, 50), new TicketSale(f2208, car, 4, 250),
                new TicketSale(f2209, bike, 5, 50), new TicketSale(f2209, car, 6, 250),
                new TicketSale(f2210, adult, 20, 85), new TicketSale(f2210, child, 30, 85), new TicketSale(f2210, bike, 3, 55),
                new TicketSale(f2211, adult, 25, 80), new TicketSale(f2211, child, 8, 40), new TicketSale(f2211, car, 6, 40),
                new TicketSale(f2212, child, 6, 40), new TicketSale(f2212, bike, 3, 50)
            };
            for (TicketSale ts : sales) {
                session.save(ts);
            }

            tx.commit();
            System.out.println("Дані успішно збережено!");
        }

        // 2. Вибірка даних через HQL JOIN у DTO та виведення у 1НФ
        try (Session session = factory.openSession()) {
            String hql = "SELECT new com.ferry.FerryReportDTO(" +
                         "f.flightNumber, f.flightDate, fe.ferry, fe.passengerSeats, fe.parkingSpaces, " +
                         "c.ticketCategory, c.accountingUnit, ts.ticketsSold, ts.ticketPriceUah) " +
                         "FROM TicketSale ts " +
                         "JOIN ts.flight f " +
                         "JOIN f.ferry fe " +
                         "JOIN ts.category c " +
                         "ORDER BY f.flightNumber ASC";

            List<FerryReportDTO> report = session.createQuery(hql, FerryReportDTO.class).list();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");

            // Виведення у форматі списку (як у прикладі викладача) + зведена таблиця 1НФ
            for (FerryReportDTO r : report) {
                System.out.println("Номер рейсу: " + r.getFlightNumber());
                System.out.println("Дата рейсу: " + r.getFlightDate().format(formatter));
                System.out.println("Пором: " + r.getFerryName());
                System.out.println("Пасажирських місць: " + r.getPassengerSeats());
                System.out.println("Місць для автомобілів: " + r.getParkingSpaces());
                System.out.println("Категорія квитка: " + r.getTicketCategory());
                System.out.println("Одиниця обліку: " + r.getAccountingUnit());
                System.out.println("Продано квитків: " + r.getTicketsSold());
                System.out.println("Ціна квитка, грн: " + r.getTicketPriceUah());
                System.out.println("--------------------------------------------------");
            }
        } finally {
            factory.close();
        }
    }
}