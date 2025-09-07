/*write a Java program that determines if two strings are anagrams of each other.
 The program should be case-insensitive and ignore any non-alphabetic characters
(like spaces, punctuation, or numbers).*/
import java.util.Arrays;
public class AnagramChecker {
     public static boolean areAnagrams(String str1, String str2) {
        //Normalize the Strings...
        String normalizedStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String normalizedStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        //Check Length...
        if (normalizedStr1.length() != normalizedStr2.length()) {
            return false;
        }
        //Create frequency array
        int[] charCounts = new int[26];
        //Count and decrement
        for (int i = 0; i < normalizedStr1.length(); i++) {
            charCounts[normalizedStr1.charAt(i) - 'a']++;
            charCounts[normalizedStr2.charAt(i) - 'a']--;
        }
        //Verify..
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Test cases
        String test1_str1 = "listen";
        String test1_str2 = "silent";
        System.out.println("'" + test1_str1 + "' and '" + test1_str2 + "' are anagrams: " + areAnagrams(test1_str1, test1_str2));

        String test2_str1 = "Dormitory";
        String test2_str2 = "dirty room";
        System.out.println("'" + test2_str1 + "' and '" + test2_str2 + "' are anagrams: " + areAnagrams(test2_str1, test2_str2));

        String test3_str1 = "Hello";
        String test3_str2 = "World";
        System.out.println("'" + test3_str1 + "' and '" + test3_str2 + "' are anagrams: " + areAnagrams(test3_str1, test3_str2));

        String test4_str1 = "The eyes";
        String test4_str2 = "they see";
        System.out.println("'" + test4_str1 + "' and '" + test4_str2 + "' are anagrams: " + areAnagrams(test4_str1, test4_str2));
    }
}
/*
output:
'listen' and 'silent' are anagrams: true
'Dormitory' and 'dirty room' are anagrams: true
'Hello' and 'World' are anagrams: false
'The eyes' and 'they see' are anagrams: true
 */

