import java.io.Console;
public class Hello {
    static String name = "";
    public static void main(String[] args) {
        String name;
        Console con = System.console();
        name = con.readLine("Please, enter your name ");
        System.out.println("Welcome to Java, " + name);
    }
}
