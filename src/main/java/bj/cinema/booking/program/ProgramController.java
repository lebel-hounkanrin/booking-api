package bj.cinema.booking.program;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/programs")
public class ProgramController {

    private final ProgramService programService;

    @Autowired
    ProgramController(ProgramService programService){
        this.programService = programService;
    }

    @GetMapping
    List<Program> getPrograms(){
        return this.programService.getPrograms();
    }

    @GetMapping(path = "{id}")
    Optional<Program> getProgram(@PathVariable("id") Long id){
        return  this.programService.getProgramById(id);
    }

    @PostMapping
    ResponseEntity<Program> addProgram(@RequestBody @Valid ProgramDto program) throws Exception{
        return new ResponseEntity<Program>(
                this.programService.create(program),
                HttpStatus.CREATED
        );
    }
}
