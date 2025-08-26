//A simple progeam to change the integer using the MethodOverloading....
public class MetOver1 {
    static void change1(int a){
        a=98;
    }
    static void change2(int[] arr){
        arr[0]=98;
    }
    static void tellJoke(){
        System.out.println("I invented a new world!\n"+"plagarism");
    }

    public static void main(String[] args) {
        tellJoke();
        //case1:changing the integer..
        int[] marks={75,78,79,93,86};
        int x=45;
        change1(x);
        System.out.println("The value of x after running change is="+x);
        //case2:changing the array..
        change2(marks);
        System.out.println("The value of x after runniing change is="+marks[0]);
    }
}
/*
output:
I invented a new world!
plagarism
The value of x after running change is=45
The value of x after runniing change is:98
 */