package com.github.cesarvizentini.heroesapi.controller;

import com.github.cesarvizentini.heroesapi.document.Personagem;
import com.github.cesarvizentini.heroesapi.service.PersonagemService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



@RestController
@RequestMapping("personagem")
public class PersonagemController {

    Logger log = LoggerFactory.getLogger(PersonagemController.class);

    private final PersonagemService personagemService;

    public PersonagemController(PersonagemService personagemService) {
        this.personagemService = personagemService;
    }

    @GetMapping("/list-personagens")
    public Flux<Personagem> getAllPersonagens() {
        log.info("list personagens acessado");

        return personagemService.getAllPersonagens();
    }

    @GetMapping("/get-personagem-by-id")
    public Mono<Personagem> getPersonagemById(@RequestParam("id") String id) {
        log.info("get personagem by id acessado");

        return personagemService.getPersonagemById(id);
    }

    @GetMapping("/get-personagem-by-name")
    public Mono<Personagem> getPersonagemByName(@RequestParam("name") String nome) {
        log.info("get personagem by name acessado");

        return personagemService.getByName(nome);
    }

    @PutMapping("/update-personagem")
    public Mono updatePersonagem(@RequestBody Personagem personagem){
        log.info("update personagem acessado");

        return personagemService.updatePersonagem(personagem);
    }

    @PostMapping("/save-personagem")
    public Mono savePersonagem(@RequestBody Personagem personagem) {
        log.info("save personagem acessado");

        return personagemService.savePersonagem(personagem);
    }

    @DeleteMapping("/delete-personagem")
    public Mono deletePersonagem(@RequestParam("id") String id) {
        log.info("delete personagem acessado");

        return personagemService.deletePersonagemById(id);
    }

    @GetMapping("/list-herois")
    public Flux<Personagem> getAllHerois() {
        log.info("list herois acessado");

        return personagemService.getByIndole("heroi");
    }

    @GetMapping("/list-viloes")
    public Flux<Personagem> getAllViloes() {
        log.info("list viloes acessado");

        return personagemService.getByIndole("vilao");
    }

}
