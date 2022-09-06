public class MinecraftPlayer{

    String username;
    int mobKills;
    int currentLifespan;
    boolean dragonKilled;
    int health;

MinecraftPlayer(String n, int h){
        username = n;
        mobKills = 0;
        currentLifespan = 0;
        dragonKilled = false;
        health = h;
    }
}