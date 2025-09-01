//Count Frequency of Each Character in a String
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int[] freq = new int[256];

        for (char c : str.toCharArray()) {
            if (c != ' ')
                freq[c]++;
        }

        System.out.println("Character Frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0)
                System.out.println((char) i + " → " + freq[i]);
        }
    }
}
/*
output:
Enter a string: sumalatha A
Character Frequencies:
a → 4
h → 1
l → 1
m → 1
s → 1
t → 1
u → 1

 */