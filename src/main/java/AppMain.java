public class AppMain {
    public static void main(String[] args){
        String path = "C:\\GitRepositories\\TestWorkplace\\security-master\\greeting\\src\\main\\resources\\record.txt";
        Greeting greeting = new Greeting();
        greeting.doGreeting(path);
    }
}