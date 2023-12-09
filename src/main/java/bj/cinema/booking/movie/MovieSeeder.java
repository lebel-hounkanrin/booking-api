package bj.cinema.booking.movie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieSeeder {
    @Bean
    CommandLineRunner commandLineRunner(MovieRepository movieRepository) {
        return args -> {
            Movie irresistible = new Movie("irresistible", 120);
            movieRepository.save(irresistible);
        };
    }
}
