import java.util.Date;

public class WhatsappOrder extends Order {
    String telpPembeli;

    public WhatsappOrder(String orderID, String namaPembeli, Date tanggalOrder, double hargaOrder, String telpPembeli) {
        super(orderID, namaPembeli, tanggalOrder, hargaOrder);
        this.telpPembeli = telpPembeli;
    }

    @Override
    public void confirmOrder() {
        System.out.println("WhatsApp Order dikonfirmasi untuk " + namaPembeli + " via nomor " + telpPembeli);
    }
}