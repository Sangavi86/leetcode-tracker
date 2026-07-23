// Last updated: 7/23/2026, 2:56:05 PM
class Solution {
    public boolean isPalindrome(String s) {
        String clear=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse=new StringBuilder(clear).reverse().toString();
        if(clear.equals(reverse))
        {
            System.out.println("is a palindrome.");
            return true;
        }
        else
        {
            System.out.println("is not a palindrome.");
            return false;
        }
    }
}