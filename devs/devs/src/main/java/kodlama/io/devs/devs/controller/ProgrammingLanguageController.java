package kodlama.io.devs.devs.controller;

import kodlama.io.devs.devs.model.ProgrammingLanguage;
import kodlama.io.devs.devs.service.interfaces.ProgrammingLanguageServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguageController {

    private final ProgrammingLanguageServiceInterface service;

    public ProgrammingLanguageController(ProgrammingLanguageServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return service.getAll();
    }

    @GetMapping("/getbyid")
    public ProgrammingLanguage getById(@RequestParam String id) throws Exception {
        return service.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage language) throws Exception{
        service.insert(language);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody ProgrammingLanguage language) throws Exception{
        service.delete(language);
    }

    @PutMapping("/update")
    public void update(@RequestBody ProgrammingLanguage language) throws Exception{
        service.update(language);
    }
}
