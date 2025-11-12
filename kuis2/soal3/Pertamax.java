public class Pertamax extends BBM {
    public Pertamax() { super("Pertamax"); }

    double hitungHarga(double liter) { return liter * 13500; }

    @Override
    public void infoKendaraan() {
        System.out.println("Pertamax cocok untuk mobil dan motor performa tinggi.");
    }
}