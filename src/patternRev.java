//Write a function to print the following pattern...
/*
* * * *
* * *
* *
*
 */
public class patternRev {
    static void reverse(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int x=4;
        reverse(x);
    }
}
