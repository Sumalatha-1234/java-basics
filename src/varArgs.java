//Program using the variable arguments..
public class varArgs {
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
        System.out.println("Welcome to varargs tutorial..");
        System.out.println("The sum of 4 and 5 is:"+sum(4,5));
        System.out.println("The sum of 4,3 nad 5 is:"+sum(4,3,5));
        System.out.println("The sum of 2,4,3 nd 5 is:"+sum(2,4,3,5));
    }
}
/*
output:
Welcome to varargs tutorial..
The sum of 4 and 5 is:9
The sum of 4,3 nad 5 is:12
The sum of 2,4,3 nd 5 is:14
 */