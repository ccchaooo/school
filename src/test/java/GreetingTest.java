import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author dengchao
 * @date 2019/8/7 0007 17:06
 */
public class GreetingTest {

    @Test
    public void doGreeting() {
        String path = "C:\\GitRepositories\\greeting\\src\\test\\resources\\record.txt";
        Greeting greeting = new Greeting();
        greeting.doGreeting(path);
    }
}