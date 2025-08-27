//Write a function to find average of a set of numbers passed as arguments..
public class avgNumbers {
    static void avg(int n[]){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i];
        }
        double average=(double)sum/n.length;
        System.out.println("The average of these numbers is:"+average);
    }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        avg(arr);
    }
}
