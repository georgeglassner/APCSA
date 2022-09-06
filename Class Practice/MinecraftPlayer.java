public class MinecraftPlayer{

    String username;
    int mobKills;
    int currentLifespan;
    boolean dragonKilled;
    int health;
    int dirtBlocks;

    

MinecraftPlayer(String n, int h, int dirtBlocks){
        username = n;
        mobKills = 0;
        currentLifespan = 0;
        dragonKilled = false;
        health = h;
    }

    void printWelcome(){
        System.out.println("Welcome " + username + ".");
    }
    int getHealth(){
        return health;
    }
    void damagePlayer(MinecraftPlayer other){
        other.damage(5);
    }
    void setHealth(int x){
        health = x;
    }


    int digBlock(int dirtBlocks){
        dirtBlocks ++;
        System.out.println("Steve has " + dirtBlocks + " dirt blocks!");
        return dirtBlocks; 

    }

    int damage(int dmg){
        health = health - dmg;
        System.out.println("Ooof! " + username + ": " + health);
        return health;
    }
}