package Lesson9.Homework.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    Map<String, Product> products;
    List<String> contacts;
    Shop() {
        products = new HashMap<>();
        contacts = new ArrayList<>();
    }
    public boolean addProduct(String barcode, Product product) {
        if (products.containsKey(barcode))
            return false;
        else {
            products.put(barcode, product);
            return true;
        }
    }
    public boolean sale(String barcode) {
        Product product = products.remove(barcode);
        return (product != null);
    }

    public String getProductInfo(String barcode) {
        Product product = products.get(barcode);
        if (product != null)
            return product.getInfo();
        else
            return null;
    }
    public boolean addContact(String phoneNumber) {
        return contacts.add(phoneNumber);
    }
    public String getContacts() {
        StringBuilder str = new StringBuilder();
        for (String contact: contacts) {
            str.append(contact).append('\n');
        }
        return str.toString();
    }

}
