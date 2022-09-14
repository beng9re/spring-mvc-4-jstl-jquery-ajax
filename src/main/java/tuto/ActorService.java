package tuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public Actor findById(Long actorId) {
        return actorRepository.findById(actorId).orElse(new Actor());
    }

    public List<Actor> findByAll() {
        return actorRepository.findAll();
    }

    @PostConstruct
    void fixture(){
        IntStream.range(0, 100).forEach((count) -> {
            actorRepository.save(new Actor("영화" + count,"주연" + count, 12 + count));
        });
    }

}
