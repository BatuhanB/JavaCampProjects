package kodlama.io.devs.devs.repository.repositories;

import kodlama.io.devs.devs.model.ProgrammingLanguage;
import kodlama.io.devs.devs.repository.interfaces.ProgrammingLanguageRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    private final List<ProgrammingLanguage> languages;

    public InMemoryProgrammingLanguageRepository() {
        this.languages = new ArrayList<ProgrammingLanguage>();
        var programmingLanguage1 = new ProgrammingLanguage(UUID.randomUUID().toString(),"C#");
        var programmingLanguage2 = new ProgrammingLanguage(UUID.randomUUID().toString(),"Java");
        var programmingLanguage3 = new ProgrammingLanguage(UUID.randomUUID().toString(),"Javascript");
        languages.add(programmingLanguage1);
        languages.add(programmingLanguage2);
        languages.add(programmingLanguage3);
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return languages;
    }

    @Override
    public ProgrammingLanguage getById(String id) {
        for(ProgrammingLanguage language : languages){
            if(language.getId().equals(id)){
                return language;
            }
        }
        return null;
    }

    @Override
    public void insert(ProgrammingLanguage programmingLanguage) {
        languages.add(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        var language = languages.indexOf(getById(programmingLanguage.getId()));
        languages.set(language,programmingLanguage);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        languages.remove(getById(programmingLanguage.getId()));
    }
}
