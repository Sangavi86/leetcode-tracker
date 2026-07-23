// Last updated: 7/23/2026, 2:57:23 PM
import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        bruteForce(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void bruteForce(int[] arr, int target, int index,
                            List<Integer> current, List<List<Integer>> result) {
        
        // Base case
        if (index == arr.length) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        if (arr[index] <= target) {
            current.add(arr[index]);
            bruteForce(arr, target - arr[index], index, current, result); // same index
            current.remove(current.size() - 1);
        }
        bruteForce(arr, target, index + 1, current, result);
    }
}