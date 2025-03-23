public interface Order {
    double calculateTotal(double price, int quantity);
    void placeOrder(String customerName, String address);
}