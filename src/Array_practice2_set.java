//search whether the given array is present or not...
import java.util.Scanner;
public class Array_practice2_set {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] marks={90,80,70,75,85};
        System.out.println("Searh whether the element is present:");
        int num=sc.nextInt();
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
            if(num==marks[i]){
                System.out.println("The element is present...");
                break;
            }
        }
    }
}
