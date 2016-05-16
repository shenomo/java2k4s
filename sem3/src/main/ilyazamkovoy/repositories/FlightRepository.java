package main.ilyazamkovoy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.ilyazamkovoy.entity.FlightEntity;

import java.util.List;

/**
 * Created by zamkovoyilya on 04/05/16.
 */
@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Long> {

    FlightEntity findOneByIdentity(String identity);

    List<FlightEntity> findAll();

    List<FlightEntity> findAllByFromDirection(String direct);

    List<FlightEntity> findAllByToDirection(String direction);

    List<FlightEntity> findAllByFromDirectionAndToDirection(String from, String to);
}
