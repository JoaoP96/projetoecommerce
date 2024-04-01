package senai.fatesg.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco extends BaseModel{

    private String logradouros;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Contato contato;
}
