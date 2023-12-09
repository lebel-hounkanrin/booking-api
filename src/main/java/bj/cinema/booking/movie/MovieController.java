package bj.cinema.booking.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {
    private final MovieService movieService;

    @Autowired
    MovieController(MovieService movieService){
            this.movieService = movieService;
    }

    @GetMapping()
    List<Movie> getMovies(){
        return this.movieService.getMovies();
    }

    @GetMapping(path = "{id}")
    Optional<Movie> getMovie(@PathVariable("id") Long id){
        return this.movieService.getMovie(id);
    }

    @PostMapping
    Movie createMovie(@RequestBody Movie movie){
        return this.movieService.addNewMovie(movie);
    }
}
