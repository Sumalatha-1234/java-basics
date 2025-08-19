public class Arrays {
    public static void main(String[] args) {
        //classroom of 500 students you have to store the marks of these students
        /*You have 2 options:
        1.Create 500 variables
        2.use arrays
        and
        1.int[] marks=new int[] (both the declaration and memory allocation
        2.int[] marks (here its first declaration and then allocation)
           marks=new int[]
         3.int[] marks={90,100,79,90,87} (here its declararion,initialization
         and alloction)
          */
        int[] marks=new int[500];
        marks[0]=100;
        marks[1]=90;
        marks[2]=80;
        marks[3]=75;
        marks[4]=70;
        System.out.println(marks[4]);
        System.out.println(marks.length);
    }
}
