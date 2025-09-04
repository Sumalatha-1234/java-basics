//Create two threads: one prints even numbers, another prints odd numbers up to 20.
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();
    }
}
/*
output:
Even: 2
Even: 4
Even: 6
Even: 8
Even: 10
Even: 12
Even: 14
Even: 16
Even: 18
Even: 20
Odd: 1
Odd: 3
Odd: 5
Odd: 7
Odd: 9
Odd: 11
Odd: 13
Odd: 15
Odd: 17
Odd: 19

 */
