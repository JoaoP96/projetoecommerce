package senai.fatesg.model;

import java.time.LocalDateTime;

public class Telefone extends BaseModel{

    private String ddd;
    private String numero;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Contato contato;
}
