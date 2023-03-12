/**
 * Deliveries.java
 * This is the model or worker class
 * @author Lindiwe Thokozile Somana
 * @student no. 218076509
 * 12 March 2023
 *
 */

package za.ac.cput.onlinestore.domain;

public class Deliveries {
    private String customerId;
    private String productId;
    private String orderId;
    private String deliveryId;
    private String date;

    public Deliveries(){
        deliveryId = "0001";
        customerId = "0001";
        orderId = "73560";
        productId = "000307";
        date = "03-12-2023";

    }

    public Deliveries(String deliveryId, String customerId, String  orderId, String productId, String date){
        this.deliveryId = deliveryId;
        this.customerId = customerId;
        this.orderId = orderId;
        this.productId = productId;
        this.date = date;
    }

    public String getDeliveryId(){
        return deliveryId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public String getDate() {
        return date;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString(){
        return "Deliveries{" +
                "deliveryId=' " + deliveryId + '\'' +
                "customerId=' " + customerId + '\'' +
                "orderId=' " + orderId + '\'' +
                "productId=' " + productId + '\'' +
                "date=' " + date + '\'' +
                '}';
    }

}






