package tuto;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class ActorRepository {
    private final Map<Long, Actor> actors = new ConcurrentHashMap<>();

    public Optional<Actor> findById(Long id) {
        return Optional.ofNullable(actors.get(id));
    }

    public Actor save(Actor actor) {
        Actor createActor = new Actor(actor);
        createActor.setId(nextId());
        actors.put(createActor.getId(), createActor);
        return actors.get(createActor.getId());
    }

    private Long nextId() {
        return actors.keySet().stream()
                .max(Long::compare)
                .orElse(0L) + 1L;
    }


    public List<Actor> findAll() {
        return Collections.unmodifiableList(new ArrayList<>(actors.values()));
    }
}
