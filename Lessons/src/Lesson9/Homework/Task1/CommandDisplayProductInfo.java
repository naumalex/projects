package Lesson9.Homework.Task1;

public class CommandDisplayProductInfo implements Command{
    @Override
    public void execute(Shop shop) {
        System.out.println("Please enter barcode");
        EnterData ed = new EnterData();
        String info = shop.getProductInfo(ed.enterString());
        if (!(info == null)) {
            System.out.println(info);
        }
        else
            System.out.println("Could not get product info. " +
                    "Product with the barcode entered is not found.");
    }
}
