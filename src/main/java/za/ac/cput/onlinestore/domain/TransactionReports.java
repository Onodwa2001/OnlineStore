package za.ac.cput.onlinestore.domain;

// Onodwa Siyotula - 220087016
public class TransactionReports {

    private String reportID, customerID, orderID, productID, paymentID, date;

    public TransactionReports() {

    }

    public TransactionReports(String reportID, String customerID, String orderID, String productID, String paymentID, String date) {
        this.reportID = reportID;
        this.customerID = customerID;
        this.orderID = orderID;
        this.productID = productID;
        this.paymentID = paymentID;
        this.date = date;
    }

    public String getReportID() {
        return reportID;
    }

    public void setReportID(String reportID) {
        this.reportID = reportID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void showTransactions() {
        System.out.println("TransactionReports{" +
                "reportID='" + reportID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", orderID='" + orderID + '\'' +
                ", productID='" + productID + '\'' +
                ", paymentID='" + paymentID + '\'' +
                ", date='" + date + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "TransactionReports{" +
                "reportID='" + reportID + '\'' +
                ", customerID='" + customerID + '\'' +
                ", orderID='" + orderID + '\'' +
                ", productID='" + productID + '\'' +
                ", paymentID='" + paymentID + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
