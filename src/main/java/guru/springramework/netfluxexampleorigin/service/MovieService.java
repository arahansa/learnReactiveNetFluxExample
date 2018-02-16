package guru.springramework.netfluxexampleorigin.service;

import guru.springramework.netfluxexampleorigin.domain.Movie;
import guru.springramework.netfluxexampleorigin.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService{

    Flux<MovieEvent> events(String movieId);

    Mono<Movie> getMovieById(String id);

    Flux<Movie> getAllMovies();


}
