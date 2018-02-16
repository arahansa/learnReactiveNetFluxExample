package guru.springramework.netfluxexampleorigin.service;

import guru.springramework.netfluxexampleorigin.domain.Movie;
import guru.springramework.netfluxexampleorigin.domain.MovieEvent;
import guru.springramework.netfluxexampleorigin.repositories.MovieRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Date;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository repository) {
        this.movieRepository = repository;
    }

    @Override
    public Flux<MovieEvent> events(String movieId) {

        return Flux.<MovieEvent>generate(movieEventSynchronousSink -> {
            movieEventSynchronousSink.next(new MovieEvent(movieId,new Date()));
        }).delayElements(Duration.ofSeconds(1));
    }

    @Override
    public Mono<Movie> getMovieById(String id) {
        return this.movieRepository.findById(id);
    }

    @Override
    public Flux<Movie> getAllMovies() {
        return this.movieRepository.findAll();
    }
}
