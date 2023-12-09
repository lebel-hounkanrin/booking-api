package bj.cinema.booking.program;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class ProgramDto {

    @NotNull(message = "movie should be provide")
    private Long  movieId;


    @NotNull(message = "date should be provide")
    private Date date;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ProgramDto() {
    }

    public ProgramDto(Long movieId, Date date) {
        this.movieId = movieId;
        this.date = date;
    }
}
