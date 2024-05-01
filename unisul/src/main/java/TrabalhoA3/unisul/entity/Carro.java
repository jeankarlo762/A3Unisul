package TrabalhoA3.unisul.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Carro {

    private Long idCarro;

    private String modelo;
}
