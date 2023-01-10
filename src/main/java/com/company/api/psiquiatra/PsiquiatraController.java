package com.company.api.psiquiatra;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/psiquiatra")

public class PsiquiatraController {

    @Autowired
    private PsiquiatraRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid PsiquiatraEntity json){

        repository.save(new PsiquiatraEntity(json));

    }

    @GetMapping
    public Page<PsiquiatraDTO> read(Pageable page){

        return repository.findAll(page).map(PsiquiatraDTO::new);

    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid PsiqUpdateDTO json){

        var psiquiatra = repository.getReferenceById(json.id());
        psiquiatra.updateInfo(json);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }


}
