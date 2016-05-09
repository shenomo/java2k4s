package ru.ilyazamkovoy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ilyazamkovoy.entity.FlightEntity;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Long> {

    FlightEntity findOneByIdentity(String identity);


}
