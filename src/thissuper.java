//Simple java program of this and super keyboard..
class Ekclass{
    int a;
    public int getA(){
        return a;
    }
    Ekclass(int a){
        this.a=a;
    }
    public int returnone(){
        return 1;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("I am a Doclass constructor...");
    }
}
public class thissuper {
    public static void main(String[] args) {
        Ekclass ek = new Ekclass(65);
        Doclass doo = new Doclass(5);
        System.out.println(ek.getA());
    }
}
/*
output:
I am a Doclass constructor...
65
 */