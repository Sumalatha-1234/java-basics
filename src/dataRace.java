//Data race example....
public class dataRace extends Thread{
    public static int x;
    public void run(){
        for(int i=0;i<100;i++){
            x=x+1;
            x=x-1;
        }
    }

    public static void main(String[] args) {
        x=0;
        for(int i=0;i<1000;i++){
            new dataRace().start();
            System.out.println(x);//x not always 0!
        }
    }
}
