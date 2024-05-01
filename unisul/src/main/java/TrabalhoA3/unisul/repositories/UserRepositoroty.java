package TrabalhoA3.unisul.repositories;

import TrabalhoA3.unisul.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepositoroty extends JpaRepository<User, Long> {


    Optional<User> findById(Long id);
}
