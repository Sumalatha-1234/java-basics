//Necessary of nested try-catch example...
public class neccNesTryCatch {
    public static void main(String[] args) {
        int a=args.length;
        int b=42/a;
        //Divide-by-zero exception
        System.out.println("a="+a);
        if(a==1){
            a=a/(a-1);
            //Another divide-by-zero exception
            if(a==2){
                int c[]={ 1 };
                c[2]=99;
                //out-of-bound exception if two arguments
            }
        }
    }
}
/*
output:
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at neccNesTryCatch.main(neccNesTryCatch.java:5)
 */