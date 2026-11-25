package com.ferry;

import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Додаток для роботи з базою даних поромного сполучення MongoDB.
 *
 * @SpringBootApplication - анотація для позначення головного класу Spring Boot додатку.
 *
 * Клас реалізує CommandLineRunner для виконання коду після запуску додатку.
 *
 * Методи:
 * - main(String[] args): запускає додаток Spring Boot.
 * - run(String... args): метод, що виконується після запуску додатку. Виводить меню для користувача.
 * - addFerryFlightsFromCsv(): додає рейси порома з CSV-файлу до бази даних.
 * - viewAllFerryFlights(): виводить усі рейси порома з бази даних.
 * - dropAllFerryFlights(): видаляє всі рейси порома з бази даних.
 *
 * Поля:
 * - ferryFlightRepository: репозиторій для роботи з рейсами порома.
 *
 * Використовує:
 * - Scanner для зчитування вводу користувача.
 * - CSVReader для зчитування даних з CSV-файлу.
 * - FerryFlight для представлення документа рейсу порома.
 * - FerryFlightRepository для взаємодії з базою даних.
 */
@SpringBootApplication
public class FerryApplication implements CommandLineRunner {

    @Autowired
    private FerryFlightRepository ferryFlightRepository;

    public static void main(String[] args) {
        SpringApplication.run(FerryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Додати рейси порома з CSV-файлу");
            System.out.println("2. Подивитись рейси порома");
            System.out.println("3. Видалити рейси порома");
            System.out.println("4. Вихід");
            System.out.print("Введіть номер команди (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addFerryFlightsFromCsv();
                    break;
                case 2:
                    viewAllFerryFlights();
                    break;
                case 3:
                    dropAllFerryFlights();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Номер команди некоректний. Спробуй ще.");
            }
        }
    }

    private void addFerryFlightsFromCsv() {
        try (CSVReader reader = new CSVReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream("ferry.csv"),
                StandardCharsets.UTF_8))) {
            List<String[]> records = reader.readAll();

            records.remove(0); // Видалити перший рядок з назвами стовпців

            List<FerryFlight> flightList = new ArrayList<>();
            for (String[] record : records) {
                FerryFlight flight = new FerryFlight(
                        record[0], // flightNumber
                        record[1], // flightDate
                        record[2], // ferry
                        record[3], // passengerSeats
                        record[4], // parkingSpaces
                        record[5], // adultPassenger
                        record[6], // childPassenger
                        record[7], // bicycle
                        record[8]  // passengerCar
                );
                flightList.add(flight);
            }

            ferryFlightRepository.saveAll(flightList);
            System.out.println(flightList.size() + " документів з рейсами порома завантажено з CSV.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Не вдалось завантажити рейси порома з CSV.");
        }
    }

    private void viewAllFerryFlights() {
        List<FerryFlight> flights = ferryFlightRepository.findAll();
        if (flights.isEmpty()) {
            System.out.println("Документи з рейсами порома не знайдено.");
        } else {
            System.out.println("Знайдено " + flights.size() + " документів рейсів порома:");
            flights.forEach(System.out::println);
        }
    }

    private void dropAllFerryFlights() {
        ferryFlightRepository.deleteAll();
        System.out.println("Усі рейси порома видалено.");
    }
}