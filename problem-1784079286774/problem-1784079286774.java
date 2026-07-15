// Last updated: 7/15/2026, 12:34:46 PM
1import java.util.*;
2class Solution {
3    public String simplifyPath(String path) {
4        String[] folders = path.split("/");
5        ArrayList<String> list = new ArrayList<>();
6        for (String folder : folders) {
7            if (folder.equals("") || folder.equals(".")) {
8                continue;
9            }
10            else if (folder.equals("..")) {
11                if (!list.isEmpty()) {
12                    list.remove(list.size() - 1);
13                }
14            }
15            else {
16                list.add(folder);
17            }
18        }
19        if (list.isEmpty()) {
20            return "/";
21        }
22        String ans = "";
23        for (String folder : list) {
24            ans += "/" + folder;
25        }
26        return ans;
27    }
28}