//Addition of two matrics...
import java.util.Scanner;
public class Array_practice4_set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col=sc.nextInt();
        int[][] matrix1=new int[rows][col];
        int[][] matrix2=new int[rows][col];
        int[][] sum=new int[rows][col];
        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("The sum of two matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Resultant matrix(Sum):");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(sum[i][j]+" ");
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
