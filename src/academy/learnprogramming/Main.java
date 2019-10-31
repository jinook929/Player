package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health is " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health is " + player.healthRemaining());

        EnhancedPlayer EPlayer = new EnhancedPlayer("Tom", 200, "Ax");
        System.out.println("Initial health is " + EPlayer.getHealth());
    }
}
