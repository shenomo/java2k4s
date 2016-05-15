package main.ilyazamkovoy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.ilyazamkovoy.entity.AdminEntity;

/**
 * Created by zamkovoyilya on 09/05/16.
 */

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long>{

    AdminEntity findOneByLogin(String login);

}
