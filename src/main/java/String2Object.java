import java.util.Arrays;

/**
 * @author dengchao
 * @date 2019/8/7 0007 15:20
 */
public class String2Object {
    public Employee getEmployee(String s){
        String[] split = s.trim().split(",");
        Employee employee = new Employee();
        employee.setFirstName(split[0]);
        employee.setLastName(split[1]);
        employee.setEmail(split[3]);
        return employee;
    }
}
