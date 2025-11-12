import java.util.Date;

public class WebOrder extends Order implements Trackable {
    public WebOrder(String orderID, String namaPembeli, Date tanggalOrder, double hargaOrder) {
        super(orderID, namaPembeli, tanggalOrder, hargaOrder);
    }

    @Override
    public void confirmOrder() {
        System.out.println("Web Order " + orderID + " dikonfirmasi untuk " + namaPembeli);
    }

    @Override
    public void trackOrder() {
        System.out.println("Status Web Order " + orderID + " sedang diproses di sistem.");
    }
}