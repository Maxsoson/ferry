package com.ferry;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface FerryFlightRepository extends MongoRepository<FerryFlight, String> {
}