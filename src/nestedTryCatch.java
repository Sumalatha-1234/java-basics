//Remedy with nested try-catch example..
public class nestedTryCatch {
    public static void main(String[] args) {
        try{
            //To cases divide-by-zero
            int a=args.length;
            int b=42/a;
            //divide-by-zero exception
            System.out.println("a="+a);
            if(a==1)
                a=a/(a-a);
            //another divide-by-zero exception
            try{
                //nested try block..
                if(a==2){
                    //if two command-line arguments are used,then an out-of-bound exception
                    int c[]={1};
                    c[2]=99;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out-of-bound:"+e);
            }
        }catch(ArithmeticException e){
            System.out.println("Divide by 0:"+e);
        }
    }
}
/*output:Divide by 0:java.lang.ArithmeticException: / by zero
if command line input is 10 20 then
output:a=2
Array index out-of-bound:java.lang.ArrayIndexOutOfBoundsException:
 Index 2 out of bounds for length 1
 */