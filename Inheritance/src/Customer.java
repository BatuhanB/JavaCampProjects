public class Customer {
    private long id;
    private String mail;
    private String password;

    public Customer(long id, String mail, String password) {
        this.id = id;
        this.mail = mail;
        this.password = password;
    }

    public Customer(){

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
