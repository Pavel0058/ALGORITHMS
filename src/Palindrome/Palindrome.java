package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line=sc.nextLine();
        if(Palindrome(line))
            System.out.println(line + " is palindrome.");
        else
            System.out.println(line + " is not palindrome.");
    }

    public static boolean Palindrome(String line) {
        int i = 0, j = line.length() - 1;
        while(i < j) {
            if(line.charAt(i) != line.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
