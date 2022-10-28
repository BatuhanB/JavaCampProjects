package kodlama.io.devs.devs.repository.interfaces;

import kodlama.io.devs.devs.model.ProgrammingLanguage;

import java.util.List;


public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(String id);
    void insert(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
}
