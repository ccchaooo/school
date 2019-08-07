/**
 * @author dengchao
 * @date 2019/8/7 0007 15:13
 */
public class GreetingMessageImpl implements Message {
    @Override
    public void send(Employee employee) {
        System.out.printf("Happy birthday,dear %s!",employee.getFirstName());
        System.out.println();
    }
}
