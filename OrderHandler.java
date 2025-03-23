public class OrderHandler {
    private final Order order;
    private final InvoiceGenerator invoiceGenerator;
    private final EmailNotifier emailNotifier;

    public OrderHandler(Order order, InvoiceGenerator invoiceGenerator, EmailNotifier emailNotifier) {
        this.order = order;
        this.invoiceGenerator = invoiceGenerator;
        this.emailNotifier = emailNotifier;
    }

    public void processOrder(String customerName, String address, double price, int quantity, String fileName, String email) {
        double total = order.calculateTotal(price, quantity);
        System.out.println("Order total: $" + total);
        order.placeOrder(customerName, address);

        if (invoiceGenerator != null) {
            invoiceGenerator.generateInvoice(fileName);
        }

        if (emailNotifier != null) {
            emailNotifier.sendEmailNotification(email);
        }
    }
}
