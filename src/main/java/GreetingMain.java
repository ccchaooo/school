import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class GreetingMain {
    public static void main(String[] args){
        String path = "C:\\GitRepositories\\TestWorkplace\\security-master\\greeting\\src\\main\\resources\\record.txt";
        GreetingMain.readTextFile(path);
    }
    static void readTextFile(String file){
        try (Stream<String> stream = Files.lines(Paths.get(file))) {
            System.out.println("----------begin----------");
            String2Object string2Object = new String2Object();
            Message greetingMessage = new GreetingMessageImpl();
            stream.filter(s -> s.contains("2019/08/07")).map(string2Object::getEmployee).forEach(greetingMessage::send);
            System.out.println("----------end----------");

        } catch (IOException e) {
            System.out.println("-------------");
        }
    }
}