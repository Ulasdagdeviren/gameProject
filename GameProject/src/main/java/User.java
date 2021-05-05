public class User {
    private int id;
    private  String nationalityId;
    private  String firstName;
    private String lastname;
    private  String yearOfBirth;

    public User(int id, String nationalityId, String firstName, String lastname, String yearOfBirth) {
        this.setId(id);
        this.setNationalityId(nationalityId);
        this.setFirstName(firstName);
        this.setLastname(lastname);
        this.setYearOfBirth(yearOfBirth);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
