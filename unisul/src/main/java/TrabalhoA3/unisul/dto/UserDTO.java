package TrabalhoA3.unisul.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class UserDTO {

    private Long idUser;

    private String nome;

    private Date dataNasc;

    private String email;

    private String cpf;

    private String senha;
}
