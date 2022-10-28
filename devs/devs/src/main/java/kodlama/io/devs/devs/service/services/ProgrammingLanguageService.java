package kodlama.io.devs.devs.service.services;

import kodlama.io.devs.devs.model.ProgrammingLanguage;
import kodlama.io.devs.devs.repository.interfaces.ProgrammingLanguageRepository;
import kodlama.io.devs.devs.service.interfaces.ProgrammingLanguageServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Service
public class ProgrammingLanguageService implements ProgrammingLanguageServiceInterface {
    private final ProgrammingLanguageRepository repository;

    public ProgrammingLanguageService(ProgrammingLanguageRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return repository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(String id) throws Exception{
        //checkIfIdExists(id);
        return repository.getById(id);
    }

    @Override
    public void insert(ProgrammingLanguage programmingLanguage) throws Exception {
        checkIfNameExists(programmingLanguage);
        checkIfNameFieldEmpty(programmingLanguage);
        programmingLanguage.setId(UUID.randomUUID().toString());
        repository.insert(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) throws Exception{
        if(programmingLanguage.getId() == null) throw new Exception("There is no programming language such as you have entered!");
        repository.update(programmingLanguage);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) throws Exception{
        if(programmingLanguage.getId() == null) throw new Exception("There is no programming language such as you have entered!");
        repository.delete(programmingLanguage);
    }

    private void checkIfNameExists(ProgrammingLanguage programmingLanguage) throws Exception{
        var languages = repository.getAll();
        for (ProgrammingLanguage language: languages) {
            if(programmingLanguage.getName().equals(language.getName())){
                throw new Exception("Name can not be duplicated!");
            }
        }
    }
    private void checkIfNameFieldEmpty(ProgrammingLanguage programmingLanguage) throws Exception{
        if(programmingLanguage.getName().isEmpty()){
            throw new Exception("Name can not be empty!");
        }
    }
    private void checkIfIdExists(String id) throws Exception{
        var languages = repository.getAll();
            if (!languages.contains(id)){
                throw new Exception("There is no programming language such as you have entered!");
            }
    }
}
