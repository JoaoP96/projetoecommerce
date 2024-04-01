package senai.fatesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.fatesg.model.Contato;
import senai.fatesg.model.Endereco;
import senai.fatesg.model.Pessoa;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
