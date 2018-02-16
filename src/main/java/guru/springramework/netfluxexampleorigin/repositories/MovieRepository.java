package guru.springramework.netfluxexampleorigin.repositories;

import guru.springramework.netfluxexampleorigin.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
