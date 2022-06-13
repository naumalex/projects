package Lesson9.Homework.Task1;

public class CommandDisplayContacts implements Command{
    @Override
    public void execute(Shop shop) {
        System.out.println("Contacts");
        System.out.println(shop.getContacts());
    }
}
