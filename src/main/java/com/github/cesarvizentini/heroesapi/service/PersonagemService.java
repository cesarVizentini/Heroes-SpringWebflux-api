package com.github.cesarvizentini.heroesapi.service;

import com.github.cesarvizentini.heroesapi.document.Personagem;
import com.github.cesarvizentini.heroesapi.repository.PersonagemRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonagemService {

    private final PersonagemRepository personagemRepository;

    public PersonagemService(PersonagemRepository personagemRepository) {
        this.personagemRepository = personagemRepository;
    }

    public Flux<Personagem> getAllPersonagens() {
        return personagemRepository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Personagem> getPersonagemById(String id) {
        return personagemRepository.findById(id);
    }

    public Mono<Personagem> getByName(String nome) {
        return personagemRepository.findByNome(nome);
    }

    public Flux<Personagem> getByIndole(String indole) {
        return personagemRepository.findByIndole(indole);
    }

    public Mono updatePersonagem(Personagem personagem) {
        return personagemRepository.save(personagem);
    }

    public Mono savePersonagem(Personagem personagem) {
        return personagemRepository.save(personagem);
    }

    public Mono deletePersonagemById(String id) {
        return personagemRepository.deleteById(id);
    }
}
