package TrabalhoA3.unisul.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotNull;
import java.sql.Date;


@Entity
@Data
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    //@SequenceGenerator()
    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "nome")
    private String nome;

    private Date dataNasc;

    @NotNull
    //@IsBlanck
    private String email;

    @NotNull
    @CPF
    private String cpf;


    private String senha;

}
