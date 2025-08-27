//Write a recursive function to calculate sum of first n natural numbers...
public class recNaturalNumbers {
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
    static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        System.out.println("The sum of a and b is:"+sum(2,3));
        System.out.println("The sum of a,b and c is:"+sum(2,3,4));
        System.out.println("The sum of a,b,c and d is:"+sum(2,3,4,5));
    }
}
