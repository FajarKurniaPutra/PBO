public class Demo {
    public static void main(String[] args) {
        Player p1 = new Player("Hero", -10, 65, 100, 1);
        Monster m1 = new Monster("Ethanol Goblin", -15, 70, 1500, 5, "Hijau");

        System.out.println("Pertarungan dimulai!");
        System.out.println(m1.name + " bersuara: " + m1.MakeNoise());

        m1.TakeDamage(30);
        m1.TakeDamage(25);

        p1.TakeDamage(100);
    }
}