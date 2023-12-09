package bj.cinema.booking.movie;

import jakarta.persistence.*;

@Entity
@Table
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Long id;

    public Movie() {
    }

    public Movie(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public Movie(String name, String gender, String description, int duration, String actor, String director) {
        this.name = name;
        this.gender = gender;
        this.description = description;
        this.duration = duration;
        this.actor = actor;
        this.director = director;
    }

   @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    private String gender;

    private String description;

    @Column(nullable = false)
    private int duration;

    private  String actor;

    private String director;
}
