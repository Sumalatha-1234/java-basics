//create the array of 5 floats and calculate their sum...
public class Array_practice1_set {
    public static void main(String[] args) {
        float[] num={5.7f,3.8f,4.2f,6.9f,8.9f};
        System.out.println("The numbers in the arraylist are:");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println("The sum of the array is:");
        float sum=num[0]+num[1]+num[2]+num[3]+num[4];
        System.out.println(sum);
    }
}
