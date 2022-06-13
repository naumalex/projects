package Lesson9.Homework.Task1;

public class CommandAddContact implements Command{
    @Override
    public void execute(Shop shop) {
        System.out.println("Please enter a phone number");
        EnterData ed = new EnterData();
        System.out.println(shop.addContact(ed.enterString()));
    }
}
