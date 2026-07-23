// Last updated: 7/23/2026, 2:57:22 PM
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates, target, 0, new ArrayList<>());
        return ans;
    }

    public void solve(int[] arr, int target, int start, List<Integer> list) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i < arr.length; i++) {

            if (i > start && arr[i] == arr[i - 1])
                continue;

            if (arr[i] > target)
                break;

            list.add(arr[i]);

            solve(arr, target - arr[i], i + 1, list);

            list.remove(list.size() - 1);
        }
    }
}