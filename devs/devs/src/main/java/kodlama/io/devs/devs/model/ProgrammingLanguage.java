package kodlama.io.devs.devs.model;

public class ProgrammingLanguage {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgrammingLanguage() {

    }

    public ProgrammingLanguage(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
