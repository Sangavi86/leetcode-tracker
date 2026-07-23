// Last updated: 7/23/2026, 2:57:41 PM
class Solution {

    public List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        solve("", 0, 0, n);
        return ans;
    }

    public void solve(String s, int open, int close, int n) {

        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        if (open < n)
            solve(s + "(", open + 1, close, n);

        if (close < open)
            solve(s + ")", open, close + 1, n);
    }
}