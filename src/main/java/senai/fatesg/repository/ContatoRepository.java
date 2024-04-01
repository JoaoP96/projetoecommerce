package senai.fatesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.fatesg.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
