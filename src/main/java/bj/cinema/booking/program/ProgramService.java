package bj.cinema.booking.program;

import bj.cinema.booking.movie.Movie;
import bj.cinema.booking.movie.MovieService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ProgramService {
    private final ProgramRepository programRepository;
    private final MovieService movieService;

    @Autowired
    ProgramService(ProgramRepository programRepository, MovieService movieService){
        this.programRepository = programRepository;
        this.movieService = movieService;
    }

    List<Program> getPrograms(){
        return this.programRepository.findAll();
    }

    Optional<Program> getProgramById(Long id){
        return this.programRepository.findById(id);
    }

    // Optional<Program> getProgramByDate(Date date){}

    Program create(ProgramDto programDto) throws Exception {
        Optional<Movie> movie = this.movieService.getMovie(programDto.getMovieId());
        if(movie.isPresent()){
            Movie existingMovie = (Movie) movie.get();
            Program program = new Program(programDto.getDate(), existingMovie);
            return  this.programRepository.save(program);
        }

        throw  new BadRequestException("provided movie doesn't exist");
    }

}
