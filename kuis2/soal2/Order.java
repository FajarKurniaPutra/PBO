import java.util.Date;

abstract class Order {
    String orderID;
    String namaPembeli;
    Date tanggalOrder;
    double hargaOrder;

    public Order(String orderID, String namaPembeli, Date tanggalOrder, double hargaOrder) {
        this.orderID = orderID;
        this.namaPembeli = namaPembeli;
        this.tanggalOrder = tanggalOrder;
        this.hargaOrder = hargaOrder;
    }

    public abstract void confirmOrder();
}
