package bj.cinema.booking.program;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramRepository extends JpaRepository<Program, Long> {
    public List<Program> findProgramsByDate = null;
}
