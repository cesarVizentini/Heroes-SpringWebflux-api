package com.github.cesarvizentini.heroesapi.repository;

import com.github.cesarvizentini.heroesapi.document.Personagem;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PersonagemRepository extends ReactiveMongoRepository<Personagem, String> {
    Mono<Personagem> findByNome(String nome);
    Flux<Personagem> findByIndole(String indole);
}
