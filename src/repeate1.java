//Repeat 1 using recursion....
public class repeate1{
    static void rept(int n){
       if(n==0){
           return;
       }
        System.out.println("2");
       rept(n-1);
    }

    public static void main(String[] args) {
        int x=2;
        rept(x);
    }
}
