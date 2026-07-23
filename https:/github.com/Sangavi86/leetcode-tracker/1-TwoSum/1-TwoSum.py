# Last updated: 7/23/2026, 2:58:14 PM
class Solution:
    def twoSum(self, nums, target):
        num_map = {}  # Dictionary to store numbers and their indices
        for i, num in enumerate(nums):
            complement = target - num
            if complement in num_map:
                return [num_map[complement], i]  # Return indices of the two numbers
            num_map[num] = i  # Store index of the current number
        return []  # This won't be reached since the problem guarantees a solution

# Example test cases (For local testing)
if __name__ == "__main__":
    solution = Solution()
    
    nums1 = [2, 7, 11, 15]
    target1 = 9
    print(solution.twoSum(nums1, target1))  # Output: [0, 1]

    nums2 = [3, 2, 4]
    target2 = 6
    print(solution.twoSum(nums2, target2))  # Output: [1, 2]

    nums3 = [3, 3]
    target3 = 6
    print(solution.twoSum(nums3, target3))  # Output: [0, 1]
