package tuto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static tuto.ActorModel.convert;


@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public ActorModel findById(Long actorId) {
        final Actor findActor = actorRepository.findById(actorId).orElse(Actor.emptyActor());

        return convert(findActor);
    }

    public List<ActorModel> findByAll() {
        return actorRepository.findAll()
                .stream()
                .map(ActorModel::convert)
                .collect(Collectors.toList());
    }

    @PostConstruct
    void fixture(){
        IntStream.range(0, 100).forEach((count) -> {
            actorRepository.save(new Actor("영화" + count,"주연" + count, 12 + count));
        });
    }

}
