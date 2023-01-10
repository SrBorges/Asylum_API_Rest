package com.company.api.pacientes;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController


@RequestMapping("/pacientes")

public class PacienteController {

    @Autowired
    private PacienteRepository repository;


    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid PacienteEntity json){

        repository.save(new PacienteEntity(json));

    }

    @GetMapping
    public Page<PacienteDTO> read(Pageable page){

        return repository.findAll(page).map(PacienteDTO::new);

    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid PacUpdateDTO json){

        var paciente = repository.getReferenceById(json.id());
        paciente.updateInfo(json);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        repository.deleteById(id);

    }


}
