/*Order.java
* Author: Byron Young 218155077
* Description - Creating an Order POJO class with contructors ,getters
* 12/03/2023
* */



package za.ac.cput.onlinestore.domain;

public class Order {
    private int orderId;
    private int customerId;
    private int productId;
    private String customerName;
    private String date;

    public Order() {
    }

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerId=" + customerId +
                ", productId=" + productId +
                ", customerName='" + customerName + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

