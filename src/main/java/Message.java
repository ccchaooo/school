/**
 * @author dengchao
 * @date 2019/8/7 0007 15:11
 */
public class Message {
    public void send(Employee employee){
        System.out.println("Subject:Happy birthday!");
        System.out.printf("Happy birthday,dear %s!",employee.getFirstName());
        System.out.println();
    }

}
