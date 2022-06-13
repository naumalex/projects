package Lesson9.Homework.Task1;

public class CommandAddProduct implements Command{
    @Override
    public void execute(Shop shop) {
        Product product = new Product();
        EnterData ed = new EnterData();
        String barcode;
        System.out.println("Please enter barcode");
        barcode = ed.enterString();
        System.out.println("Please enter product description");
        product.description = ed.enterString();
        System.out.println("Please enter product price");
        product.price = ed.enterPositiveDouble();
        boolean isProductSuccessfullyAdded = shop.addProduct(barcode, product);
        if (isProductSuccessfullyAdded)
            System.out.println("Product has been successfully added");
        else
            System.out.println("Product has not been added");
    }
}
