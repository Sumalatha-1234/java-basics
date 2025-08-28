//Create a class TommyVecetti for Rockstar Games capable of hitting(print hitting..),running,firing etc..
class RockstarGames{
    public void hitting(){
        System.out.println("Hitting...");
    }
    public void running(){
        System.out.println("Running..");
    }
    public void firing(){
        System.out.println("Firing...");
    }
}
public class TommyVecetti {
    public static void main(String[] args) {
        RockstarGames rsg=new RockstarGames();
        rsg.hitting();
        rsg.running();
        rsg.firing();
    }
}
/*
output:
Hitting...
Running..
Firing...
 */