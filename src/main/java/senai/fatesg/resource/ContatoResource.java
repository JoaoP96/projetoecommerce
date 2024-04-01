package senai.fatesg.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import senai.fatesg.interfaces.IResource;
import senai.fatesg.model.Contato;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "api/v1/contato")
public class ContatoResource implements IResource<Contato, Integer> {

    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )

    @Override
    public Contato create(Contato entity) {
        log.info("Acessando o método ContatoResource.create");
        return null;
    }
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Contato> read() {
        log.info("Acessando o método ContatoResource.read");
        return null;
    }
    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Contato read(@PathVariable Integer id) {
        log.info("Acessando o método ContatoResource.get(id)");
        return null;
    }
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Contato update(@PathVariable Integer id, @RequestBody Contato entity) {
        log.info("Acessando o método ContatoResource.update");
        return null;
    }
    @DeleteMapping(value = "/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        log.info("Acessando o método ContatoResource.delete");
    }
}
