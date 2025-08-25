//Run the follwing program with exception handling mechanism..
//Case:Simple try-catch block..
public class withExceptionHandling {
    static int anyFunction(int x,int y){
        try{
            int a=x/y;
            return a;
        }catch(ArithmeticException e){
            System.out.println("Division by zero..");
        }
        return 0;
    }

    public static void main(String[] args) {
        int a,b,result;
        a=0;
        b=0;
        try{
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            System.out.println("Value of a and b "+a+" "+b);
        }catch(Exception e){
            result=anyFunction(a,b);
        }
    }
}
/*Note:
Run this program with the following input:
java withExceptionHandling 1 2 3 //output:Value of a and b 1 2
java withExceptionHandling 10  20 30 40 //output:Value of a and b 10 20
java withExceptionHandling 1.0 2 3.0 40 java //output:Division by zero..(because it is exception case so catch section is excecuted..)
java withExceptionHandling 4.5 5 //output:Division by zero..(because it is exception case so catch section is excecuted..)
 */