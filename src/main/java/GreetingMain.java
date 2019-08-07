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
            stream.forEach(System.out::println);
        } catch (IOException e) {
        }

    }
}