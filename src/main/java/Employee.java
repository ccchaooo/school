import java.time.LocalDate;
import java.util.Objects;

/**
 * @author dengchao
 * @date 2019/8/7 0007 15:00
 */
public class Employee {
    private String lastName;
    private String firstName;
    private LocalDate birthday;
    private String email;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getLastName().equals(employee.getLastName()) &&
                getFirstName().equals(employee.getFirstName()) &&
                Objects.equals(getBirthday(), employee.getBirthday()) &&
                Objects.equals(getEmail(), employee.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastName(), getFirstName(), getBirthday(), getEmail());
    }
}
