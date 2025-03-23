public class OrderTest {
    public static void main(String[] args) {
        Order order = new OrderAction();
        InvoiceGenerator invoiceGenerator = new InvoiceService();
        EmailNotifier emailNotifier = new EmailService();

        OrderHandler orderHandler = new OrderHandler(order, invoiceGenerator, emailNotifier);
        orderHandler.processOrder("John Doe", "123 Main St", 10.0, 2, "order_123.pdf", "johndoe@example.com");
    }
}