package bj.cinema.booking.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    @Autowired
    MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<Movie> getMovies(){
        return this.movieRepository.findAll();
    }

    public Optional<Movie> getMovie(Long id){
        return this.movieRepository.findById(id);
    }

    public Movie addNewMovie(Movie movie){
        return this.movieRepository.save(movie);
    }

    public void deleteMovie(Long id){}
}