//Repeat 4 using recursion....
public class repeate4{
    static void rept(int n){
       if(n==0){
           return;
       }
        System.out.println("4");
       rept(n-1);
    }

    public static void main(String[] args) {
        int x=4;
        rept(x);
    }
}
