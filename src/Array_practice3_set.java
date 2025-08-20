public class Array_practice3_set {
    public static void main(String[] args) {
        int[] marks={90,89,78,68,59};
        int sum=0;
        for(int element:marks){
            sum+=element;
        }
        double average=(double)sum/marks.length;
        System.out.println("Average marks in Physics="+average);
    }
}
