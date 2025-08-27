/*
Write the program using the function to print the following pattern....
*
* *
* * *
* * * *
 */
public class patternfun {
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x=4;
        pattern(x);
    }
}
