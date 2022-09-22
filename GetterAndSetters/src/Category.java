public class Category {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public boolean getIsActive() {
        return IsActive;
    }

    public void setActive(boolean active) {
        IsActive = active;
    }

    private int id;
    private String Name;
    private String CreatedDate;
    private boolean IsActive;
}
