//Write a java method to print the multiplication table of number n...
public class multiMethod {
    static void  table(int n){
        for(int i=1;i<=10;i++) {
            System.out.printf("%d X %d = %d\n ", n, i, n * i);
        }
    }
    public static void main(String[] args) {
        int x=12;
        table(x);
    }
}
