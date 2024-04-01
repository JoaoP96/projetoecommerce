package senai.fatesg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import senai.fatesg.model.Pessoa;
import senai.fatesg.model.PessoaJuridica;

public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Integer> {
}
