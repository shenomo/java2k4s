package main.ilyazamkovoy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.ilyazamkovoy.entity.StaffEntity;

import java.util.List;

/**
 * Created by zamkovoyilya on 07/05/16.
 */
@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Long>{

    StaffEntity findOneByLogin(String login);

    List<StaffEntity> findAll();

}
