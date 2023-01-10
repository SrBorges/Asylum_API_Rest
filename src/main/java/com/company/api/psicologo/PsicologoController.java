package com.company.api.psicologo;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/psicologo")

public class PsicologoController {

    @Autowired
    private PsicologoRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid PsicologoEntity json){

        repository.save(new PsicologoEntity(json));

    }

    @GetMapping
    public Page<PsicologoDTO> read(Pageable page){

        return repository.findAll(page).map(PsicologoDTO::new);

    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid PsicUpdateDTO json){

        var psicologo = repository.getReferenceById(json.id());
        psicologo.updateInfo(json);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){

        repository.deleteById(id);

    }

}
