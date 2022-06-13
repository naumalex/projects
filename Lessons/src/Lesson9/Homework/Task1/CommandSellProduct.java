package Lesson9.Homework.Task1;

public class CommandSellProduct implements Command{
    @Override
    public void execute(Shop shop) {
        System.out.println("Please enter barcode");
        EnterData ed = new EnterData();
        boolean isSuccess = shop.sale(ed.enterString());
        if (isSuccess) {
            System.out.println("The product successfully sold");
        }
        else
            System.out.println("The product has not been sold");
    }
}
