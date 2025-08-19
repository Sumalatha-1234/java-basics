public class for_each_loop {
    public static void main(String[] args) {
        int[] marks={90,87,67,69,98};
        /*
           if we want to enter the marks details of the 500 student
           its looks lengthy and tricky to enter like
           marks[0]=90;
           marks[1]=91;
           .....
           therefore we can use this for loop instead
         */
        System.out.println("Priting using the for-loop:");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        //for printing in a reverse order
        System.out.println("Printing using the for loop in a reverse order:");
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        //using the for-each loop
        System.out.println("Printing using the for-each loop:");
        for(int element:marks){
            System.out.println(element);
        }
    }
}
