package TrabalhoA3.unisul.repositories;

import TrabalhoA3.unisul.entity.Carro;
import TrabalhoA3.unisul.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

    Optional<Carro> findById(Long id);
}
