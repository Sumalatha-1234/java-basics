//Write the simple program for method overloading..
public class MetOver2 {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning "+a+" bro!");
    }
    static void foo(int a,int b){
        System.out.println("Good morning "+a+" bro!");
        System.out.println("Good morning "+b+" bro!");
    }

    public static void main(String[] args) {
        //Method Overloading
        foo();
        foo(3000);
        foo(3000,4000);
    //Arguments are actual..
    }
}
/*
output:
Good morning bro!
Good morning 3000 bro!
Good morning 3000 bro!
Good morning 4000 bro!
 */