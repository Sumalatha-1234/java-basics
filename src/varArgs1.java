//Variable arguments using the for each loop...
public class varArgs1 {
    static int sum(int x,int...arr){
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial..");
        System.out.println("The sum of 1 is:"+sum(1));
        System.out.println("The sum of 4 and 5 is:"+sum(4,5));
        System.out.println("The sum of 3,4 and 5 is:"+sum(3,4,5));
        System.out.println("The sum of 2,3,4 and 5 is:"+sum(2,3,4,5));
    }
}
/*
output:
Welcome to varargs tutorial..
The sum of 1 is:1
The sum of 4 and 5 is:9
The sum of 3,4 and 5 is:12
The sum of 2,3,4 and 5 is:14
 */