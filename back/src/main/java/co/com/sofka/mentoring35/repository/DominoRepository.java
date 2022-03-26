package co.com.sofka.mentoring35.repository;

import co.com.sofka.mentoring35.model.Domino;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface DominoRepository extends ReactiveCrudRepository<Domino, String> {
    
}
