package senai.fatesg.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import senai.fatesg.interfaces.IResource;
import senai.fatesg.model.Email;

import java.util.List;

public class EmailResource implements IResource<Email, Integer> {
    @PostMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email create(@RequestBody Email entity) {
        log.info("Acessando o método EmailResource.create");
        return null;
    }
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public List<Email> read() {
        return null;
    }
    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email read(@PathVariable Integer id) {
        return null;
    }
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    @Override
    public Email update(@PathVariable Integer id, @RequestBody Email entity) {
        return null;
    }
    @DeleteMapping(value = "/{id}")
    @Override
    public void delete(@PathVariable Integer id) {

    }
}
