package co.com.sofka.mentoring35.controller;

import java.util.Date;

import co.com.sofka.mentoring35.model.Domino;
import co.com.sofka.mentoring35.repository.DominoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/r")
public class DominoController {

    private DominoRepository randomRepository;

    @Autowired
    public DominoController(DominoRepository randomRepository) {
        this.randomRepository = randomRepository;
    }

    @PostMapping("")
    public Mono<Domino> post() {
        String valorUno = String.valueOf(new java.util.Random().nextInt(7));
        String valorDos = String.valueOf(new java.util.Random().nextInt(7));
        return Mono.just(new Domino()).map(entity -> {
            entity.setDate(new Date());
            entity.setFicha(valorUno +"/"+valorDos);
            return entity;
        }).flatMap(randomRepository::save);
    }

    @GetMapping("")
    public Flux<Domino> get() {
        return randomRepository.findAll();
    }
}
