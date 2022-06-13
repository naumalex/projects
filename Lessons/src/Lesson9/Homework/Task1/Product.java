package Lesson9.Homework.Task1;

public class Product {
    public String description;
    public double price;

    public String getInfo() {
        StringBuilder str = new StringBuilder();
        str.append("Description = ").append(description)
                .append(", Price = ").append(price);
        return str.toString();
    }
}
