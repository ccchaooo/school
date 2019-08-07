import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.stream.Stream;

/**
 * @author dengchao
 * @date 2019/8/7 0007 17:03
 */
public class Greeting {
    public void doGreeting(String file){
        try (Stream<String> stream = Files.lines(Paths.get(file))) {
            System.out.println("----------begin----------");
            stream.filter(s -> s.contains(LocalDate
                    .now()
                    .toString()
                    .replace("-","/")))
                    .map(new StringService()::string2Employee)
                    .forEach(new Message()::send);
            System.out.println("----------end----------");

        } catch (IOException e) {
            System.out.println("-------------");
        }
    }
}
