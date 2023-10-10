package DSA;

/*
 Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

Test Case I:
Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

Test Case II:
Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.

Test Case III:
Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
 */


import java.util.*;

public class BuddyStrings{

    private static boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        char a = 'a', b = 'a';
        char[] charCount = new char[26];
        char[] sArr = s.toCharArray();
        char[] gArr = goal.toCharArray();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            charCount[sArr[i] - 'a']++;
            if(sArr[i] != gArr[i]){
                if(count == 0){
                    a = sArr[i];
                    b = gArr[i];
                    count++;
                }else if(a == gArr[i] && b == sArr[i]){
                    count++;
                }else{
                    return false;
                }
            }
        }
        if(count == 0){
            for(int c : charCount){
                if(c > 1) return true;
            }
        }
        return count == 2;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();
        boolean res = buddyStrings(s, goal);
        if(res){
            System.out.println("Strings are Buddy Strings");
        }else{
            System.out.println("Strings are not Buddy Strings");
        }
        sc.close();
    }
}
