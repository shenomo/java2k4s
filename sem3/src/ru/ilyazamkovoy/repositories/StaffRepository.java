package ru.ilyazamkovoy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.ilyazamkovoy.entity.StaffEntity;

/**
 * Created by zamkovoyilya on 07/05/16.
 */
@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Long>{

    StaffEntity findOneByIdentity(String identity);

}
