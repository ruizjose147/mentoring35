package co.com.sofka.mentoring35;

import java.util.Collections;
import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/r")
public class RandomController {

    private RandomRepository randomRepository;

    @Autowired
    public RandomController(RandomRepository randomRepository) {
        this.randomRepository = randomRepository;
    }

   /*@PostMapping("")
    public Mono<Random> post(@RequestBody RequestDTO request) {
        return Mono.just(new Random()).map(entity -> {
            entity.setDate(new Date());
            entity.setDominoList(request.getList());
            return entity;
        }).map(entity -> {
            var list = Stream.of(request.getList().split(","))
                .map(p -> p.trim())
                .collect(Collectors.toList());
            Collections.shuffle(list);
            var randomList = list.stream().collect(Collectors.joining(","));
            entity.setRandomList(randomList);
            return entity;
        }).flatMap(randomRepository::save);
    }*/

    @PostMapping("")
    public Mono<Random> post() {
        String valorUno = String.valueOf(new java.util.Random().nextInt(7));
        String valorDos = String.valueOf(new java.util.Random().nextInt(7));
        return Mono.just(new Random()).map(entity -> {
            entity.setDate(new Date());
            entity.setFicha(valorUno +"/"+valorDos);
            return entity;
        }).flatMap(randomRepository::save);
    }

    @GetMapping("")
    public Flux<Random> get() {
        return randomRepository.findAll();
    }
}
