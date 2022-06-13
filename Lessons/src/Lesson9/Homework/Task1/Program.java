package Lesson9.Homework.Task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {
    Shop shop;
    Scanner sc;
    Program() {

    }
    private static void addProduct(Shop shop) {
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

    public static void main(String[] args) {

        Shop shop = new Shop();
        EnterData ed = new EnterData();
        List<Command> commands = new LinkedList<>();
        commands.add(new CommandAddProduct());
        commands.add(new CommandSellProduct());
        commands.add(new CommandDisplayProductInfo());
        commands.add(new CommandAddContact());
        commands.add(new CommandDisplayContacts());
        int command;
        while (true) {
            System.out.println("Please select command. 0 - Add new product, " +
                    "1 - Sell Product, 2 - Display Product Information, 3 - Add Contact,\n" +
                    "4 - Display Contacts, 5 - Exit.");
            command = ed.enterPositiveInt(5);
            if (command == 5)
                return;
            commands.get(command).execute(shop);
        }

    }
}
