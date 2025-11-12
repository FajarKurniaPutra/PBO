class Monster extends DamageableObject {
    int threatLevel;
    String color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    public String MakeNoise() {
        return "Aing Maung!";
    }

    @Override
    public void OnKilled() {
        System.out.println(name + " (monster) telah dikalahkan! Level ancaman: " + threatLevel);
    }
}