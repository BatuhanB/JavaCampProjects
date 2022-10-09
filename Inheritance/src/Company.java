public class Company extends Customer {
    private String companyId;
    private String companyName;

    public Company(long id, String mail, String password, String companyId, String companyName) {
        super(id, mail, password);
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public Company(String companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Company(){

    }
}

