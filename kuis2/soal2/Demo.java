import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date now = new Date();

        MailOrder mail = new MailOrder("M001", "Andi", now, 250000, "andi@gmail.com");
        WebOrder web = new WebOrder("W001", "Budi", now, 300000);
        WhatsappOrder wa = new WhatsappOrder("WA001", "Citra", now, 150000, "08123456789");

        mail.confirmOrder();
        mail.trackOrder();

        web.confirmOrder();
        web.trackOrder();

        wa.confirmOrder();
    }
}