package bj.cinema.booking.program;

import bj.cinema.booking.movie.Movie;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Program {
    @Id
    @GeneratedValue
    @Column(name = "program_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Program() {
    }

    @Temporal(TemporalType.DATE)
    private Date date;

    // @Temporal(TemporalType.TIME)
    //private  Date time;

    public Program(Date date, Movie movie) {
        this.date = date;
        this.movie = movie;
    }

    @OneToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
}
