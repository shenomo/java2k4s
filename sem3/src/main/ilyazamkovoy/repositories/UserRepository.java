package main.ilyazamkovoy.repositories;

import main.ilyazamkovoy.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import main.ilyazamkovoy.entity.UserEntity;

/**
 * Created by zamkovoyilya on 03/05/16.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findOneByEmail(String email);
}
