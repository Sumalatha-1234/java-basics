//Write a program to print the following pattern.
/*
* * * *
* * *
*  *
*
 */
public class pattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>=1;i--){
            //first for loop for how many number of lines..
            for(int j=1;j<=i;j++){
                //second for loop for how many stars in the line..
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
