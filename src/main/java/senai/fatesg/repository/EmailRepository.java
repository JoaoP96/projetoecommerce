package senai.fatesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.fatesg.model.Email;
import senai.fatesg.model.Pessoa;

public interface EmailRepository extends JpaRepository<Email, Integer> {
}
