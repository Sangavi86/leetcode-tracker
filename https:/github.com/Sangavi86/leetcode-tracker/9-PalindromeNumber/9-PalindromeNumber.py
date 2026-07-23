# Last updated: 7/23/2026, 2:58:00 PM
class Solution:
    def isPalindrome(self, x):
        # Negative numbers and numbers ending with 0 (except 0 itself) are not palindromes
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        
        # Reverse only half of the number
        reversed_half = 0
        while x > reversed_half:
            reversed_half = reversed_half * 10 + x % 10
            x //= 10
        
        # Check if original number is palindrome
        return x == reversed_half or x == reversed_half // 10  # Handles even and odd length cases

# Example test cases (For local testing)
if __name__ == "__main__":
    solution = Solution()
    
    print(solution.isPalindrome(121))  # Output: True
    print(solution.isPalindrome(-121))  # Output: False
    print(solution.isPalindrome(10))  # Output: False
    print(solution.isPalindrome(0))  # Output: True
