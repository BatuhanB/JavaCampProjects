package kodlama.io.devs.devs.service.interfaces;

import kodlama.io.devs.devs.model.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageServiceInterface {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(String id) throws Exception;
    void insert(ProgrammingLanguage programmingLanguage) throws Exception;
    void update(ProgrammingLanguage programmingLanguage) throws Exception;
    void delete(ProgrammingLanguage programmingLanguage) throws Exception;
}
