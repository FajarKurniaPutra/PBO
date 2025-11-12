import java.util.Date;

public class MailOrder extends Order implements Trackable {
    String emailCustomer;

    public MailOrder(String orderID, String namaPembeli, Date tanggalOrder, double hargaOrder, String emailCustomer) {
        super(orderID, namaPembeli, tanggalOrder, hargaOrder);
        this.emailCustomer = emailCustomer;
    }

    @Override
    public void confirmOrder() {
        System.out.println("Mail Order dikonfirmasi untuk " + namaPembeli + " melalui email " + emailCustomer);
    }

    @Override
    public void trackOrder() {
        System.out.println("Melacak Mail Order ID " + orderID + " untuk " + namaPembeli);
    }
}