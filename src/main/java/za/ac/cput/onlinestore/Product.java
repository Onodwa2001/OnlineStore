package za.ac.cput.onlinestore;

public class Product {
    private String productId ;
    private String name ;
    private double price;
    private int  quantity;

    private int itemsInStock;
    private String imageDescription;

    private Product (){}

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public String getImageDescription() {
        return imageDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", itemsInStock=" + itemsInStock +
                ", description='" + imageDescription + '\'' +
                '}';
    }
}

