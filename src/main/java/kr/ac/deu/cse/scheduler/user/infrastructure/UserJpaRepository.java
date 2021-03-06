package kr.ac.deu.cse.scheduler.user.infrastructure;

import java.util.UUID;
import kr.ac.deu.cse.scheduler.user.domain.UserDataMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaRepository extends JpaRepository<UserDataMapper, UUID> {

  UserDataMapper findByUsername(String username);
}
