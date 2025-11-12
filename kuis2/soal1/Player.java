public class Player extends DamageableObject {
    int score;
    int livesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.livesRemaining = livesRemaining;
        this.score = 0;
    }

    @Override
    public void OnKilled() {
        livesRemaining--;
        System.out.println(name + " mati! Sisa nyawa: " + livesRemaining);
    }
}