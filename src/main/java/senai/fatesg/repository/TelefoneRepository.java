package senai.fatesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.fatesg.model.Pessoa;
import senai.fatesg.model.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {
}
