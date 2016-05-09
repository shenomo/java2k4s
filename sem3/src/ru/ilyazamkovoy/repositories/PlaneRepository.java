package ru.ilyazamkovoy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ilyazamkovoy.entity.PlaneEntity;

/**
 * Created by zamkovoyilya on 05/05/16.
 */

@Repository
public interface PlaneRepository extends JpaRepository<PlaneEntity, Long>{

    PlaneEntity findOneBySerialNumber(String serialNumber);


}
