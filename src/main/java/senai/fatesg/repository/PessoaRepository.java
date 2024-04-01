package senai.fatesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.fatesg.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
