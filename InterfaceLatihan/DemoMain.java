public class DemoMain {
    public static void main(String[] args) {
        TV tv = new TV("LED", 20, 5000000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 4000000, "Silver", "LG");
        Kipas kipas = new Kipas("Standing Fan", 300000, "Putih", "Miyako");
        SmartFridge smartFridge = new SmartFridge(10, 2, 8000000, "Putih", "Panasonic");

        System.out.println(tv.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(kipas.getInfo());
        System.out.println(smartFridge.getInfo());
    }
}