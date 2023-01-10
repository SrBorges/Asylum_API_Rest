package com.company.api.enfermeiro;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/enfermeiro")

public class EnfermeiroController {


    @Autowired
    private EnfermeiroRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid EnfermeiroEntity json){

        repository.save(new EnfermeiroEntity(json));

    }

    @GetMapping
    public Page<EnfermeiroDTO> read(Pageable page){

        return repository.findAll(page).map(EnfermeiroDTO::new);

    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid EnfUpdateDTO json){

        var enfermeiro = repository.getReferenceById(json.id());
        enfermeiro.updateInfo(json);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){

        repository.deleteById(id);
    }

}
