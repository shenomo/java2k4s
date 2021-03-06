package main.ilyazamkovoy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.ilyazamkovoy.entity.PlaneEntity;

import java.util.List;

/**
 * Created by zamkovoyilya on 05/05/16.
 */

@Repository
public interface PlaneRepository extends JpaRepository<PlaneEntity, Long>{

    PlaneEntity findOneBySerialNumber(String serialNumber);

    List<PlaneEntity> findAll();


}
