// Last updated: 7/13/2026, 8:54:10 AM
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