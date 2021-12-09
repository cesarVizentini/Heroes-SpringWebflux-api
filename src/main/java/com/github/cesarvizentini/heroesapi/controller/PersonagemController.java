package com.github.cesarvizentini.heroesapi.controller;

import com.github.cesarvizentini.heroesapi.document.Personagem;
import com.github.cesarvizentini.heroesapi.service.PersonagemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("personagem")
public class PersonagemController {

    private final PersonagemService personagemService;

    public PersonagemController(PersonagemService personagemService) {
        this.personagemService = personagemService;
    }

    @GetMapping("/list-personagens")
    public Flux<Personagem> getAllPersonagens() {
        return personagemService.getAllPersonagens();
    }

    @GetMapping("/get-personagem-by-id")
    public Mono<Personagem> getPersonagemById(@RequestParam("id") String id) {
        return personagemService.getPersonagemById(id);
    }

    @GetMapping("/get-personagem-by-name")
    public Mono<Personagem> getPersonagemByName(@RequestParam("name") String nome) {
        return personagemService.getByName(nome);
    }

    @PutMapping("/update-personagem")
    public Mono updatePersonagem(@RequestBody Personagem personagem){
        return personagemService.updatePersonagem(personagem);
    }

    @PostMapping("/save-personagem")
    public Mono savePersonagem(@RequestBody Personagem personagem) {
        return personagemService.savePersonagem(personagem);
    }

    @DeleteMapping("/delete-personagem")
    public Mono deletePersonagem(@RequestParam("id") String id) {
        return personagemService.deletePersonagemById(id);
    }

    @GetMapping("/list-herois")
    public Flux<Personagem> getAllHerois() {
        return personagemService.getByIndole("heroi");
    }

    @GetMapping("/list-viloes")
    public Flux<Personagem> getAllViloes() {
        return personagemService.getByIndole("vilao");
    }

}
